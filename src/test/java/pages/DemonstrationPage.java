package pages;

import elements.DemonstrationElements;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
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

    public void clickNoElemento(WebElement element) {
        action.click(element).perform();
    }

    public void validarRedirecionamento(String url) {
        Object[] windowHandles = driver.getWindowHandles().toArray();
        if (windowHandles.length > 1) {
            driver.switchTo().window((String) windowHandles[1]);
        }
        Assertions.assertEquals(url, driver.getCurrentUrl());
    }

    public void validarVisibilidadeDoElemento(WebElement elemento) {
        Assertions.assertTrue(elemento.isDisplayed());
    }

    public void validarTextoDoElemento(WebElement elemento, String texto) {
        Assertions.assertEquals(elemento.getText(), texto);
    }

    public void validarACorDoElemento(WebElement elemento, String rgb){
        String corHexAtual = Color.fromString(elemento.getCssValue("background-color")).asHex();
        String corHexEsperada = Color.fromString(rgb).asHex();
        Assertions.assertEquals(corHexEsperada, corHexAtual);
    }

    public void hoverNoElemento(WebElement elemento){
        action.moveToElement(elemento).perform();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
