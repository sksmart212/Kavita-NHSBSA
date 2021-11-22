package nhs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Pregnant extends Utils {

    private By _yespregnant = By.xpath("//label[@id='label-yes']");
    private By _nopregnant = By.xpath("//label[@id='label-no']");

    public void PregnantPage(){

        currentURL("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/pregnant-or-given-birth");

    }
    public void pregnant() throws InterruptedException {
        WebElement pregnant =null;
Thread.sleep(5000);
        clickElement(_nopregnant);
        waitForElementClickable(_nopregnant,  2000);

        //clickElement(_yespregnant);
        //waitForElementClickable(_yespregnant,  2000);



        if (pregnant==_yespregnant){
            System.out.println("person selected yes");
        }
        else{
            System .out.println("person selected no ");

        }

    }
   // public void pregnantNext(){ WebElement pregnantnext=(driver.findElement(By.cssSelector("next-button")));
       // pregnantnext.isEnabled();
      //  pregnantnext.click();


    public void page3(){
        currentURL("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/war-pensioner"
        );
    }
}




