package Pom_Packages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Homepage_web
{
    public WebDriver driver;
    public WebDriverWait waitcondtions(int time)
    {
        return new WebDriverWait(driver, Duration.ofSeconds(time));
    }
    public Actions action_handling()
    {
         return new Actions(driver);
    }
    public Homepage_web(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[text()='Sign up']")
    private WebElement Sign_up_button;
    public void Sign_up_validation()
    {
       waitcondtions(10).until(ExpectedConditions.visibilityOf(Sign_up_button));
        if(Sign_up_button.isDisplayed())
        {
            Assert.assertTrue(true);
        }
    }
    @FindBy(xpath = "//button[text()='Sign in']")
    private WebElement Sign_in_title;
    public WebElement Sign_in_title_validation()
    {
        return Sign_in_title;
    }
    @FindBy(xpath = "//div[@class='tnh-sign-in']")
    private WebElement Sign_in;
    public void Sign_in_button_click()
    {
        waitcondtions(10).until(ExpectedConditions.visibilityOf(Sign_in));
        Sign_in.click();
        if(Sign_in_title_validation().isDisplayed())
        {
            Assert.assertTrue(true);
        }
    }
    @FindBy(xpath = "//div[text()='Products']")
    private WebElement products_tab_homepage;
    public WebElement product_tab()
    {
        waitcondtions(10).until(ExpectedConditions.visibilityOf(products_tab_homepage));
        return products_tab_homepage;
    }

}
