package helpers;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.io.FileInputStream;

public class configurationHelper{
    public static Properties getConfig() throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream("C:\\Users\\MThar\\IdeaProjects\\parentApsTask\\src\\helpers\\config.properties");
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return properties;
    }
}