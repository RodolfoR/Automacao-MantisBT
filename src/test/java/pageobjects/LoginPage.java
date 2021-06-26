package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.Util;

public class LoginPage {

	Util util = new Util();

	protected WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.NAME, using = "username")
	private WebElement username;

	@FindBy(how = How.NAME, using = "password")
	private WebElement password;

	@FindBy(how = How.CSS, using = "input[value='Login']")
	private WebElement btnLogin;
	
	@FindBy(how = How.XPATH, using = "//span[contains(@class,'italic')]")
	private WebElement usuarioLogado;
	
	@FindBy(how = How.XPATH, using = "//*[@color='red']")
	private WebElement usuarioInvalido;

	public void preencherUserName(String usuario) {
		util.esperarElemento(username);
		username.sendKeys(usuario);
	}

	public void preencherSenha(String senha) {
		util.esperarElemento(password);
		password.sendKeys(senha);
	}

	public void clicarBtnLogin() {
		util.esperarElemento(btnLogin);
		btnLogin.click();
	}

	public void validarLogin() {
		util.esperarElemento(usuarioLogado);
		System.out.println("Usuario Logado: " + usuarioLogado.getText());
	}

	public void validarLoginInvalido() {
		util.esperarElemento(usuarioInvalido);
		Assert.assertNotNull("Dados do usuário incorretos ou não existe.", usuarioInvalido);
		Assert.assertEquals(
				"Your account may be disabled or blocked or the username/password you entered is incorrect.",
				usuarioInvalido.getText());
	}
}
