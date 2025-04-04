package org.example;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class StepsMethod {
    WebDriver driver = new ChromeDriver();

    public void FirsMethod() {
        try {
            driver.get("https://www.pirsoilgas.ru/");
            Thread.sleep(6000);
            WebElement button = driver.findElement(By.xpath("//a[contains(@href, 'work/')]"));
            WebElement menu = driver.findElement(By.cssSelector("button[data-rd-navbar-toggle='.rd-navbar-nav-wrap']"));

            if (button.isDisplayed()) {

                button.click();

                Thread.sleep(3000);

            }
            // можно так же сделать чере исключение: NoSuchElementException.
            //так же можно сделать сразу разрешения браузера window.setSize 1920 1080 чтобы сразу можно было выбрать кнопку деятельности.
            else {
                menu.click();

                Thread.sleep(1000);

                button.click();

                String actualURl = driver.getCurrentUrl();
                String correctLink = "https://www.pirsoilgas.ru/work/";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void SecondMethod() {

        try {

            WebElement button = driver.findElement(By.xpath("//ul[@class='list-xxs small nw']//a[text()='Информационные системы']"));

            button.click();
            Thread.sleep(500);



        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void LastMethod() {
        try {

            WebElement button = driver.findElement(By.xpath("//a[@class='a_news' and @href='work/infosystems/korporativnaya-informatsionnaya-sistema-dlya-ohrani-truda-promishlennoy-bezopasnosti-i-proizvodstvennogo-kontrolya-kisot']"));

            button.click();

            Thread.sleep(2000);


        } catch (Exception e) {
            e.printStackTrace();

        }
        finally {
            ScreenshotWorks screenshotWorks = new ScreenshotWorks();
            screenshotWorks.Screen(getDriver());
        }
    }
}

