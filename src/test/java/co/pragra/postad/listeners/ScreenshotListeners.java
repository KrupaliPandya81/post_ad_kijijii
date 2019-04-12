package co.pragra.postad.listeners;

import co.pragra.postad.testcases.DetailsTest;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotListeners implements ITestListener {

    public void onTestStart(ITestResult iTestResult) {

    }

    public void onTestSuccess(ITestResult iTestResult) {
        SimpleDateFormat format=new SimpleDateFormat("ddMMYYYYHHmmss");
        Date date=new Date();
        String Filename="ScreenShot_"+iTestResult.getName()+"_"+format.format(date)+".png";
        Path path= Paths.get("target","Screenshot");
        WebDriver driver=(WebDriver)iTestResult.getTestContext().getAttribute("WevDriver");

        try {
            Files.createDirectory(Paths.get(path.toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
        File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File diskfile=new File(path.toString()+"/"+Filename);

            com.google.common.io.Files.copy(screenshot,diskfile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onTestFailure(ITestResult iTestResult) {
    }

    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {

    }
}
