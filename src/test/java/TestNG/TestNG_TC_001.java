package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;

@Test
class TestNG_TC_001 extends BaseClass {
	public void testNG_001_Test() {
		getDriver().get("https://www.toolsqa.com");

		String testTitle = "Tools QA";
		String originalTitle = getDriver().getTitle();
		Assert.assertEquals(originalTitle, testTitle);

	}

}