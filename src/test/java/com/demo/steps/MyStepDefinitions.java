package com.demo.steps;

import com.demo.utils.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertNotEquals;

public class MyStepDefinitions {

    private WebDriver driver;

    @Given("ir al navegador de Google Chrome")
    public void iAmOnGoogleSearchPage() {
        System.setProperty("webdriver.gecko.driver", "src/test/java/com/demo/drivers/geckodriver");
        driver = new FirefoxDriver();
        driver.get("https://www.google.com");
    }

    @When("digitar la palabra {string} en el buscador")
    public void iSearchFor(String busqueda) {
        driver.findElement(By.name("q")).sendKeys(busqueda);
        driver.findElement(By.name("q")).submit();
    }

    @When("dar enter para que se inicie la busqueda")
    public void enter() {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).perform();
    }

    @Then("validar que el total de resultados de consulta sea diferente a cero")
    public void verificarResultadosNoCero() throws InterruptedException {
        // Encontrar el elemento que muestra el total de resultados
        Thread.sleep(1000);
        WebElement resultsStats = driver.findElement(By.id("result-stats"));

        // Obtener el texto y extraer el número de resultados
        String resultsText = resultsStats.getText();
        int totalResults = Utils.extractTotalResults(resultsText);

        // Verificar que el total de resultados no sea cero
        assertNotEquals(0, totalResults);

        // Cerrar el navegador
        driver.quit();
    }
}
