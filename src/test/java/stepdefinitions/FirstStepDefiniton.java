package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstStepDefiniton {
    @Given("Ilk feature için cucumber indirdim")
    public void ılk_feature_için_cucumber_indirdim() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Given methodu çalıştı");
    }
    @When("Senaryomu çalıştırdığımda")
    public void senaryomu_çalıştırdığımda() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("When step'i çalıştı");
    }
    @Then("Senaryomun çalıştığını konsolda görmeliyim")
    public void senaryomun_çalıştığını_konsolda_görmeliyim() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Then step'i çalıştı");
    }

}
