package org.example;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


public class numberOne {
    WebDriver driver = new ChromeDriver();
    public void number() {

        try {
            driver.get("https://www.pirsoilgas.ru/");
            Thread.sleep(6000);
            WebElement button =  driver.findElement(By.xpath("//a[contains(@href, 'work/')]"));
            WebElement menu = driver.findElement(By.cssSelector("button[data-rd-navbar-toggle='.rd-navbar-nav-wrap']"));

            if(button.isDisplayed()){

                button.click();

                Thread.sleep(3000);

            }
            // можно так же сделать чере исключение: NoSuchElementException.
            //так же можно сделать сразу разрешения браузера window.setSize 1920 1080 чтобы сразу можно было выбрать кнопку деятельности.
            else{
                menu.click();

                Thread.sleep(1000);

                button.click();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    public void twoMethod(){

        try {
            WebElement button = driver.findElement(By.xpath("//ul[@class='list-xxs small nw']//a[text()='Информационные системы']"));

            button.click();
            Thread.sleep(6000);


        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {



        }
    }
}

