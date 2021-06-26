package stepdefinitions;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utils.Util;

public class StepDefinition {
	
	protected WebDriver driver;
	
	@FindBy(how = How.NAME, using = "username")
	private WebElement username;

	@FindBy(how = How.NAME, using = "password")
	private WebElement password;

	@FindBy(how = How.CSS, using = "input[value='Login']")
	private WebElement btnLogin;
	
	//@BeforeClass
	public  void realizarlogin(Util util) {
		util.esperarElemento(username);
		util.esperarElemento(password);
		util.esperarElemento(btnLogin);
		
		username.sendKeys("rodolfo.rocha");
		password.sendKeys("Auto#Mantis#Sel");
		btnLogin.click();
	}
	
}
