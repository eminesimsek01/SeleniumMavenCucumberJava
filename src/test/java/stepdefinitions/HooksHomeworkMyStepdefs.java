package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HooksHomeworkMyStepdefs {

    @Given("Kullanici anasayfaya gider")
    public void kullaniciAnasayfayaGider() {
        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/");
    }

    @And("Kullanici username {string} girer")
    public void kullaniciUsernameGirer(String arg0) {

    }

    @And("Kullanici password {string} girer")
    public void kullaniciPasswordGirer(String arg0) {
    }

    @When("Kullanici login butonuna tiklar")
    public void kullaniciLoginButonunaTiklar() {
    }

    @And("Senaryo fail olur")
    public void senaryoFailOlur() {
    }

    @And("Sayfayi kap")
    public void sayfayiKap() {
    }
}
