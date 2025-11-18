package Tutorialsninja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;

public class TC_001 extends BaseClass {

	@Test
	public void registerWithFields() {

		getDriver().get("https://tutorialsninja.com/demo/");

		getDriver().findElement(By.xpath("//span[text()='My Account']")).click();

		getDriver().findElement(By.linkText("Register")).click();
		getDriver().findElement(By.id("input-firstname")).sendKeys("Ashok");
		getDriver().findElement(By.id("input-lastname")).sendKeys("Tester");
		getDriver().findElement(By.id("input-email")).sendKeys("ashok" + System.currentTimeMillis() + "@mail.com");
		getDriver().findElement(By.id("input-telephone")).sendKeys("9876543210");
		getDriver().findElement(By.id("input-password")).sendKeys("test123");
		getDriver().findElement(By.id("input-confirm")).sendKeys("test123");

		getDriver().findElement(By.xpath("//input[@name='agree']")).click();
		getDriver().findElement(By.xpath("//input[@value='Continue']")).click();
		
		getDriver().findElement(By.xpath("//a[text()=\"Continue\"]"));
		String msg="Your Account Has Been Created!";
		String acutl=getDriver().findElement(By.xpath("//div[@id=\"content\"]/h1")).getText();
		Assert.assertEquals(msg,acutl,"account varified...");
		
		getDriver().findElement(By.xpath("//*[@id=\"column-right\"]/div/a[1]")).click();
		System.out.println("Acccount added sucessfully Done with details");

	}

}
