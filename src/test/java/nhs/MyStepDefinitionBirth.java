package nhs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefinitionBirth extends Utils{
    DateOfBirth  dob =new DateOfBirth();


    @Given("^user lives in Iwales$")
    public void user_lives_in_wales() {

    }

    @When("^person is on date of birth page$")
    public void person_is_on_date_of_birth_page()  {

        dob.enterDob();


    }

    @When("^user enter birth date$")
    public void user_enter_birth_date()  {
        dob.enterDob();

    }

    @When("^user click on next$")
    public void user_click_on_next() throws InterruptedException {
        dob.dobClick();
    }

    @Then("^he can navigate to partner page$")
    public void he_can_navigate_to_partner_page() throws InterruptedException {
        dob.dobClick();

    }

}
