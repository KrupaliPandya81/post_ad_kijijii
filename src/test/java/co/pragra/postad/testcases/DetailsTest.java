package co.pragra.postad.testcases;

//import co.pragra.postad.listeners.ScreenshotListeners;
import co.pragra.postad.pageobject.Kijijii_HomePage;
import co.pragra.postad.pageobject.SigninPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
//@Listeners(ScreenshotListeners.class)
public class DetailsTest {

WebDriver driver;

@BeforeSuite
    public void setup(){
     System.setProperty("webdriver.chrome.driver","c:/Selenium/Driver/chromedriver.exe");
     driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
     driver.get("https://www.kijiji.ca");

}

@Test
    public void Signin_Test(){
    Kijijii_HomePage homepage=new Kijijii_HomePage(driver);
    homepage.click_signin();
    SigninPage siginpage=new SigninPage(driver);
    //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    siginpage.enter_email("krupalipandya81@gmail.com");
    siginpage.enter_password("chirag@9584");

   // Assert.assertEquals(check_email,"kselproj.2019@gmail.com","Valid email id");
    //Assert.assertEquals(check_pswd,"Kselproj2019*","Valid password");
    siginpage.click_signinbtn();

}


}
