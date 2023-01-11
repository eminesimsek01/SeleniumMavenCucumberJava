package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OhlHomePage {
    private WebDriver driver;

    public OhlHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(name="username")
    private WebElement username;

    @FindBy(name="password")
    private WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;
    @FindBy(className = "oxd-alert-content oxd-alert-content--error")
    public WebElement failedText;
    public void loginUsername (String name) {

        username.sendKeys("name");
    }
    public void loginPassword(String sıfre){
        password.sendKeys("sıfre");
    }
    public void logintıklama(){
        submitButton.click();
    }

}
