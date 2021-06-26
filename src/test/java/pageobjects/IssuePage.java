package pageobjects;

import org.apache.commons.lang.StringUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.Util;

public class IssuePage {

	Util util = new Util();

	protected WebDriver driver;

	public IssuePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.LINK_TEXT, using = "Report Issue")
	private WebElement linkReportIssue;

	@FindBy(how = How.XPATH, using = "//span[contains(@class,'italic')]")
	private WebElement usuarioLogado;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/form/table/tbody/tr[2]/td[2]/select")
	private WebElement comboboxProjeto;

	@FindBy(how = How.CSS, using = "input[value='Select Project']")
	private WebElement btnSelectProject;

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/form/table/tbody/tr[2]/td[2]/select")
	private WebElement comboboxCategory;

	@FindBy(how = How.NAME, using = "summary")
	private WebElement summary;

	@FindBy(how = How.NAME, using = "description")
	private WebElement description;

	@FindBy(how = How.CSS, using = "input[value='Submit Report']")
	private WebElement btnSubmitReport;

	@FindBy(how = How.XPATH, using = "//*[@id=\"buglist\"]/tbody/tr[1]/td/span[1]")
	private WebElement tabelaDeIssues;

	// clicar no link
	public void reportarIssue() {
		util.esperarElemento(linkReportIssue);
		linkReportIssue.click();
	}

	// recupera os dados do usuario logado
	public String dadosUsuario() {
		util.esperarElemento(usuarioLogado);
		String usuario = usuarioLogado.getText().replaceAll("\\.", " ");
		String usuarioFormatado = StringUtils.capitalize(usuario);
		return usuarioFormatado + "'s Project";
	}

	// seleciona o projeto
	public void selecionaProjeto(String projetoUsuario) {
		util.esperarElemento(comboboxProjeto);
		Select selectCombo = new Select(comboboxProjeto);
		selectCombo.selectByVisibleText("Rodolfo Rocha's Project");
	}

	// clicar no botão para selecionar o projeto
	public void clicarBtnSelectProject() {
		util.esperarElemento(btnSelectProject);
		btnSelectProject.click();
	}

	// seleciona a categoria do projeto
	public void selecionaCategoriaProjeto(String categoriaProjeto) {
		util.esperarElemento(comboboxCategory);
		Select selectCombo = new Select(comboboxCategory);
		selectCombo.selectByVisibleText(categoriaProjeto);
	}

	public void preencheSumario(String titulo) {
		util.esperarElemento(summary);
		summary.sendKeys(titulo);
	}

	public void preencheDescricao(String descricao) {
		util.esperarElemento(description);
		description.sendKeys(descricao);
	}

	public void clicarBtnSubmitReport() {
		util.esperarElemento(btnSubmitReport);
		btnSubmitReport.click();
	}

	public void validarReportIssue() {
		util.esperarElemento(tabelaDeIssues);
		Assert.assertEquals("Viewing Issues", tabelaDeIssues.getText().substring(0, 14));
	}

}
