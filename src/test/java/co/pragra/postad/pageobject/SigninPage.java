package co.pragra.postad.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SigninPage {

    WebDriver driver;

    @FindBy(id="LoginEmailOrNickname")
    WebElement email;

    @FindBy(id="login-password")
    WebElement password;

    @FindBy(id="SignInButton")
    WebElement signinButton;

public SigninPage(WebDriver driver){
    this.driver=driver;
    PageFactory.initElements(driver,this);
}

public SigninPage enter_email(String login_email){
this.email.sendKeys(login_email);
return this;
}

public SigninPage enter_password(String login_pswd){
    this.password.sendKeys(login_pswd);
    return  this;
}
public SigninPage click_signinbtn()
{
       this.signinButton.click();
       return this;
}

}
