package nhs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Wales extends Utils {

    LoadProp prop =  new LoadProp();
    private By start = By.xpath(" //input[@id='next-button']");
    private By wales = By.xpath(" //label[@id='label-wales']");
   // private By scotland=By.xpath(" //label[@id='label-scotland']");

    private By next = By.xpath("//input[@id='next-button']" );

    public void  checkInformation()

    {
        //
        currentURL("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
        checkWebElementIsDisplayedOrNot(start);
        clickElement(start);


    }


        public void  filInformation(){

           currentURL("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/where-you-live");
           WebElement country =null;
            checkWebElementIsDisplayedOrNot(wales);
            clickElement(wales);

//checkWebElementIsDisplayedOrNot(scotland);
            //clickElement(scotland);

            if (country == wales) {
                System.out.println("Person is eligible for help");
            }
else {
            System.out.println("person is not eligible for help");
        }
            checkWebElementIsDisplayedOrNot(next);

            clickElement(next);
            currentURL("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/date-of-birth");


      }}


