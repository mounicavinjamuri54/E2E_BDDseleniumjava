package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    WebDriver driver;

    public void openBrowser()
    {
       driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
    }

    public void enterUsername(String username)

    {
        driver.findElement(By.id("input-email")).sendKeys(username);
    }

    public void enterPassword(String password)
    {
        driver.findElement(By.id("input-password")).sendKeys(password);
    }

    public void clickonloginbutton()
    {
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    public void verifylogin()
    {
    System.out.println("Login Successful");
    driver.quit();
    }


}
