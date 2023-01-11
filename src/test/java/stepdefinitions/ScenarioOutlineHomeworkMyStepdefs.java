package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class ScenarioOutlineHomeworkMyStepdefs {
    @Given("Kullanici {string} sayfasına gider")
    public void kullaniciSayfasınaGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("Kullanici {int} sn bekler")
    public void kullaniciSnBekler(int sn) {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(sn));
    }

    @And("Sayfa basliginin {string} icerdigini test eder")
    public void sayfaBasligininIcerdiginiTestEder(String title) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(title));
    }

    @And("Sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }
}
