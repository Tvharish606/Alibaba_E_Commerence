package Pom_Packages;

import Single_ton_usage_package.user_data_calling;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Webelements
{
    public WebDriver driver;
    public user_data_calling data;
    public Homepage_web waiting;

    public Login_Webelements(WebDriver driver)
   {
       this.driver=driver;
       PageFactory.initElements(driver,this);
       data=new user_data_calling();
       waiting=new Homepage_web(driver);
   }
   @FindBy(xpath ="//input[@placeholder='Enter your email or member ID']")
   private WebElement email;
    public void email_id_data()
   {
       waiting.waitcondtions(10).until(ExpectedConditions.visibilityOf(email));
       email.sendKeys(data.username);
   }
   @FindBy(xpath = "//input[@placeholder='Enter password']")
    private WebElement password;
    public void password_textfield()
    {
        waiting.waitcondtions(10).until(ExpectedConditions.visibilityOf(password));
        password.sendKeys(data.password);
    }
    @FindBy(xpath = "//button[text()='Sign in']")
    private WebElement Signin;
    public void Sign_in_Login_page_click()
    {
        waiting.waitcondtions(10).until(ExpectedConditions.visibilityOf(Signin));
        Signin.click();
    }
    @FindBy(xpath = "//span[@class='nc_iconfont btn_slide']")
    private WebElement slider;
    public void Slider_target()
    {
        waiting.waitcondtions(10).until(ExpectedConditions.visibilityOf(slider));
       waiting.action_handling().moveToElement(slider).perform();
       waiting.action_handling().clickAndHold(slider).moveByOffset(200,0).release().perform();
    }
}
