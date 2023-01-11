package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.OhlHomePage;
import utilities.Driver;

public class HooksHomeworkMyStepdefs {
    OhlHomePage obj=new OhlHomePage(Driver.getDriver());

    @Given("Kullanici anasayfaya gider")
    public void kullaniciAnasayfayaGider() {
        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/");
    }

    @And("Kullanici username {string} girer")
    public void kullaniciUsernameGirer(String arg0) {
       obj.loginUsername(arg0);
    }

    @And("Kullanici password {string} girer")
    public void kullaniciPasswordGirer(String arg0) {
        obj.loginPassword(arg0);
    }

    @When("Kullanici login butonuna tiklar")
    public void kullaniciLoginButonunaTiklar() {
        obj.logintıklama();
    }

    @And("Senaryo fail olur")
    public void senaryoFailOlur() {
        Assert.assertTrue(obj.failedText.isDisplayed());
    }

    @And("Sayfayi kap")
    public void sayfayiKap() {
        Driver.closeDriver();
    }
}
