package Tutorialsninja;

import Base.BaseClass;
import Base.ExtentManager;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class TC_001 extends BaseClass {

    ExtentReports extent;
    ExtentTest test;

    @BeforeClass
    public void setupReport() {
        extent = ExtentManager.createInstance(System.getProperty("user.dir") + "/test-output/ExtentReport.html");
        test = extent.createTest("TC_001 - Register Test");
    }

    @Test
    public void registerWithFields() {
        test.info("Opening Tutorialsninja Demo Website");
        getDriver().get("https://tutorialsninja.com/demo/");

        test.info("Clicking on 'My Account'");
        getDriver().findElement(By.xpath("//span[text()='My Account']")).click();

        test.info("Clicking on 'Register'");
        getDriver().findElement(By.linkText("Register")).click();

        test.pass("Navigated to Register page successfully");
    }

    @AfterClass
    public void tearDownReport() {
        extent.flush();
    }
}
