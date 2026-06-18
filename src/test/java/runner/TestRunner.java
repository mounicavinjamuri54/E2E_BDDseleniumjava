package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        plugin = {"pretty","html:target/report.html", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
    //TestRunner--child class
    //AbstractTestNGCucumberTests---parent class
//    Without AbstractTestNGCucumberTests:
//
//            ❌ Cucumber scenarios will NOT run with TestNG
//
//    With AbstractTestNGCucumberTests:
//
// ✅ Each Scenario runs like a TestNG test
//✅ You can use TestNG features:
//    Parallel execution
//    Reports, Groups
}
