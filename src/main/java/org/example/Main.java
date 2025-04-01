package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://www.pirsoilgas.ru/work/infosystems/korporativnaya-informatsionnaya-sistema-dlya-ohrani-truda-promishlennoy-bezopasnosti-i-proizvodstvennogo-kontrolya-kisot");

            File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screen, new File("C:\\project\\PirsTest\\screenshots\\screenshot.png"));
        }
        catch (IOException e){
            e.printStackTrace();
        } finally{
            {
                driver.quit();
            }
        }
    }
}