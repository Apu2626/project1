import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.security.Key;
import java.util.List;

public class EbayHome extends Commonsetup {


    @FindBy(id = "gh-shop-a")     // using id
    WebElement shopbycate;

    String gettextshop(){
       return shopbycate.getText();
    }

    boolean shopgateheck(){
        return shopbycate.isDisplayed();
    }




    @FindBy(css = "[type=\"text\"]")                    //sentkeys
    WebElement searchbutton;
    void getText(String product){
        searchbutton.sendKeys(product);
    }


    @FindBy(css = "[type=\"submit\"]")                      //click
    WebElement click;
    void clickit(){
        click.click();
    }

    @FindBy(css = "[class=\"srp-controls__count-heading\"]")                // result for Assert
    WebElement result;
    String getrerult(){
        return result.getText();        // get Text hsa retura value

    }


    // dropdown/select

    @FindBy(css = "[aria-label=\"Select a category for search\"]")
    WebElement dropdownA;

    void dropdown1(){
        Select select = new Select(dropdownA);           //select syntax
        select.selectByIndex(3);
        dropdownA.click();
    }


    @FindBy(css = "[aria-label=\"Select a category for search\"]")
    WebElement dropdownB;
    void dropdown2(){

        Select select = new Select(dropdownB);
         select.selectByValue("12576");                  // value copy past from HTML
        dropdownA.click();

    }

    @FindBy(css ="[aria-label=\"Select a category for search\"]")
    WebElement dropdownC;
     void dropdown3(){
        Select select = new Select(dropdownC);
        select.selectByVisibleText("Books");                 // type and write
         dropdownC.isDisplayed();
     }



    //Actions, move mouse over

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[6]/a")
    WebElement bedding;
     void clickbedding() throws InterruptedException {
         Actions a = new Actions(driver);
         a.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[6]/a"))).build().perform();
        // Thread.sleep(5000);
         driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[6]/div[2]/div[1]/nav[2]/ul/li[6]/a"));
        bedding.click();

     }

     // locators

    @FindBy(className = "gh-control")          // classname locator
    WebElement shopbycatagory;
     void shopby(){

         shopbycatagory.click();
     }


     @FindBy(xpath = "//*[@id=\"gh-sbc\"]/tbody/tr/td[1]/ul[1]/li[2]/a")    // x-path locator
    WebElement car;

     void carAndTruck (){
        car.click();
     }


     @FindBy(id = "gh-ug")                  // use id locator
    WebElement hi;
     String gethi(){
        return hi.getText();
     }

     @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[8]/a")
    WebElement toys;
     boolean getToys(){
         return toys.isDisplayed();
     }



     //Actions


     @FindBy(css = "[data-sp=\"m571.l3601\"]")          // cssselector locator
    WebElement buy;
     void clickbuy(){                                       // action
         Actions a = new Actions(driver);
         a.moveToElement(buy).build().perform();        // buy = (driver.fineelements(Byxpath())
         buy.click();
     }


    @FindBy(css = "[data-sp=\"m571.l3601\"]")
    WebElement buy2;
    void clickbuy2(){                                       // action // buy = (driver.fineelements(Byxpath())
        Actions a = new Actions(driver);
        a.moveToElement(buy).keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_UP).build().perform();   //action keysup and keysdown
        buy.click();
    }




    @FindBy(css = "[data-sp=\"m571.l3601\"]")
    WebElement buy3;
    void clickbuy3(){                                       // action // buy = (driver.fineelements(Byxpath())
        Actions a = new Actions(driver);
        a.moveToElement(buy).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();   //open a new tab with action class
        buy.click();
    }




    // Find Elements

    @FindBy(css = "[class=\"gf-bttl thrd\"]")                   //multipale elements
    WebElement aboutebay;

    boolean seeaboutebay(){
        List<WebElement>elements= driver.findElements(By.cssSelector("[class=\"gf-bttl thrd\"]"));      // syntax
        for (WebElement a: elements){                           // advance loop
            System.out.println(a.getText());
            System.out.println(a.isDisplayed());
        }
        return aboutebay.isDisplayed();

    }








}
