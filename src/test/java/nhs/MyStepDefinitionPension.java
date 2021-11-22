package nhs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefinitionPension extends Utils {
    WarPensioner war =new WarPensioner();

    @Given("^user lives in waalees$")
    public void user_lives_in_waalees()  {

    }

    @When("^user is on war pension page$")
    public void user_is_on_war_pension_page()  {
       war.pensionPage();
    }

    @When("^user selected option yes or no$")
    public void user_selected_option_yes_or_no()  {
       war.pension();
    }

    @When("^clicks on next button on pension page$")
    public void clicks_on_next_button_on_pension_page()  {
      war.warNext();
    }

    @Then("^user can navigate to diabeties page page$")
    public void user_can_navigate_to_diabeties_page_page()  {
        war.page4();
    }

}
