package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {// class created to get read and get data from config file

   public static Properties prop;//java class --->read key-value pairs from config file-->i.e browser(key) = chrome(value)

    public ConfigReader(){ //---constructor

       // ConfigReader config  = new ConfigReader();//constructor:-- when  object is created runs automatically
        try {
            FileInputStream file = new FileInputStream("/src/test/resources/config.properties");//opens file
            prop = new Properties();
            prop.load(file);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String get(String key){
        if (prop == null)
        {
            throw new RuntimeException("config not loaded. Call configReade() first.....");
        }
        return prop.getProperty(key);
    }
}
