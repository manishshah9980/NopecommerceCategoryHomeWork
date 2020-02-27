package org.example;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage {

    public void clickOnElement(By by){
        driver.findElement(by).click();
    }

    public void clickonElements(By by) {
    driver.findElement(by).click();
   }

    //  METHOD 1 WAIT FOR CLICKABLE
    public void waitUntilClickable(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    //METHOD 2 WAIT UNTIL VISIBLE
    public void waituntilvisible(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }

    // METHOD 3 WAIT UNTIL ELEMENT PRESENT
    public void waituntilElementPresent(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }

    // METHOD FOR DROP DOWN BY INDEX CREATED
    public void selectFromDropDownByIndex(By by, int index) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }

    // METHOD FOR DROP DOWN BY VALUE CREATED
    public void selectFromDropdownByvalue(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }

    // METHOD FOR DROPDOWN FOR VISIBLE CREATED
    public void selectFromDropDownByVisible(By by, String visibleText) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(visibleText);
    }
    public static String timestamp() {
        DateFormat dateFormat = new SimpleDateFormat("ddmmyyHHmmss");
        Date date = new Date();
        return (dateFormat.format(date));
    }


   //  METHOD FOR ASSERT
    public static void assertTextMessage(String message, String expected, By by){
       String actual = getTextfromElement(by);
       Assert.assertEquals(message , expected , actual);
   }
    public static void assertURL(String text){
        Assert.assertTrue(driver.getCurrentUrl().contains(text));
    }
    public static void sendText(By by, String text){
        driver.findElement(by).sendKeys(text);
    }


    // METHOD 4 GET TEXT
    public static String getTextfromElement(By by) {
        return driver.findElement(by).getText();
    }
    // METHOD 6 ENTER THE TEXT(SEND KEY)
    public void enterText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }


    }


