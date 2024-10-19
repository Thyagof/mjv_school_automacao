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
        demonstrationPage.clickBtnLogin();
    }

    @Then("deve ser redirecionado para o formulário de login")
    public void deveSerRedirecionadoParaOFormularioDeLogin() {
        demonstrationPage.checarAbaDeRedirecionamento("Login");
    }
    @After
    public void fecharDriver(){
        driver.quit();
    }
}
