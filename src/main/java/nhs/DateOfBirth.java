package nhs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DateOfBirth extends Utils {
    private By days = By.xpath("//input[@id='dob-day']");
    private By months_ = By.xpath("//input[@id='dob-month']");
     private By years_= By.xpath("//input[@id=dob-year]");
    private By next1 = By.xpath("//input[@id='next-button']" );

    LoadProp prop =  new LoadProp();
     public  void enterDob(){
    currentURL("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/date-of-birth");

    WebElement dobday = driver.findElement(By.xpath("//input[@id='dob-day']"));

    WebElement dobmonth = driver.findElement(By.xpath("//input[@id='dob-month']"));
    WebElement dobyear = driver.findElement(By.xpath("//input[@id='dob-year']"));
            dobday.sendKeys(prop.getProperty("day"));
            dobmonth.sendKeys(prop.getProperty("month"));
            dobyear.sendKeys(prop.getProperty("year"));
    int iage=CalculateAge(Integer.parseInt(prop.getProperty("day")), Integer.parseInt(prop.getProperty("month")), Integer.parseInt(prop.getProperty("month")));
       if(iage==18&&iage<=24)

       {
           System.out.println("person is eligible");

       }
       else if(iage==60&&iage>60){
           System.out.println("person is eligible");
       }
       else{
           System.out.println("Person is not eligible");
       }
}
public void dobClick() throws InterruptedException {

         clickElement(next1);
   // Thread.sleep(5000);
     //waitForElementClickable(years_, 2000);
         driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/partner");
}
}
