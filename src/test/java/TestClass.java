import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass extends Commonsetup {

    Homepage home;

    @BeforeMethod
    void SetupSelenium() {
        setup("https://www.unitedhealthgroup.com/");

        home = PageFactory.initElements(driver, Homepage.class);

    }

 //   @AfterMethod
    void colusthebrowser(){
        home.cleanup();
    }



    @Test
    void clickWhoWeAre() {
        home.clickwhoweare();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.unitedhealthgroup.com/");
    }


    @Test
    void clickOnOptum() {
        home.clickOptum();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.unitedhealthgroup.com/");
    }


    @Test
    void gettextContactus() throws InterruptedException {

        home.clickContact();
    }

    @Test
    void textcontact() {
        home.clickcontact1();
    }

    @Test
    void howToContactUs() {
        home.hitContact();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.unitedhealthgroup.com/contact-us.html");
    }

    @Test
    void hitSupplier() {

        home.clickSupplier();

    }


    @Test
    void doubleclickSupplier() {
        home.clickTheSupplier();
    }


    @Test
    void rightclickSupplier2() {
        home.clickTheSupplier2();

    }


    @Test
    void ClickSustainability() {
        home.clickSustainability();
    }


    @Test
    void clickYesAfterVisit() throws InterruptedException {
        home.clickSustainability();
        home.clickAlert();
    }

    @Test
    void clickthesearchcircle() {

        home.clickOnsecarh();
        home.clickOnsecarh();
        home.gettext();
    }


    @Test
    void click2() throws InterruptedException {
        home.clickOnsecarh();
        home.clickOnsearchbarA();
         home.gettext();
        home.hitaleart();


    }


}
