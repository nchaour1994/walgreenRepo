package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

     static Properties properties;
    public  static Properties getProperties(){
        properties=new Properties();
        try {
            FileInputStream file=new FileInputStream("C:\\Users\\nchao\\IdeaProjects\\myWalgreensFramework\\walgreens\\src\\test\\resources\\config.properties");
            try {
                properties.load(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return properties;
    }
}
