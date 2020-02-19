package org.example;

import org.junit.Before;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest extends Utils
{

    BrowserSelector browserSelector = new BrowserSelector();


    @Before
    public void openBrowser(){
        browserSelector.setUpBrowser();
    }
 //@AfterTest
  //  public void closeBrowser() {

   //     browserSelector.closeBrowser();
}


