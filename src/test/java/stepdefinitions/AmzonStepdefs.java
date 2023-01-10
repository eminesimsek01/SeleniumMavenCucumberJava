package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Driver;

public class AmzonStepdefs {
    @Given("Kullanıcı amazon sitesine gider")
    public void kullanıcıAmazonSitesineGider() {
        Driver.getDriver().get("https://www.amazon.com.tr/");
    }

    @When("Kullanıcı amazonda {string} aratır")
    public void kullanıcıAmazondaAratır(String arg0) {
    }

    @Then("Kullanıcı arama sonuçlarında {string} görmelidir.")
    public void kullanıcıAramaSonuçlarındaGörmelidir(String arg0) {
    }

    @And("Ekran görüntüsü alır")
    public void ekranGörüntüsüAlır() {
    }

    @And("Browser kapatır")
    public void browserKapatır() {
    }
}
