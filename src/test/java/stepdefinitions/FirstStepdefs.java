package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstStepdefs {
    @Given("Ilk feature icin cucumber indirdim")
    public void ılkFeatureIcinCucumberIndirdim() {
        System.out.println("Given methodu çalıştı");
    }

    @When("Senaryomu calistirdigimda")
    public void senaryomuCalistirdigimda() {
        System.out.println("When step'i çalıştı");
    }

    @Then("Senaryomun calistigini konsolda gormeliyim")
    public void senaryomunCalistiginiKonsoldaGormeliyim() {
        System.out.println("Then step'i çalıştı");
    }
}
