package nhs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CareHome extends Utils {
    private By _yescare= By.xpath("//label[@id='label-yes']");
    private By _nocare = By.xpath("//label[@id='label-no']");

    public void carePage(){

        currentURL("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/care-home");

    }
    public void care() throws InterruptedException {
        WebElement care =null;

        //clickElement(_nocare);

        clickElement(_yescare);
        Thread.sleep(5000);
        waitForElementClickable(_yescare,  2000);

      //  if (care==_yescare){
        //    System.out.println("person selected yes");
        //}
        //else{
          //  System .out.println("person selected no ");

        //}

    }
    //public void careNext()
    //{ WebElement carenext=(driver.findElement(By.cssSelector("#next-button")));
      //  carenext.isEnabled();carenext.click();

//}
    public void page9(){
        currentURL("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/savings");

    }
}
