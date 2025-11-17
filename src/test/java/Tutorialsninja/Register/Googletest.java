package Tutorialsninja.Register;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Base.WebdriverSettings;

public class Googletest extends WebdriverSettings {
	@Test
	public void goodTest()
	{
	
			System.out.println("google test");
			
			driver =new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.findElement(By.xpath("//*[@id=\"gb\"]/div[3]/a")).click();
			driver.close();
			
			
			
	}

}
