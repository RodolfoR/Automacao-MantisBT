package stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.LoginPage;
import pageobjects.LogoutPage;

public class LogoutSteps {
	WebDriver driver;
	
	@Dado("^um usuario logado no sistema$")
	public void um_usuario_logado_no_sistema() throws Throwable {
		Hooks.abrirUrl("https://mantis-prova.base2.com.br/login_page.php");
		driver = Hooks.getDriver();
	}

	@Quando("^estiver logado com o usuario \"([^\"]*)\"$")
	public void estiver_logado_com_o_usuario(String arg1) throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.preencherUserName(arg1);
	}

	@Quando("^e senha \"([^\"]*)\"$")
	public void e_senha(String arg1) throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.preencherSenha(arg1);
	}

	@Quando("^clicar no botao Login$")
	public void clicar_no_botao_Login() throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.clicarBtnLogin();
	}

	@Quando("^estiver logado no sistema$")
	public void estiver_logado_no_sistema() throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.validarLogin();
	}

	@Entao("^devo sair do sistema quando clicar no link logout$")
	public void devo_sair_do_sistema_quando_clicar_no_link_logout() throws Throwable {
	    LogoutPage out = new LogoutPage(driver);
	    out.realizarLogout();
	}


}
