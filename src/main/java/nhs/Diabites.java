package nhs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Diabites extends Utils {
    private By _yesdiabities = By.xpath("//label[@id='label-yes']");
    private By _nodiabities = By.xpath("//label[@id='label-no']");

    public void diabitiesPage(){

        currentURL("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/diabetes");

    }
    public void diabities() throws InterruptedException {
        WebElement diabities =null;

       // clickElement(_nodiabities);
       //waitForElementClickable(_nodiabities,  2000);
        Thread.sleep(3000);

        clickElement(_yesdiabities);
        waitForElementClickable(_yesdiabities,  2000);


        if (diabities==_yesdiabities) {
            System.out.println("person selected yes");
        }
        else{
           System .out.println("person selected no ");

        }

    }
    public void page7(){

        currentURL("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/glaucoma");

    }
}




