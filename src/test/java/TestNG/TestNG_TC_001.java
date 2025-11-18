package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;

@Test
class TestNG_TC_001 extends BaseClass {
	public void testNG_001_Test() {
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		getDriver().get("https://demoqa.com/");
		getDriver().manage().window().maximize();
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		getDriver().findElement(By.xpath("//h5[text()=\"Elements\"]")).click();
		getDriver().findElement(By.xpath("//span[text()='Text Box']")).click();

		// userName
		getDriver().findElement(By.id("userName")).sendKeys("abc");
		// userEmail
		getDriver().findElement(By.id("userEmail")).sendKeys("abc@gmail.com");
		// currentAddress
		getDriver().findElement(By.id("currentAddress")).sendKeys("bavdhan pune");
		// permanentAddress
		getDriver().findElement(By.id("permanentAddress")).sendKeys("bavdhan pune");
		// submit

	
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		getDriver().findElement(By.id("submit")).click();

		String out = getDriver().findElement(By.id("output")).getText();
		System.out.println(out);

	}

}