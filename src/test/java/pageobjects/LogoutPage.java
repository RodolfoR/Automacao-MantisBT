package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.Util;

public class LogoutPage {
	
	Util util = new Util();

	protected WebDriver driver;

	public LogoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.LINK_TEXT, using = "Logout")
	private WebElement logout;
	
	public void realizarLogout() {
		util.esperarElemento(logout);
		logout.click();
		
	}
}
