package Util_packages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class utils_class
{
       public static FileInputStream fis;
       public static Properties property_reader()
       {
        try {
            fis= new FileInputStream("C:\\Users\\admin\\IdeaProjects\\Alibaba_E_commerace\\src\\main\\resources\\Login_and_browser.properties");

        } catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        Properties pro=new Properties();
        try {
            pro.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
         return pro;
    }

}
