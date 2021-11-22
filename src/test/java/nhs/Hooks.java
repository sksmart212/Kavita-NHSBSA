package nhs;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
    //   static  String timeStamp = new SimpleDateFormat("dd.MM.yy.HH.mm.ss").format(Date());

    //Run Before every Method
    @Before

    public void setUpBrowser() throws InterruptedException {
        browserSelector.setUpBrowser();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
       driver.manage().window().fullscreen();
       driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
        Thread.sleep(10000);
    }
    //Run After every Method
    @After

    public void closeBrowser(Scenario scenario) {

        if (scenario.isFailed()) {
            // This takes a screenshot from the driver at save it to the specified location
            TakesScreenshot ts = (TakesScreenshot) driver;
            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");

        }

       //driver.quit();
    }

}
