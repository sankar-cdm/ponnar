package testpage;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.BasePage;
import pageobject.homepage;

public class homepagetest {

	homepage hp;
	BasePage bp;
	
	public homepagetest() {
		hp=new homepage();
		bp=new BasePage();
		
	}
	
	@Test()
	public void verifywomentab() {
		Assert.assertTrue(hp.getwomen().isDisplayed(), "failed");
		hp.getwomen().click();
		
	}
	@Test()
	public void verifydressestab() {
		Assert.assertTrue(hp.getdresses().isDisplayed(), "dresses tab failed to open");
		hp.getwomen().click();
	}
	@Test()
	public void verifytshirtstab() {
		Assert.assertTrue(hp.gettshirts().isDisplayed(), "tshirt tab failed to open");
		hp.getwomen().click();
	}
	@Test()
	public void verifynewsletter() {
		hp.getnewsletter().sendKeys("sps@gmail.com");
		hp.getnewsletterclick().click();
		//Assert.assertTrue(hp.getnewsletter().isDisplayed());
	}
	
}
