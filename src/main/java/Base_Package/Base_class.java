package Base_Package;

import Single_ton_usage_package.user_data_calling;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base_class
{
    public user_data_calling data;
    public WebDriver driver;

    public void setupbrowser()
    {
        data=new user_data_calling();
        if(data.browser.equalsIgnoreCase("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options=new ChromeOptions();
            options.addArguments("--disable-notifications");
            driver=new ChromeDriver(options);
        }
        else if (data.browser.equalsIgnoreCase("Firefox"))
        {
          WebDriverManager.firefoxdriver().setup();
          FirefoxOptions options=new FirefoxOptions();
            options.addArguments("--disable-notifications");
          driver=new FirefoxDriver();
        }
        else if(data.browser.equalsIgnoreCase("msedge"))
        {
            WebDriverManager.edgedriver().setup();
            EdgeOptions options=new EdgeOptions();
            options.addArguments("--disable-notifications");
            driver=new EdgeDriver(options);
        }
        else {
            WebDriverManager.iedriver().setup();
            InternetExplorerOptions options=new InternetExplorerOptions();
            options.addCommandSwitches("--disable-notifications");
            driver=new InternetExplorerDriver(options);
        }
    }
    @BeforeClass
    public void Browsersetup()
    {
        setupbrowser();
    }
    @AfterClass
    public void Teardown()
    {
//        if(driver!=null)
//        {
//            driver.close();
//        }
    }
    public WebDriver getdriver()
    {
        return driver;
    }
    public user_data_calling getdata()
    {
        return data;
    }
}
