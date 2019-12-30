package com.framework;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;


public class Base {

    public static WebDriver driver;

    @Step("Trying to open <browserName> browser")
    public void driverIni(String browserName){

        if (browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
            driver= new ChromeDriver();
        } else if (browserName.equals("firefox")){
            System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
            driver= new FirefoxDriver();
        } else {
            System.out.println("No browser available.");
        }
    }

    @Step("Navigate to <urlName>")
    public void navigateURL(String urlName) {
        driver.manage().window().maximize();
        driver.get(urlName);
    }

    @Step("Close open browser")
    public void postcondtions(){
        driver.quit();
    }

}
