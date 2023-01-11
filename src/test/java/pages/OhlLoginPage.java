package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OhlLoginPage {
    WebDriver driver;

    public OhlLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "username")
    WebElement txtUsername;

    @FindBy(name="password")
    WebElement txtPassword;

    @FindBy(xpath = "//button[@type='submit'")
    WebElement btnLogin;

    @FindBy(className = "oxd-alert-content oxd-alert-content--error")
    WebElement errMessage;

    public void typeUsername(String text){
        txtUsername.sendKeys(text);
    }
    public void typePassword (String text){
        txtPassword.sendKeys(text);
    }
    public void clickLogin(){
        btnLogin.click();
    }
    public void verifyErrMessage(String message){
        Assert.assertTrue(errMessage.getText().contains(message));
    }
}