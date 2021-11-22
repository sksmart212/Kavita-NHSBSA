package nhs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefinitionWales extends Utils{
    Wales wa=new Wales();
    @Given("^user lives in wales$")

    public void user_lives_in_wales()  {


    }





    @When("^user is on nhs page and clicks on start now$")
    public void user_is_on_nhs_page_and_clicks_on_start_now() {
        wa.checkInformation();


    }

    @When("^user is on country page$")
    public void user_is_on_country_page()  {
        wa.filInformation();

    }

    @When("^select country wales$")
    public void select_country_wales() {
        wa.filInformation();
    }



    @When("^click on next$")
    public void click_on_next()  {
        wa.filInformation();


    }

    @Then("^user can navigate to date of birth page$")
    public void user_can_navigate_to_date_of_birth_page()  {






    }
}
