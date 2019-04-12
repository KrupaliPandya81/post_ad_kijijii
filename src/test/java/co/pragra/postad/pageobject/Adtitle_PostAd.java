package co.pragra.postad.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adtitle_PostAd {

    WebDriver driver;

    @FindBy(id="AdTitleForm")
    WebElement ad_title_text;

    public Adtitle_PostAd(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public String get_Adtitle(){
        String Ad_title=ad_title_text.getText();
        return Ad_title;
    }

}
