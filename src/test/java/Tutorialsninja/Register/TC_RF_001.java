package Tutorialsninja.Register;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.WebdriverSettings;

public class TC_RF_001 extends WebdriverSettings {

    @Test
    public void registerWithFields() {

        driver.get("https://tutorialsninja.com/demo/");
        
        driver.manage().window().maximize();
        System.out.println("Registration test running...");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='My Account']")));
	WebElement element = driver.findElement(By.xpath("//span[text()='My Account']"));
	element.click();

  

        // Example test steps (Add yours here)
        	
       // driver.findElement(By.xpath("//span[text()='My Account']")).click();
        driver.findElement(By.linkText("Register")).click();

        driver.findElement(By.id("input-firstname")).sendKeys("Ashok");
        driver.findElement(By.id("input-lastname")).sendKeys("Tester");
        driver.findElement(By.id("input-email")).sendKeys("ashok" + System.currentTimeMillis() + "@gmail.com");
        driver.findElement(By.id("input-telephone")).sendKeys("9876543210");
        driver.findElement(By.id("input-password")).sendKeys("Password123");
        driver.findElement(By.id("input-confirm")).sendKeys("Password123");

        driver.findElement(By.name("agree")).click();
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

        // Verify registration success
        String heading = driver.findElement(By.cssSelector("#content h1")).getText();
        Assert.assertEquals(heading, "Your Account Has Been Created!", "Registration failed!");
    }
}
