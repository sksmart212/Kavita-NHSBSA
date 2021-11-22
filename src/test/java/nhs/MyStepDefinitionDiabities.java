package nhs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefinitionDiabities extends Utils  {
    Diabites diab = new Diabites();

    @Given("^user lives in waless$")
    public void user_lives_in_waless() {

    }

    @When("^user is on diabities page$")
    public void user_is_on_diabities_page()  {
        diab.diabitiesPage();

    }

    @When("^user selected option yes or no on diabities page$")
    public void user_selected_option_yes_or_no_on_diabities_page() throws InterruptedException {

     diab.diabities();
    }

    @When("^clicks on next button on diabities page$")
    public void clicks_on_next_button_on_diabities_page() throws InterruptedException {
     diab.diabities();

    }

    @Then("^user can navigate to glaucoma page$")
    public void user_can_navigate_to_glaucoma_page()  {
       diab.page7();
    }



}
