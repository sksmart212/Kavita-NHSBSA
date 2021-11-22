package nhs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefinitionClaims extends Utils{
    ClaimsBenefitTax tax =new ClaimsBenefitTax();

    @Given("^user lives in waales$")
    public void user_lives_in_waales() {


    }

    @When("^person is on benefits tax credits page$")
    public void person_is_on_benefits_tax_credits_page()  {
       tax.claimsPage();
    }

    @When("^user clicks on  no button$")
    public void user_clicks_on_no_button() throws InterruptedException {
        tax.claims();

    }

    @When("^user clicks on next$")
    public void user_clicks_on_next() throws InterruptedException {
        tax.claims();
    }

    @Then("^he can navigate to  given birth page$")
    public void he_can_navigate_to_given_birth_page() throws InterruptedException {
       tax.claims();
    }

    @When("^user clicks on  yes button$")
    public void user_clicks_on_yes_button() throws InterruptedException {
tax.claimsYes();
    }








    @Then("^he can navigate to paid universal credit$")
    public void heCanNavigateToPaidUniversalCredit() throws InterruptedException {
        tax.claimsYes();
    }
}
