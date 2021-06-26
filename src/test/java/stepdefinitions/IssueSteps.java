package stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.IssuePage;
import pageobjects.LoginPage;

public class IssueSteps {

	WebDriver driver;

	@Quando("^um usuario logar no sistema \"([^\"]*)\", \"([^\"]*)\"$")
	public void um_usuario_logar_no_sistema(String arg1, String arg2) throws Throwable {
		Hooks.abrirUrl("https://mantis-prova.base2.com.br/login_page.php");
		driver = Hooks.getDriver();

		LoginPage lp = new LoginPage(driver);
		lp.preencherUserName(arg1);
		lp.preencherSenha(arg2);
		lp.clicarBtnLogin();
	}

	@Quando("^clicar no link report issue$")
	public void clicar_no_link_report_issue() throws Throwable {
		IssuePage ip = new IssuePage(driver);
		ip.reportarIssue();
	}

	@Quando("^selecionar o projeto do usuario logado \"([^\"]*)\"$")
	public void selecionar_o_projeto_do_usuario_logado(String arg1) throws Throwable {
		IssuePage ip = new IssuePage(driver);
		String usuarioFormatado = ip.dadosUsuario();
		ip.selecionaProjeto(usuarioFormatado);

	}

	@Quando("^clicar no botao select project$")
	public void clicar_no_botao_select_project() throws Throwable {
		IssuePage ip = new IssuePage(driver);
		ip.clicarBtnSelectProject();
	}

	@Quando("^selecionar a categoria do proteto \"([^\"]*)\"$")
	public void selecionar_a_categoria_do_proteto(String arg1) throws Throwable {
		IssuePage ip = new IssuePage(driver);
		ip.selecionaCategoriaProjeto(arg1);
	}

	@Quando("^informar um titulo \"([^\"]*)\"$")
	public void informar_um_titulo(String arg1) throws Throwable {
		IssuePage ip = new IssuePage(driver);
		ip.preencheSumario(arg1);
	}

	@Quando("^informar uma descricao \"([^\"]*)\"$")
	public void informar_uma_descricao(String arg1) throws Throwable {
		IssuePage ip = new IssuePage(driver);
		ip.preencheDescricao(arg1);
	}

	@Quando("^clicar no botao submit report$")
	public void clicar_no_botao_submit_report() throws Throwable {
		IssuePage ip = new IssuePage(driver);
		ip.clicarBtnSubmitReport();
	}

	@Entao("^um issue deve ser cadastrado$")
	public void um_issue_deve_ser_cadastrado() throws Throwable {
		IssuePage ip = new IssuePage(driver);
		ip.validarReportIssue();
	}

}