package Test_script_package;
import Base_Package.Base_class;
import Pom_Packages.Homepage_web;
import Pom_Packages.Login_Webelements;
import Single_ton_usage_package.user_data_calling;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
public class Login_handling extends Base_class
{
    public WebDriver driver;
    public user_data_calling data;
    public Homepage_web home;
    public Login_Webelements login;
    @BeforeMethod
    public void setupdriver()
    {
        driver=super.getdriver();
       data= super.getdata();
       home=new Homepage_web(driver);
       login=new Login_Webelements(driver);
    }
    @Test(groups = "smoke",priority = 0,description = "one step is to sign in via url to the application")
    public void Sign_in_the_app()
    {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to(data.url);
        home.Sign_up_validation();
        home.Sign_in_button_click();
    }
    @Test(groups = "smoke",priority = 1,description = "Login_successfully with valid creditionals")
    public void Login_with_user_cred()
    {
        login.email_id_data();
        login.password_textfield();
        login.Sign_in_Login_page_click();

    }
    @Test(groups = "smoke",priority = 2,description = "validate user is in homepage")
    public void validate_user_in_homepage()
    {
        login.Slider_target();
        if(home.product_tab().isDisplayed())
        {
            Assert.assertTrue(true);
        }
    }


}