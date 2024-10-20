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
}
