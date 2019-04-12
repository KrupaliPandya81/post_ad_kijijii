package co.pragra.postad.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kijijii_HomePage {

    WebDriver driver;
    @FindBy(linkText ="Sign In")
    WebElement signin;

public Kijijii_HomePage(WebDriver driver){
    this.driver=driver;
    PageFactory.initElements(driver,this);
}
public SigninPage click_signin(){
    this.signin.click();
    return new SigninPage(driver);
}

}
