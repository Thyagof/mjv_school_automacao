package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import pages.DemonstrationPage;

public class DemonstrationSteps {
    private WebDriver driver;
    private DemonstrationPage demonstrationPage;

    @Before
    public void iniciarDriver(){
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/msedgedriver.exe");
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");
//        options.addArguments("--headless=new");
        driver = new EdgeDriver(options);
//        driver = new ChromeDriver(options);
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
        demonstrationPage.validarACorDeAtributo(demonstrationPage.btnLogin, "background-color", "rgb(0, 82, 231)");
    }

    @When("der hover no botão Login")
    public void derHoverNoBotaoLogin() {
        demonstrationPage.hoverNoElemento(demonstrationPage.btnLogin);
    }

    @Then("a cor do botão em hover Login deve estar correta")
    public void aCorDoBotaoEmHoverLoginDeveEstarCorreta() {
        demonstrationPage.validarACorDeAtributo(demonstrationPage.btnLogin, "background-color", "rgb(0, 94, 255)");
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
        demonstrationPage.validarACorDeAtributo(demonstrationPage.btnSignUp, "background-color", "rgb(248, 249, 250)");
    }

    @When("der hover no botão Sign Up")
    public void derHoverNoBotaoSignUp() {
        demonstrationPage.hoverNoElemento(demonstrationPage.btnSignUp);
    }

    @Then("a cor do botão em hover Sign Up deve estar correta")
    public void aCorDoBotaoEmHoverSignUpDeveEstarCorreta() {
        demonstrationPage.validarACorDeAtributo(demonstrationPage.btnSignUp, "background-color","rgb(211, 212, 213)");
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
        demonstrationPage.validarACorDeAtributo(demonstrationPage.dropDownItemThemes, "background-color", "rgb(248, 249, 250)");
    }

    @And("clicar no Item Themes do dropdown Product")
    public void clicarNoItemThemesDoDropdownProduct() {
        demonstrationPage.clickNoElemento(demonstrationPage.dropDownItemThemes);
    }

    @Then("deve ser redirecionado para a página correta")
    public void deveSerRedirecionadoParaAPaginaCorreta() {
        demonstrationPage.validarRedirecionamento("https://phptravels.com/themes");
    }

    @Then("o formulário Demo Request Form deve estar visível")
    public void oFormularioDemoRequestFormDeveEstarVisivel() {
        demonstrationPage.validarVisibilidadeDoElemento(demonstrationPage.formDemoRequest);
    }

    @When("clicar no botão Submit")
    public void clicarNoBotaoSubmit() {
        demonstrationPage.clickNoElemento(demonstrationPage.btnSubmit);
    }

    @Then("o alerta avisando que o First Name deve ser preenchido deve ser exibido")
    public void oAlertaAvisandoQueOFirstNameDeveSerPreenchidoDeveSerExibido() {
        demonstrationPage.validarAlerta("Please type your first name");
    }

    @When("preencher o campo FIRST NAME")
    public void preencherOCampoFIRSTNAME() {
        demonstrationPage.preencherCampo(demonstrationPage.firstName, "Kleber");
    }

    @And("preencher o campo LAST NAME")
    public void preencherOCampoLASTNAME() {
        demonstrationPage.preencherCampo(demonstrationPage.lastName, "Junior");
    }

    @And("selecionar o país no campo SELECT COUNTRY")
    public void selecionarOPaisNoCampoSELECTCOUNTRY() {
        demonstrationPage.selecionarItemSelect("Brazil +55");
    }

    @And("preencher o campo WHATSAPP NUMBER")
    public void preencherOCampoWHATSAPPNUMBER() {
        demonstrationPage.preencherCampo(demonstrationPage.whatsappNumber, "11963636363");
    }

    @And("preencher o campo BUSINESS NAME")
    public void preencherOCampoBUSINESSNAME() {
        demonstrationPage.preencherCampo(demonstrationPage.businessName, "google");
    }

    @And("preencher o campo EMAIL")
    public void preencherOCampoEMAIL() {
        demonstrationPage.preencherCampo(demonstrationPage.email, "jorge@gmail.com");
    }

    @And("preencher o CAPTCHA")
    public void preencherOCAPTCHA() {
        demonstrationPage.preencheCaptcha();
    }

    @Then("deve ser exibido aviso de que as credenciais foram enviadas")
    public void deveSerExibidoAvisoDeQueAsCredenciaisForamEnviadas() {
        demonstrationPage.validarVisibilidadeDoElemento(demonstrationPage.divComplete);

    }

    @And("preencher o CAPTCHA com valor inválido")
    public void preencherOCAPTCHAComValorInvalido() {
        demonstrationPage.preencherCampo(demonstrationPage.resultCaptcha, "0");
    }

    @Then("o alerta avisando que o resultado do captcha está errado deve ser exibido")
    public void oAlertaAvisandoQueOResultadoDoCaptchaEstaErradoDeveSerExibido() {
        demonstrationPage.validarAlerta("Result number is invalid");
    }

    @And("preencher o campo EMAIL com valor inválido")
    public void preencherOCampoEMAILComValorInvalido() {
        demonstrationPage.preencherCampo(demonstrationPage.email, "jorgeteste.com");
    }

    @Then("o campo WHATSAPP NUMBER deve estar visível")
    public void oCampoWHATSAPPNUMBERDeveEstarVisivel() {
        demonstrationPage.validarVisibilidadeDoElemento(demonstrationPage.whatsappNumber);
    }

    @Then("o placeholder do campo WHATSAPP NUMBER deve estar correto")
    public void oPlaceholderDoCampoWHATSAPPNUMBERDeveEstarCorreto() {
        demonstrationPage.validarTextoDoElemento(demonstrationPage.placeholderWhatsapp, "Whatsapp Number");
    }

    @Then("o campo WHATSAPP NUMBER deve estar devidamente preenchido")
    public void oCampoWHATSAPPNUMBERDeveEstarDevidamentePreenchido() {
        demonstrationPage.validarTextoDoInput(demonstrationPage.whatsappNumber, "11963636363");
    }

    @When("clicar no campo WHATSAPP NUMBER")
    public void clicarNoCampoWHATSAPPNUMBER() {
        demonstrationPage.clickNoElemento(demonstrationPage.whatsappNumber);
    }

    @Then("a borda do campo WHATSAPP NUMBER deve mudar de cor")
    public void aBordaDoCampoWHATSAPPNUMBERDeveMudarDeCor() {
        demonstrationPage.validarACorDeAtributo(demonstrationPage.whatsappNumber, "border-color", "rgb(40, 101, 254)");
    }

    @When("der hover no campo WHATSAPP NUMBER")
    public void derHoverNoCampoWHATSAPPNUMBER() {
        demonstrationPage.hoverNoElemento(demonstrationPage.whatsappNumber);
    }

    @And("limpar o campo EMAIL")
    public void limparOCampoEMAIL() {
        demonstrationPage.limparTextoDoInput(demonstrationPage.email);
    }
}