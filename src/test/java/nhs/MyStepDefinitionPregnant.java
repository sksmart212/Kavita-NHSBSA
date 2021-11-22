package nhs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefinitionPregnant extends Utils {
    Pregnant preg = new Pregnant();


    @Given("^user lives in waals$")
    public void user_lives_in_waals()  {


    }

    @When("^user is on pregnant page$")
    public void user_is_on_pregnant_page()  {
        preg.PregnantPage();
    }

    @When("^user selected option yes or no on pregnant page$")
    public void user_selected_option_yes_or_no_on_pregnant_page() throws InterruptedException {

preg.pregnant();
    }

    @When("^clicks on next button on pregnant page$")
    public void clicks_on_next_button_on_pregnant_page() throws InterruptedException {
preg.pregnant();
    }

    @Then("^user can navigate to  page page$")
    public void user_can_navigate_to_page_page()  {
preg.page3();
    }


}
