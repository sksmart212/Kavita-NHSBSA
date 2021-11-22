package nhs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefinitionPartner extends Utils{
    Partner p =new Partner();

    @Given("^user lives in wwales$")
    public void user_lives_in_wwales()  {

    }

    @When("^user is on partner page$")
    public void user_is_on_partner_page() {
        p.partnerPage();
    }

    @When("^user click on yes or no$")
    public void user_click_on_yes_or_no() throws InterruptedException {
       p.partner();

    }

   @When("^user click on next button$")
    public void user_click_on_next_button() throws InterruptedException{
      p.partner();
    }

    @Then("^he can navigate to benefits tax credit page$")
    public void he_can_navigate_to_benefits_tax_credit_page() {
     p.pageBenefit();
   }


}
