import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AleartHandleHome extends Commonsetup {



    @FindBy(css = "[id=\"alertButton\"]")
    WebElement clickme;
    void clickbutton() throws InterruptedException {
        clickme.click();
        Thread.sleep(10000);
        driver.switchTo().alert().dismiss();

    }

    @FindBy(css = "[id=\"alertButton\"]")
    WebElement click;
    void hitclickbutton() throws InterruptedException {
        click.click();
        Thread.sleep(10000);
        driver.switchTo().alert().accept();
    }




}
