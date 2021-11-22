package nhs;

import org.openqa.selenium.By;

public class Partner extends Utils {
 //    private By _yes = By.xpath("//label[@id='label-yes']");
    private  By _yes= By.cssSelector("#label-yes");
    //  private By _no = By.xpath("//label[@id='label-no']");
//private  By s =By.cssSelector("#next-button");
    LoadProp prop = new LoadProp();

    public void partnerPage() {

        currentURL("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/partner");
    }
        public void partner() throws InterruptedException {
           // WebElement _yes= driver.findElement(By.xpath("//label[@id='label-yes']"));
            //WebElement _yes=driver.findElement(By.cssSelector("#label-yes"));
           // WebElement s= driver.findElement(By.cssSelector("#next-button']"));
          //_yes.click();
            Thread.sleep(5000);
            clickElement(_yes);
            waitForElementClickable(_yes,  2000);
          //  waitForLocatorClickable(_yes,2000);
            //WebElement s= driver.findElement(By.cssSelector("#next-button"));
           // Thread.sleep(5000);
            //s.click();

           // JavascriptExecutor js= (JavascriptExecutor) driver;
            //js.executeScript("arguments[0].click();", s);
            //clickElement(s);
               // driver.refresh();
               // waitForLocatorClickable(s, 1000);

//clickElement(_no);
           // Thread.sleep(5000);
           // clickElement(_next2);
        }
       public  void  pageBenefit(){
currentURL("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/claim-benefits-tax-credits");
   }
}