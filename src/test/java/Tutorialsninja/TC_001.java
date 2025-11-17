package Tutorialsninja;
import Base.BaseClass;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_001 extends BaseClass {

  
        @Test
        public void registerWithFields() {

        	 getDriver().get("https://tutorialsninja.com/demo/");
        	 getDriver().findElement(By.xpath("//span[text()='My Account']")).click();
        	// getDriver().findElement(By.linkText("Register")).click();  	
        	 
        }

    
}
