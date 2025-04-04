package org.example;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class StepsMethod {
    WebDriver driver = new ChromeDriver();




    public String FirsMethod() {
        try {
            driver.get("https://www.pirsoilgas.ru/");
            Thread.sleep(1000);
            WebElement button = driver.findElement(By.xpath("//a[contains(@href, 'work/')]"));
            WebElement menu = driver.findElement(By.cssSelector("button[data-rd-navbar-toggle='.rd-navbar-nav-wrap']"));

            if (button.isDisplayed()) {

                button.click();

                Thread.sleep(3000);

            }

            else {
                menu.click();

                Thread.sleep(1000);

                button.click();


            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        return driver.getCurrentUrl();
    }

    public String SecondMethod() {

        try {

            WebElement button = driver.findElement(By.xpath("//ul[@class='list-xxs small nw']//a[text()='Информационные системы']"));

            button.click();
            Thread.sleep(500);



        } catch (Exception e) {
            e.printStackTrace();
        }
        return driver.getCurrentUrl();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public String LastMethod() {
        try {

            WebElement button = driver.findElement(By.xpath("//a[@class='a_news' and @href='work/infosystems/korporativnaya-informatsionnaya-sistema-dlya-ohrani-truda-promishlennoy-bezopasnosti-i-proizvodstvennogo-kontrolya-kisot']"));

            button.click();

            Thread.sleep(2000);



        } catch (Exception e) {
            e.printStackTrace();

        }


        return driver.getCurrentUrl();
    }
    public void last(){
        ScreenshotWorks screenshotWorks = new ScreenshotWorks();
        screenshotWorks.Screen(getDriver());
    }
}

