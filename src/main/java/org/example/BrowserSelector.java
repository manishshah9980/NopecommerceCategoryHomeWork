package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserSelector extends Utils
{
    public void setUpBrowser() {

        Loadprop loadprop = new Loadprop();
        String browser5 = loadprop.getProperty("browser5");


      // YOU CAN SELECT OR CHANGE BROWSER FROM HERE
        String browser = "chrome";
     // CHROME BROWSER WILL RUN FROM HERE
        if (browser.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://demo.nopcommerce.com/");

      // FIREFOX DRIVEE WILL RUN FROM HERE
        }else if(browser.equalsIgnoreCase("firefox"))
        {
            System.setProperty("webdriver.firefox.driver", "src\\test\\Resources\\BrowserDriver\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get("https://demo.nopcommerce.com/");
      // IE BROWSER WILL OPEN FROM HERE
        }else if(browser.equalsIgnoreCase("ie"))
        {

            System.setProperty("webdriver.ie.driver", "src\\test\\Resources\\BrowserDriver\\IEDriverServer.exe");
            DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();

            ieCapabilities.setCapability("nativeEvents", false);
            ieCapabilities.setCapability("unexpectedAlertBehaviour", "accept");
            ieCapabilities.setCapability("ignoreProtectedModeSettings", true);
            ieCapabilities.setCapability("disable-popup-blocking", true);
            ieCapabilities.setCapability("enablePersistentHover", true);

            driver = new InternetExplorerDriver(ieCapabilities);

            driver.manage().window().maximize();
            driver.get("https://demo.nopcommerce.com/");

        }else
            {
                System.out.println(" No Matching Browser "+browser);
            }


        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
    public void closeBrowser(){
        driver.close();
    }

}
