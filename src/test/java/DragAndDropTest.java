import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDropTest extends Commonsetup{

    DragAndDropHome home;

    @BeforeMethod
    void setupSelanium(){
        setup("https://demoqa.com/droppable");
        home= PageFactory.initElements(driver,DragAndDropHome.class);
    }

    @Test
    void draganddrop(){

        home.drapablehere();
    }






}
