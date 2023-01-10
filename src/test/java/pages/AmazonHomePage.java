package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmazonHomePage {
    private WebDriver driver;

    public AmazonHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="twotabsearchtextbox")
    private WebElement searchBox;

    public void searchKeyHitEnter(String Key){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds() )
    }
}
