package nhs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ClaimsBenefitTax extends Utils {
    LoadProp prop = new LoadProp();
    private By _yes1 = By.xpath("//label[@id='label-yes']");
    private By _no1 = By.xpath("//label[@id='label-no']");

    public void claimsPage() {
        currentURL("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/claim-benefits-tax-credits");

    }

    public void claims() throws InterruptedException {

        WebElement claimnext = (driver.findElement(By.cssSelector("next-button")));
        Thread.sleep(2000);
        clickElement(_no1);
        waitForElementClickable(_no1,  2000);


        currentURL(" https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/pregnant-or-given-birth");
    }
        public void claimsYes() throws InterruptedException {
        Thread.sleep(3000);
            clickElement(_yes1);
            waitForElementClickable(_yes1,  2000);
            currentURL(" https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/paid-universal-credit");


        }

    }
