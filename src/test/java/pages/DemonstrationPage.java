package pages;

import elements.DemonstrationElements;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DemonstrationPage extends DemonstrationElements {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    public DemonstrationPage(WebDriver driver) {
        this.driver = driver;
        this.action = new Actions(driver);
        driver.manage().window().maximize();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public void acessarSite() {
        driver.get("https://phptravels.com/demo");
    }

    public void validarExibFirstName(){
        Assertions.assertTrue(firstName.isDisplayed());
    }

    public void digitarFirstName(String nome){
        firstName.sendKeys(nome);
    }

    public void clickBtnLogin() {
        action.click(btnLogin).perform();
    }

    public void checarAbaDeRedirecionamento(String titulo) {
        Object[] windowHandles=driver.getWindowHandles().toArray();
        driver.switchTo().window((String) windowHandles[1]);
        Assertions.assertEquals(titulo, driver.getTitle());
    }
}
