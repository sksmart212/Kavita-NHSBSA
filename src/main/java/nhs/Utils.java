package nhs;

import org.junit.Assert;
import org.mortbay.util.IO;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Utils extends BasePage {  private IO FileUtils;

    //Clicking element
    public  void clickElement(By by)
    {
        driver.findElement(by).click();
    }

    //method for getting text from web
    public  String getTextFromElement(By by) {
        String actualText = driver.findElement(by).getText();
        System.out.println(actualText);
        return actualText;
    }

    public static int CalculateAge(int day, int month, int year){

        LocalDate today = LocalDate.now();

        LocalDate birthday = LocalDate.of(year, month, day);
        int years = Period.between(birthday,today).getYears();
        return years;
    }


    //Scroll to element and click

    public static void scroll_To_view_Element_And_Click(By by){

        WebElement element = driver.findElement(by);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click();
        actions.perform();


    }


    //Scroll to view element

    public static void scroll_To_view_Element_Using_Action_class(By by) {

        WebElement element = driver.findElement(by);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();

    }

    public  String assertTextMessage(String expected, By by) {
        String actual = getTextFromElement(by);
        Assert.assertEquals(expected, actual);
        System.out.println(actual);
        return actual;
    }


    //GetURL
    public static void currentURL(String text)
    {
        driver.get(text);

    }
    //Clear Text form inout box/area
    public  void clearText(By by)
    {
        driver.findElement(by).clear();
    }
    public WebElement getElementby(By by)
    {
        return driver.findElement(by);
    }



    //Enter text in input field
    public  void enterText(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }



    //Clear and enter text in input field
    public  void clearAndThenEnterText(By by , String text )
    {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);
    }



    //Checking WebElement present in DOM
    public  boolean checkWebElementIsPresentOrNot(By by)
    {
        return ((driver.findElement(by)) != null);
    }




    //Checking WebElemnt displayed or not
    public  boolean checkWebElementIsDisplayedOrNot(By by)
    {
        return (driver.findElement(by).isDisplayed());

    }


    //Wait for fixed time given in seconds
    public  void waitForFixedTimeGivenInSecond(long time_in_seconds)
    {
        WebDriverWait wait = new WebDriverWait(driver,time_in_seconds);
        driver.manage().timeouts().implicitlyWait(time_in_seconds, TimeUnit.SECONDS);
        //driver.manage().timeouts().setScriptTimeout(time_in_seconds, TimeUnit.SECONDS);
        //driver.manage().timeouts().pageLoadTimeout(time_in_seconds,TimeUnit.SECONDS);
    }




    //Try to click element three times if not available in first go
    public  void clickElementThreeTimesIfNotAvailableInFirstGo (By by)
    {
        if (driver.findElement(by).isDisplayed())
        {
            driver.findElement(by).click();
        } else if (driver.findElement(by).isDisplayed())
        {
            driver.findElement(by).click();
        } else
        {
            driver.findElement(by).click();
        }

    }

    //is dorpdown present


    //Wait for locator to be clickable for given time in seconds
    public static void waitForLocatorClickable(By by,  int time)
    {
        WebDriverWait wait = new WebDriverWait(driver , time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }



    //Wait for element to be clickable for given time in seconds
    public static void waitForElementClickable(By by , int time)
    {
        WebDriverWait wait = new WebDriverWait(driver , time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    //date stamp short
    public static String getShortTimeStamp()
    {

        DateFormat dateFormat = new SimpleDateFormat("yyyymmddhhmmss");
        Date date = new Date();
        String mytimestamp = dateFormat.format(date);
        return mytimestamp;
    }

    //date stamp long
    public  String getLongTimeStamp()
    {
        DateFormat dateFormat = new SimpleDateFormat("yyyymmddhhmmssSSS");
        Date date = new Date();
        String mytimestamp = dateFormat.format(date);
        return mytimestamp;
    }


    //Wait for element for given time in second
    public static void waitForElementForGivenTimeInSecond(long time_in_seconds)
    {
        WebDriverWait wait = new WebDriverWait(driver,time_in_seconds);
        driver.manage().timeouts().implicitlyWait(time_in_seconds, TimeUnit.SECONDS);
    }


    //wait for element to be invisible
    public static void waitForElementInvisible(By by , int time)
    {
        WebDriverWait wait = new WebDriverWait(driver , time);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }




    // select from visible text



    //Select from visible number
    public static void selectFromVisibleNumber(By by , String text)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }



    //Select from value


    //19. Get selected value from dropdown
    public static void selectTextByValue (By by , String text)
    {
        Select select = new Select (driver.findElement(by));
        select.selectByVisibleText(text);
    }

    //Scroll to view element
    public static void scrollToViewElement(By by)
    {
        WebElement webElement = driver.findElement(by);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", webElement);
    }





    //Scroll to element and click
    public static void scrollToElementAndClick(By by)
    {
        WebElement webElement = driver.findElement(by);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", webElement);
        webElement.click();
    }



    //Wait for alert to display
    public static void waitForAlertToDisplay( int time)
    {
        WebDriverWait wait = new WebDriverWait(driver,time) ;
        wait.until(ExpectedConditions.alertIsPresent());
        String a = driver.switchTo().alert().getText();
        System.out.println(a);

    }

    //Get attribute of element
    public static String getAttributeOfElement(By by,String requiredAttribute)
    {
        String valueAttribute = driver.findElement(by).getAttribute(requiredAttribute);
        System.out.println(valueAttribute);
        return valueAttribute;
    }


    //get css property of element
    public static String getCSSPropertyOfTheElement(By by, String cssproperty)
    {
        WebElement searchTextBox = driver.findElement(by);
        String property = searchTextBox.getCssValue(cssproperty);
        System.out.println(property);
        return property;
    }


    // To assert user is on right url
    public static void assertCurrentURL(String expectedUrl) {
        //String url = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
    }


    //take screenshot of browser


    //take screenshot of current display(full)
    public void capturescreenshot(WebDriver String, String Name)
    {
        try{
            TakesScreenshot screenshot  =(TakesScreenshot)String;  /*we have to create object as it is interface*/

            File source =screenshot.getScreenshotAs(OutputType.FILE);


            FileUtils.copyFile(source, new File("./Screenshots/"+ Name + ".png"));

        }
        catch  (java.io.IOException e)
        {
            System.out.println("Failed to capture screenshot: " + e.getMessage());
        }
    }


    //convert date....
    public  static String covertDateIntoString()
    {
        DateFormat dateFormat = new SimpleDateFormat("yyyymmdd");
        Date date = new Date();
        String dateintostring = dateFormat.format(date);
        return dateintostring;

    }

    //menu selection from webelement
    public   void  menuselection  (By by1, By by2 )
    {
        WebElement element =getElementby(by1);

        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
        clickElement(by2);



        // get element by selector


    }}






