package pages;

import elements.DemonstrationElements;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class DemonstrationPage extends DemonstrationElements {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    public DemonstrationPage(WebDriver driver) {
        this.driver = driver;
        this.action = new Actions(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    //Métodos de ação

    public void acessarSite() {
        driver.get("https://phptravels.com/demo");
    }

    public void preencherCampo(WebElement elemento, String texto) {
        elemento.sendKeys(texto);
    }

    public void clickNoElemento(WebElement elemento) {
        aguardarElementoSeTornarClicavel(elemento);
        action.click(elemento).perform();
    }

    public void aguardarElementoSeTornarVisível(WebElement elemento) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(elemento));
    }

    public void aguardarElementoSeTornarClicavel(WebElement elemento) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(elemento));
    }

    public void aguardarAlertaExistir() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    public void hoverNoElemento(WebElement elemento) {
        action.moveToElement(elemento).perform();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void selecionarItemSelect(String texto) {
        Select select = new Select(selectCountry);
        select.selectByVisibleText(texto);
    }

    public void preencheCaptcha() {
        Integer resultado = Integer.valueOf(numberCaptcha1.getText()) + Integer.valueOf(numberCaptcha2.getText());
        preencherCampo(resultCaptcha, Integer.toString(resultado));
    }

    public void limparTextoDoInput(WebElement input) {
        input.clear();
    }

    //Métodos de validação

    public void validarRedirecionamento(String url) {
        Object[] windowHandles = driver.getWindowHandles().toArray();
        if (windowHandles.length > 1) {
            driver.switchTo().window((String) windowHandles[1]);
        }
        Assertions.assertEquals(url, driver.getCurrentUrl());
    }

    public void validarVisibilidadeDoElemento(WebElement elemento) {
        aguardarElementoSeTornarVisível(elemento);
        Assertions.assertTrue(elemento.isDisplayed());
    }

    public void validarTextoDoElemento(WebElement elemento, String texto) {
        Assertions.assertEquals(elemento.getText(), texto);
    }

    public void validarACorDeAtributo(WebElement elemento, String atributo, String rgb) {
        String corHexAtual = Color.fromString(elemento.getCssValue(atributo)).asHex();
        String corHexEsperada = Color.fromString(rgb).asHex();
        Assertions.assertEquals(corHexEsperada, corHexAtual);
    }

    public void validarAlerta(String texto) {
        aguardarAlertaExistir();
        Alert alert = driver.switchTo().alert();
        String alertTexto = alert.getText();
        alert.dismiss();
        Assertions.assertEquals(texto, alertTexto);
    }

    public void validarTextoDoInput(WebElement input, String textoEsperado) {
        String textoAtual = input.getAttribute("value");
        Assertions.assertEquals(textoEsperado, textoAtual);
    }
}
