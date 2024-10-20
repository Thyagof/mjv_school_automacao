package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import pages.DemonstrationPage;

public class DemonstrationSteps {
    private WebDriver driver;
    private DemonstrationPage demonstrationPage;

    @Before
    public void iniciarDriver(){
        //System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/msedgedriver.exe");
        //driver = new ChromeDriver();
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");
        //options.addArguments("--headless=new");
        driver = new EdgeDriver(options);
        demonstrationPage = new DemonstrationPage(driver);
    }

    @After
    public void fecharDriver(){
        driver.quit();
    }

    @Given("que o usuário esteja na página PHPTRAVELS")
    public void queOUsuarioEstejaNaPaginaPHPTRAVELS() {
        demonstrationPage.acessarSite();
    }

    @When("visualizar o campo FIRST NAME")
    public void visualizarOCampoFIRSTNAME() {
        demonstrationPage.validarExibFirstName();
    }

    @Then("digita seu nome no campo FIRST NAME")
    public void digitaSeuNomeNoCampoFIRSTNAME() {
        demonstrationPage.digitarFirstName("Leo");
    }

    @When("clicar no botão de Login")
    public void clicarNoBotaoDeLogin() {
        demonstrationPage.clickNoElemento(demonstrationPage.btnLogin);
    }

    @Then("deve ser redirecionado para o formulário de login")
    public void deveSerRedirecionadoParaOFormularioDeLogin() {
        demonstrationPage.validarRedirecionamento("https://app.phptravels.com/login");
    }

    @Then("o botão Login deve estar visível")
    public void oBotaoLoginDeveEstarVisivel() {
        demonstrationPage.validarVisibilidadeDoElemento(demonstrationPage.btnLogin);
    }

    @Then("o texto do botão Login deve estar correto")
    public void oTextoDoBotaoLoginDeveEstarCorreto() {
        demonstrationPage.validarTextoDoElemento(demonstrationPage.btnLogin, "Login");
    }

    @Then("a cor do botão Login deve estar correta")
    public void aCorDoBotaoLoginDeveEstarCorreta() {
        demonstrationPage.validarACorDoElemento(demonstrationPage.btnLogin, "rgb(0, 82, 231)");
    }

    @When("der hover no botão Login")
    public void derHoverNoBotaoLogin() {
        demonstrationPage.hoverNoElemento(demonstrationPage.btnLogin);
    }

    @Then("a cor do botão em hover Login deve estar correta")
    public void aCorDoBotaoEmHoverLoginDeveEstarCorreta() {
        demonstrationPage.validarACorDoElemento(demonstrationPage.btnLogin, "rgb(0, 94, 255)");
    }

    @Then("o botão Sign Up deve estar visível")
    public void oBotaoSignUpDeveEstarVisivel() {
        demonstrationPage.validarVisibilidadeDoElemento(demonstrationPage.btnSignUp);
    }

    @Then("o texto do botão Sign Up deve estar correto")
    public void oTextoDoBotaoSignUpDeveEstarCorreto() {
        demonstrationPage.validarTextoDoElemento(demonstrationPage.btnSignUp, "Sign Up");
    }

    @Then("a cor do botão Sign Up deve estar correta")
    public void aCorDoBotaoSignUpDeveEstarCorreta() {
        demonstrationPage.validarACorDoElemento(demonstrationPage.btnSignUp, "rgb(248, 249, 250)");
    }

    @When("der hover no botão Sign Up")
    public void derHoverNoBotaoSignUp() {
        demonstrationPage.hoverNoElemento(demonstrationPage.btnSignUp);
    }

    @Then("a cor do botão em hover Sign Up deve estar correta")
    public void aCorDoBotaoEmHoverSignUpDeveEstarCorreta() {
        demonstrationPage.validarACorDoElemento(demonstrationPage.btnSignUp, "rgb(211, 212, 213)");
    }

    @When("clicar no botão de Sign Up")
    public void clicarNoBotaoDeSignUp() {
        demonstrationPage.clickNoElemento(demonstrationPage.btnSignUp);
    }

    @Then("deve ser redirecionado para o formulário de Sign Up")
    public void deveSerRedirecionadoParaOFormularioDeSignUp() {
        demonstrationPage.validarRedirecionamento("https://app.phptravels.com/signup");
    }

    @Then("o texto do Item de Navegação Product deve estar correto")
    public void oTextoDoItemDeNavegacaoProductDeveEstarCorreto() {
        demonstrationPage.validarTextoDoElemento(demonstrationPage.navItemProduct, "Product");
    }

    @When("clicar no Item de Navegação Product")
    public void clicarNoItemDeNavegacaoProduct() {
        demonstrationPage.clickNoElemento(demonstrationPage.navItemProduct);
    }

    @Then("o menu dropdown correspondente deve ser exibido")
    public void oMenuDropdownCorrespondenteDeveSerExibido() {
        demonstrationPage.validarVisibilidadeDoElemento(demonstrationPage.dropDownMenuOpened);
    }

    @Then("o texto do item Themes do menu dropdown deve estar correto")
    public void oTextoDoItemThemesDoMenuDropdownDeveEstarCorreto() {
        demonstrationPage.validarTextoDoElemento(demonstrationPage.dropDownItemThemes, "Themes");
    }

    @And("der hover no item Themes")
    public void derHoverNoItemThemes() {
        demonstrationPage.hoverNoElemento(demonstrationPage.dropDownItemThemes);
    }

    @Then("a cor do item Themes do menu dropdown deve estar correto")
    public void aCorDoItemThemesDoMenuDropdownDeveEstarCorreto() {
        demonstrationPage.validarACorDoElemento(demonstrationPage.dropDownItemThemes, "rgb(248, 249, 250)");
    }

    @And("clicar no Item Themes do dropdown Product")
    public void clicarNoItemThemesDoDropdownProduct() {
        demonstrationPage.clickNoElemento(demonstrationPage.dropDownItemThemes);
    }

    @Then("deve ser redirecionado para a página correta")
    public void deveSerRedirecionadoParaAPaginaCorreta() {
        demonstrationPage.validarRedirecionamento("https://phptravels.com/themes");
    }
}
