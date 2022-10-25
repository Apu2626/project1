import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IframeHome extends Commonsetup{


    @FindBy(css = "[type=\"text\"]")
    WebElement searchbar;

    void clicksearchbar(String word){
        searchbar.sendKeys(word,Keys.ENTER);             // Kyes.ENTER bcz dont have any click button on google
    }


    @FindBy(css = "[aria-label=\"Sign in\"]")
    WebElement singin;

    void getingin(){
        driver.switchTo().frame(0);
        singin.click();
    }



    @FindBy(css = "[aria-label=\"No thanks\"]")
    WebElement nothanks;
    void clicknothanks() throws InterruptedException {
        driver.switchTo().frame(0);                    // frame syntax
        Thread.sleep(5000);
        nothanks.click();
        driver.switchTo().defaultContent();
    }




}
