package nhs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WarPensioner extends Utils {
    private By _yespensioner = By.xpath("//label[@id='label-yes']");
     private By _nopensioner = By.xpath("//label[@id='label-no']");

public void pensionPage(){

    currentURL("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/war-pensioner");

}
public void pension(){
    WebElement pension =null;

    clickElement(_nopensioner);

     //clickElement(_yespensioner);


    if (pension==_yespensioner){
        System.out.println("person selected yes");
    }
    else{
        System .out.println("person selected no ");

    }

}
public void warNext(){
    WebElement pensionnext=(driver.findElement(By.cssSelector("next-button")));
    pensionnext.isEnabled();
    pensionnext.click();

}
public void page4(){
    currentURL("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/diabetes"
    );
}
}



