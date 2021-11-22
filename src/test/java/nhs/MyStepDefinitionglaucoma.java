package nhs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefinitionglaucoma extends Utils {
    Glaucoma glau = new Glaucoma();

    @Given("^user lives in walles$")
    public void user_lives_in_walles()  {

    }

    @When("^user is on glaucoma page$")
    public void user_is_on_glaucoma_page()
    {
        glau.glaucomaPage();
    }

    @When("^user selected option yes or no on glaucoma page$")
    public void user_selected_option_yes_or_no_on_glaucoma_page() throws InterruptedException {
       glau.glaucoma();
    }

    @When("^clicks on next button on glaucoma page$")
    public void clicks_on_next_button_on_glaucoma_page() throws InterruptedException {
        glau.glaucoma();
    }

    @Then("^user can navigate to care home page$")
    public void user_can_navigate_to_care_home_page() {
        glau.page8();
    }



}
