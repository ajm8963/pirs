package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        numberOne Nubmber = new numberOne();
        Nubmber.number();
        Nubmber.twoMethod();
        /*WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://www.pirsoilgas.ru/");

            //File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            //FileUtils.copyFile(screen, new File("C:\\project\\PirsTest\\screenshots\\screenshot.png"));
        }
        //catch (IOException e){
           // e.printStackTrace();
        //}
        finally{
            {
                driver.quit();
            }
        }*/
    }
}