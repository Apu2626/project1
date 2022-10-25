import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IframeTest extends Commonsetup {


    IframeHome home;

    @BeforeMethod
    void setupSelenium() {
        setup("https://www.google.com/");

        home = PageFactory.initElements(driver, IframeHome.class);
    }

    @AfterMethod
    void closrBro(){
        home.cleanup();
    }

    @Test
    void clickOnSearchbar(){
        home.clicksearchbar("laptop");
    }


    @Test
    void clicksingin() throws InterruptedException {
       home.getingin();
    }

    @Test
    void clicknoThanks() throws InterruptedException {
        home.clicksearchbar("pen");
        home.clicknothanks();


    }








}