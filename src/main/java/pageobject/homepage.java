package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage extends BasePage {
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a") 
	private WebElement woman;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a") 
	private WebElement dresses;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[3]/a") 
	private WebElement tshirts;
	
	@FindBy(xpath="//*[@id=\'newsletter_block_left\']")
	private WebElement newsletter;
	
	@FindBy(xpath="//*[@id=\'newsletter_block_left\']/div/form/div/button")
	private WebElement newsletterclick;
	
	@FindBy(xpath="//*[@id=\"columns\"]/p")
	private WebElement alertmessage;
	public homepage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getwomen() {
		return woman;
	}
	public WebElement getdresses() {
		return dresses;
	}
	public WebElement gettshirts() {
		return tshirts;
	}
	
	public WebElement getnewsletter() {
		return newsletter;
		
	}
	public WebElement getnewsletterclick() {
		return newsletterclick;
	}
	public WebElement getalertmessage() {
		return alertmessage;
	}
	
}

