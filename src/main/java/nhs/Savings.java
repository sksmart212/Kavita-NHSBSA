package nhs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Savings extends Utils
{
    private By _yessave= By.xpath("//label[@id='label-yes']");
    private By _nosave = By.xpath("//label[@id='label-no']");
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
    public void savePage(){

        currentURL("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/savings");

    }
    public void save() throws InterruptedException {
        WebElement save =null;
Thread.sleep(3000);
        clickElement(_nosave);
        waitForElementClickable(_nosave,  2000);


        //  clickElement(_yessave);
//waitForElementClickable(_yessave,  2000);

        if (save==_yessave){
           System.out.println("person selected yes");
        }
        else{
           System .out.println("person selected no ");

        }

    }
   // public void saveNext()
   // { WebElement savenext=(driver.findElement(By.cssSelector("next-button")));
      //  savenext.isEnabled();
       // savenext.click();


    public void page10() throws InterruptedException {

        wales.filInformation();
       dob.enterDob();
        partner.partner();
        tax.claims();
        preg.pregnant();
        diab.diabities();
        glaucoma.glaucoma();
        war.pension();
        currentURL("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/result");

    }
}
