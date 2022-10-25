import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DragAndDropHome extends Commonsetup{



    @FindBy(id = "draggable")               // xpath/ id from dragg folder
    WebElement from;

    @FindBy(id = "droppable")               // xpath / id from droppable folder
    WebElement to;

    void drapablehere() {
        Actions ac = new Actions(driver);
        driver.manage().window().maximize();                       //window maximize syntax

        ac.dragAndDrop(from, to).perform();      // drapanddrag syntax
    }





    }
