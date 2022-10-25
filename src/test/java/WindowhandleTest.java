import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class WindowhandleTest extends Commonsetup {

    WindowhangleHome home;

    @BeforeMethod
    void setuoSelenium(){
        setup("https://www.unitedhealthgroup.com/");
        home= PageFactory.initElements(driver,WindowhangleHome.class);
    }





}
