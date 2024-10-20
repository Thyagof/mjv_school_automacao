package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemonstrationElements {

    @FindBy (xpath = "//input[@name='first_name']")
    public WebElement firstName;

    @FindBy (xpath = "//a[@class='btn btn-primary text-white rounded-1 m-1 w-100 fs-6 px-0 fw-100 waves-effect']")
    public WebElement btnLogin;

    @FindBy (xpath = "//a[@class='btn btn-light rounded-1 m-1 w-100 fs-6 px-0 fw-100 text-dark waves-effect']")
    public WebElement btnSignUp;

    @FindBy (xpath = "//a[@class='nav-link d-flex gap-1 align-items-center justify-content-between rounded-1 text-white waves-effect'][contains(., 'Product')]")
    public WebElement navItemProduct;

    @FindBy (xpath = "//ul[@class='dropdown-menu show']")
    public WebElement dropDownMenuOpened;

    @FindBy (xpath = "(//a[@class='dropdown-item d-flex justify-content-between waves-effect'])[1]")
    public WebElement dropDownItemThemes;

    @FindBy (xpath = "//div[@class='demo_form bgb br8 p3']")
    public WebElement formDemoRequest;

    @FindBy (xpath = "//input[@name='last_name']")
    public WebElement lastName;

    @FindBy (xpath = "//select[@name='country_id']")
    public WebElement selectCountry;

    @FindBy (xpath = "//input[@name='whatsapp']")
    public WebElement whatsappNumber;

    @FindBy (xpath = "//input[@name='business_name']")
    public WebElement businessName;

    @FindBy (xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy (xpath = "//span[@id='numb1']")
    public WebElement numberCaptcha1;

    @FindBy (xpath = "//span[@id='numb2']")
    public WebElement numberCaptcha2;

    @FindBy (xpath = "//input[@id='number']")
    public WebElement resultCaptcha;

    @FindBy (xpath = "//button[@id='demo']")
    public WebElement btnSubmit;

    @FindBy (xpath = "//div[@class='completed']")
    public WebElement divComplete;
}
