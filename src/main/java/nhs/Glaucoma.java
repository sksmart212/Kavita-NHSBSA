package nhs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Glaucoma extends Utils {

    private By _yesglaucoma= By.xpath("//label[@id='label-yes']");
    private By _noglaucoma = By.xpath("//label[@id='label-no']");

    public void glaucomaPage(){

        currentURL("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/glaucoma");

    }
    public void glaucoma() throws InterruptedException {
        WebElement glaucoma =null;

        //clickElement(_noglaucoma);
Thread.sleep(3000);

        clickElement(_yesglaucoma);
        waitForElementClickable(_yesglaucoma,  2000);
        //clickElement(_noglaucoma);

        //waitForElementClickable(_noglaucoma,  2000);



        if (glaucoma==_yesglaucoma){
            System.out.println("person selected yes");
        }
        else{
            System .out.println("person selected no ");

        }

    }
    //public void glaucomaNext()
    //{ WebElement glaucomanext=(driver.findElement(By.cssSelector("next-button")));
      //  glaucomanext.isEnabled();
       // glaucomanext.click();
//
    //}
    public void page8(){
        currentURL("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/care-home");

    }
}
