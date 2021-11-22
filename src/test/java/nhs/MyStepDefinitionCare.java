package nhs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefinitionCare extends Utils {
    CareHome home = new CareHome();

    @Given("^user lives in walaes$")
    public void user_lives_in_walaes() {


    }

    @When("^user is on care page$")
    public void user_is_on_care_page() {
      home.carePage();
    }

    @When("^user selected option yes or no on  care page$")
    public void user_selected_option_yes_or_no_on_care_page() throws InterruptedException {
      home.care();
    }

    @When("^clicks on next button on care page$")
    public void clicks_on_next_button_on_care_page() throws InterruptedException {
        home.care();
    }

    @Then("^user can navigate to savings page$")
    public void user_can_navigate_to_savings_page()  {
        home.page9();
    }


}
