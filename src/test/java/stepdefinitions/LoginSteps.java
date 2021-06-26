package stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.LoginPage;

public class LoginSteps {
	
	WebDriver driver;
	
	@Dado("^que o usuario esta na pagina de login do mantisBT$")
	public void que_o_usuario_esta_na_pagina_de_login_do_mantisBT() throws Throwable {
		Hooks.abrirUrl("https://mantis-prova.base2.com.br/login_page.php");
		driver = Hooks.getDriver();
	}

	@Quando("^informo o usuario \"([^\"]*)\"$")
	public void informo_o_usuario(String arg1) throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.preencherUserName(arg1);
	}

	@Quando("^informo a senha \"([^\"]*)\"$")
	public void informo_a_senha(String arg1) throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.preencherSenha(arg1);
	}
	
	@Quando("^clicar no botao de login$")
	public void clicar_no_botao_de_login() throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.clicarBtnLogin();
	}
	
	@Entao("^deve confirmar tentativa de login de status \"([^\"]*)\"$")
	public void deve_confirmar_tentativa_de_login_de_status(String arg1) throws Throwable {
		LoginPage lp = new LoginPage(driver);
		
		if(arg1.equals("OK")) {
			lp.validarLogin();
		}else {
			lp.validarLoginInvalido();
		}
	}
	
}
