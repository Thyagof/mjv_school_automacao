package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.DemonstrationPage;

public class DemonstrationSteps {
    private WebDriver driver;
    private DemonstrationPage demonstrationPage;

    @Before
    public void iniciarDriver(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
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

    @When("o usuário clicar no botão de Login")
    public void oUsuarioClicarNoBotaoDeLogin() {
        demonstrationPage.clickBtn(demonstrationPage.btnLogin);
    }

    @Then("deve ser redirecionado para o formulário de login")
    public void deveSerRedirecionadoParaOFormularioDeLogin() {
        demonstrationPage.checarRedirecionamento("https://app.phptravels.com/login");
    }

    @Then("o botão Login deve estar visível")
    public void oBotaoLoginDeveEstarVisivel() {
        demonstrationPage.checarVisibilidadeDoElemento(demonstrationPage.btnLogin);
    }

    @Then("o texto do botão Login deve estar correto")
    public void oTextoDoBotaoLoginDeveEstarCorreto() {
        demonstrationPage.checarTextoDoElemento(demonstrationPage.btnLogin, "Login");
    }

    @Then("a cor do botão Login deve estar correta")
    public void aCorDoBotaoLoginDeveEstarCorreta() {
        demonstrationPage.validarACorDoElemento(demonstrationPage.btnLogin, "rgb(0, 82, 231)");
    }

    @When("o usuário der hover no botão Login")
    public void oUsuarioDerHoverNoBotaoLogin() {
        demonstrationPage.hoverNoElemento(demonstrationPage.btnLogin);
    }

    @Then("a cor do botão em hover Login deve estar correta")
    public void aCorDoBotaoEmHoverLoginDeveEstarCorreta() {
        demonstrationPage.validarACorDoElemento(demonstrationPage.btnLogin, "rgb(0, 94, 255)");
    }

    @Then("o botão Sign Up deve estar visível")
    public void oBotaoSignUpDeveEstarVisivel() {
        demonstrationPage.checarVisibilidadeDoElemento(demonstrationPage.btnSignUp);
    }

    @Then("o texto do botão Sign Up deve estar correto")
    public void oTextoDoBotaoSignUpDeveEstarCorreto() {
        demonstrationPage.checarTextoDoElemento(demonstrationPage.btnSignUp, "Sign Up");
    }

    @Then("a cor do botão Sign Up deve estar correta")
    public void aCorDoBotaoSignUpDeveEstarCorreta() {
        demonstrationPage.validarACorDoElemento(demonstrationPage.btnSignUp, "rgb(248, 249, 250)");
    }

    @When("o usuário der hover no botão Sign Up")
    public void oUsuarioDerHoverNoBotaoSignUp() {
        demonstrationPage.hoverNoElemento(demonstrationPage.btnSignUp);
    }

    @Then("a cor do botão em hover Sign Up deve estar correta")
    public void aCorDoBotaoEmHoverSignUpDeveEstarCorreta() {
        demonstrationPage.validarACorDoElemento(demonstrationPage.btnSignUp, "rgb(211, 212, 213)");
    }

    @When("o usuário clicar no botão de Sign Up")
    public void oUsuarioClicarNoBotaoDeSignUp() {
        demonstrationPage.clickBtn(demonstrationPage.btnSignUp);
    }

    @Then("deve ser redirecionado para o formulário de Sign Up")
    public void deveSerRedirecionadoParaOFormularioDeSignUp() {
        demonstrationPage.checarRedirecionamento("https://app.phptravels.com/signup");
    }
}
