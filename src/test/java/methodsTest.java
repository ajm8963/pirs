import org.example.numberOne;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class methodsTest {
        WebDriver driver = new ChromeDriver();
        @Test
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
                Thread.sleep(1000);
                String actualURl = driver.getCurrentUrl();
                String correctLink = "https://www.pirsoilgas.ru/work/";
                assertEquals(actualURl, correctLink);
            }
            catch (Exception e){
                e.printStackTrace();
            }

        }


        @Test
        public void twoMethod(){

            try {
                WebElement button = driver.findElement(By.xpath("//ul[@class='list-xxs small nw']//a[text()='Информационные системы']"));

                button.click();

                Thread.sleep(6000);

                String actualUrl = driver.getCurrentUrl();
                String correctUrl = "https://www.pirsoilgas.ru/work/infosystems/";
                assertEquals(actualUrl,correctUrl);

            }
            catch (Exception e){
                e.printStackTrace();
            }
            finally {



            }
        }
    }


