import org.example.ScreenshotWorks;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepsMethodTest {
    private static WebDriver driver = new ChromeDriver();
    private static String saveUrl;

        @Test
        public void FirsMethodTest() {

            try {
                driver.get("https://www.pirsoilgas.ru/");
                Thread.sleep(6000);
                WebElement button =  driver.findElement(By.xpath("//a[contains(@href, 'work/')]"));
                WebElement menu = driver.findElement(By.cssSelector("button[data-rd-navbar-toggle='.rd-navbar-nav-wrap']"));

                if(button.isDisplayed()){

                    button.click();

                    Thread.sleep(3000);

                    saveUrl = driver.getCurrentUrl();

                }

                else{
                    menu.click();

                    Thread.sleep(1000);

                    button.click();

                    saveUrl = driver.getCurrentUrl();
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
        public void SecondMethodTest(){
            try {
                driver.get(saveUrl);

                WebElement button = driver.findElement(By.xpath("//ul[@class='list-xxs small nw']//a[text()='Информационные системы']"));

                button.click();

                Thread.sleep(1000);

                saveUrl = driver.getCurrentUrl();

                String actualUrl = driver.getCurrentUrl();
                String correctUrl = "https://www.pirsoilgas.ru/work/infosystems/";
                assertEquals(actualUrl,correctUrl);

            }
            catch (Exception e){
                e.printStackTrace();
            }

        }
        @Test
        public void LastMethodTest(){
              try {
                  driver.get(saveUrl);


                  WebElement button = driver.findElement(By.xpath("//a[@class='a_news' and @href='work/infosystems/korporativnaya-informatsionnaya-sistema-dlya-ohrani-truda-promishlennoy-bezopasnosti-i-proizvodstvennogo-kontrolya-kisot']"));

                  button.click();

                  Thread.sleep(2000);

              }catch (Exception e){}
            String actualUrl = driver.getCurrentUrl();
            String correctUrl = "https://www.pirsoilgas.ru/work/infosystems/korporativnaya-informatsionnaya-sistema-dlya-ohrani-truda-promishlennoy-bezopasnosti-i-proizvodstvennogo-kontrolya-kisot";
            assertEquals(actualUrl,correctUrl);
        }

    public static WebDriver getDriver() {
        return driver;
    }

    @Before
        public void screenshot(){
        ScreenshotWorks screenshotWorks = new ScreenshotWorks();
        screenshotWorks.Screen(getDriver());
        }

    }


