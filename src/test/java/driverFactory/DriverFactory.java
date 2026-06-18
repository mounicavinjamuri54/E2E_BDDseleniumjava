package driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

  private static ThreadLocal<WebDriver>driver = new ThreadLocal<>();
    //why private --prevent missuse driver from other classes, driver may set null, so framework breakage
    //why static -- Only one variable per class , accessable without creating object
    //ThreadLocal<WebDriver>:----Store WebDriver objects separately for each thread
    //---if not static ---each object gets seperate variable and driver becomes inconsistent
    //In BDD --Hooks class, stepdef, page classes all need same driver reference
    //Thread Local -->each thread gets its own driver ---> Thread 1 → ChromeDriver,//Thread 2 → ChromeDriver,
    // Thread 3 → ChromeDriver 3 ------>✔ No conflicts, //✔ Safe parallel execution

    //set, get, quit
    public static void initDriver(String browser){ // String browser --input from config
        //Initialize browser --Industry standard
        //initDriver --create webDriver instance
        WebDriver driverInstance = null;

        if(browser.equalsIgnoreCase("chrome"))
        {
          driverInstance = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("edge")){
        driverInstance = new EdgeDriver();
      }
        else if(browser.equalsIgnoreCase("firefox")){
          driverInstance = new FirefoxDriver();
        }
        else{
          throw new RuntimeException("Browser not supported");
        }
      driverInstance.manage().window().maximize();
        driver.set(driverInstance); //Store this ChromeDriver inside ThreadLocal for the current thread

    }
    public static WebDriver getDriver(){
        //getDriver -- uses it

        //getDriver() → returns driverInstance--->which driver it stores that Driver
        //.get() → opens URL in that browser
      return driver.get();
    }
    public static void quitDriver(){
        //quitDriver ---closes it
      if(driver != null)
      {
        driver.get().quit();
        driver.remove();
      }
    }

}
