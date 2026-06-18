package stepdefinitions;
import io.cucumber.java.en.*;
import pages.LoginPage;

public class LoginSteps {

    LoginPage loginpage= new LoginPage();

    @Given("user on the OpenCart login Page")
    public void userOnTheOpenCartLoginPage()
    {

        System.out.println("userOnTheOpenCartLoginPage");
    }

     @Given("user is on loginpage")
    public void userIsOnLoginpage()
     {

         loginpage.openBrowser();
     }

    @When("user enters username and password")
    public void userEntersUsernameAndPassword()
    {
        loginpage.enterUsername("qatestertest@gmail.com");
        loginpage.enterPassword("Test@123");

    }

    @And("user clicks on login button")
    public void userClicksOnLoginButton()
    {
        loginpage.clickonloginbutton();

    }

    @Then("user able to login successfully")
    public void userAbleToLoginSuccessfully()
    {
        loginpage.verifylogin();
    }






}
