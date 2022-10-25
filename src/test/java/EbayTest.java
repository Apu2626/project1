import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EbayTest extends Commonsetup {



    EbayHome home;

    @BeforeMethod

    void setupSelanium(){
        setup("https://www.ebay.com/");

        home= PageFactory.initElements(driver,EbayHome.class);

    }

    @AfterMethod
    void closebrowser(){
        home.cleanup();
    }


    @Test
    void seehopcategory (){
        System.out.println( home.gettextshop());            // text
    }

    @Test
    void shopcategoryIsTrue(){
        System.out.println(home.shopgateheck());            // boolean
    }




    @Test
    void getText(){
       String product="phone";
        home.getText("phone");
        home.clickit();
        Assert.assertTrue(home.getrerult().contains(product));
    }



    @Test
    void dropDownClick(){
        home.dropdown1();
    }


    @Test
    void dropDownClick2(){
        home.dropdown2();
    }

    @Test
    void dropDownClick3(){
        home.dropdown3();
    }


    // move mouse over
    @Test
    void clickOnbedding() throws InterruptedException {
        home.clickbedding();}



    //locators
    @Test
    void clickShopby(){
        home.shopby();
    }

    @Test
    void clickCarAndTruck(){
        home.shopby();
        home.carAndTruck();
    }


    @Test
    void gettexthi(){
        home.shopby();
        home.carAndTruck();
        home.gethi();
    }

    @Test
    void hiebay(){
        home.getToys();
    }


    @Test
    void seebuy(){
        home.clickbuy();
    }

    @Test
    void seebuy2(){

        home.clickbuy2();
    }

    @Test
    void seebuy3(){
        home.clickbuy3();
       Assert.assertEquals(driver.getCurrentUrl(),"https://www.ebay.com/n/all-categories");
    }

    @Test
    void checktheAbourebay(){
        home.seeaboutebay();
    }













}
