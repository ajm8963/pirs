package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotWorks {
    public void Screen(WebDriver driver){

        try {
            File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screen, new File("C:\\project\\PirsTest\\screenshots\\screenshot.png"));
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally{
            {
                driver.quit();
            }
        }
    }
}
