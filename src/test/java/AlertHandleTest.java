import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertHandleTest extends Commonsetup{

    AleartHandleHome home;
    @BeforeMethod
    void setpuSelenium (){
        setup("https://demoqa.com/alerts");
    home= PageFactory.initElements(driver,AleartHandleHome.class);
    }

    @AfterMethod
    void closebrowser(){
        home.cleanup();
    }


    @Test
    void dismissAleart() throws InterruptedException {
        home.clickbutton();
    }


    @Test
    void AcceptAleart() throws InterruptedException {
        home.hitclickbutton();
    }





}
