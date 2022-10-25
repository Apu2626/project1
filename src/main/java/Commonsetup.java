import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commonsetup {


       public static WebDriver driver;

    void setup(String url){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");

         driver = new ChromeDriver();
        driver.get(url);
    }

    void cleanup(){
        driver.quit();
    }





}
