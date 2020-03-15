package testpage;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.BasePage;
import pageobject.Productpage;
import pageobject.homepage;

public class Productpagetest {
	BasePage bp;
	homepage hp;
	Productpage pp;
	
	public Productpagetest() {
		bp=new BasePage();
		hp=new homepage();
		pp=new Productpage();
	}
	@Test
	public void VerifySize() {
		hp.getdresses().click();
		pp.getSize_S().click();
		Assert.assertTrue(pp.getSize_S().isDisplayed());
		pp.getSize_M().click();
		Assert.assertTrue(pp.getSize_M().isDisplayed());
		pp.getSize_L().click();
		Assert.assertTrue(pp.getSize_L().isDisplayed());
	}
	
	@Test
	public void VerifyProductCount() {
		hp.getdresses().click();
		int i=pp.getShowingCount().size();
		String a=Integer.toString(i);
		System.out.println(a);
		String count=pp.getProductCount().getText();
		System.out.println(count);
	}
	@Test
	public void VerifyTweetandShare() {
		hp.getdresses().click();
		pp.getPrintedDress().click();
		Assert.assertTrue(pp.getTweet().isDisplayed());
		Assert.assertTrue(pp.getShare().isDisplayed());
	}
	@Test
	public void VerifyAddedtoCart() {
		hp.getdresses().click();
		pp.getPrintedDress().click();
		pp.getAddCart().click();
		pp.getClose().click();
		//String a=pp.getAddedMessage().getAttribute("1");
		//System.out.println(a);
		}
	
	@Test
	public void VerifyDescription() {
		hp.getdresses().click();
		pp.getPrintedDress().click();
		String b=pp.getDescription().getText();
		Assert.assertTrue(b.contains("100% cotton double printed dress"),"Failed to display");
	}
}


