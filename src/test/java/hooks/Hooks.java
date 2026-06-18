package hooks;

import driverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.ConfigReader;

public class Hooks {

    @Before//Run before EACH scenario
    public void setUp(){

        ConfigReader config = new ConfigReader();
        DriverFactory.initDriver(ConfigReader.get("browser"));//getting values from configReader
        DriverFactory.getDriver().get(ConfigReader.get("url"));

    }

    @After//Run after EACH scenario
    public void tearDown()
    {
        DriverFactory.quitDriver();

    }
}
