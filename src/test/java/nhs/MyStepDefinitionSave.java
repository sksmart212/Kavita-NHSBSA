package nhs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefinitionSave extends Utils {
    Savings save = new Savings();
    LoadProp prop = new LoadProp();
    DateOfBirth  dob =new DateOfBirth();
    ClaimsBenefitTax tax =new ClaimsBenefitTax();
    CareHome home = new CareHome();
    Pregnant preg = new Pregnant();
    Partner partner=new Partner();
    Wales wales=new Wales();
    Glaucoma glaucoma=new Glaucoma();
    Diabites diab = new Diabites();
    WarPensioner war =new WarPensioner();

    @Given("^user lives in walaaes$")
    public void userLivesInWalaaes() {
    }


    @When("^user is on save page$")
    public void user_is_on_save_page() {
        save.savePage();
    }

    @When("^user selected option yes or no on  save page$")
    public void user_selected_option_yes_or_no_on_save_page() throws InterruptedException {
        save.save();

    }

    @When("^clicks on next button on save page$")
    public void clicks_on_next_button_on_save_page() throws InterruptedException {
        save.save();

    }




    @Then("^as per information person can see his result on result page$")
    public void asPerInformationPersonCanSeeHisResultOnResultPage() throws InterruptedException {
     save.page10();
    }
}
