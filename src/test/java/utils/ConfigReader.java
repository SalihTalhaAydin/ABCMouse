package utils;

import org.openqa.selenium.NotFoundException;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    static {
        String path = "configuration.properties";
        try {
            FileInputStream input = new FileInputStream(path); // opens the file in the path
            properties = new Properties();
            properties.load(input); // loads the file details
        } catch (Exception e) {
            throw new NotFoundException("ERROR!!! The file could not find");
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

    public static String replaceWithConfig(String str) {
        do{
            if(!str.contains("{{")) break;
            String key = str.substring(
              str.indexOf("{{") + 2,
              str.indexOf("}}")
            );
            String value = getProperty(key);
            str = str.replace("{{" + key + "}}", value);
        }while (str.contains("{{"));
        return str;
    }
}
