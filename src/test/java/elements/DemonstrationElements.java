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
}
