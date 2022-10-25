    import org.checkerframework.checker.units.qual.Current;
    import org.openqa.selenium.By;
    import org.openqa.selenium.Keys;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.interactions.Actions;
    import org.openqa.selenium.support.FindBy;
    import org.openqa.selenium.support.ui.ExpectedCondition;
    import org.openqa.selenium.support.ui.ExpectedConditions;
    import org.openqa.selenium.support.ui.WebDriverWait;

    import java.time.Duration;
    import java.util.concurrent.TimeUnit;

    public class Homepage extends Commonsetup {


    @FindBy(css = "[aria-label=\"Who We Are\"]")        // cssselector
    WebElement whoweare;

    void clickwhoweare (){
        whoweare.click();
    }

    @FindBy(xpath = "//div[@class=\"header-component-nav-container\"]/ul/li[2]/a")      //xpath for optum
    WebElement optum;

    void clickOptum(){
    optum.click();}


     @FindBy(xpath = "//ul[@class=\"footer__links\"]/li/a")
     WebElement contact;

    void clickContact() throws InterruptedException {
        Thread.sleep(20000);                         // wait
        contact.click();
    }


        @FindBy(xpath = "//ul[@class=\"footer__links\"]/li/a")
        WebElement contact1;
    void clickcontact1(){
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);          // implicicit wait
        contact1.click();
    }



        @FindBy(xpath = "//ul[@class=\"footer__links\"]/li/a")
        WebElement contact2;

    void hitContact(){                                                                   // Explicit wair
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class=\"footer__links\"]/li/a")));
        contact2.click();}



        @FindBy(xpath = "//ul[@class=\"footer__links\"]/li[2]/a")
        WebElement suppliers;

     void clickSupplier(){                                        // select move to elements
         Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.xpath("//ul[@class=\"footer__links\"]/li[2]/a"))).build().perform();
         suppliers.click();
     }



        @FindBy(xpath = "//body[@class=\"home global page basicpage\"]")
        WebElement suppliers1;

        void clickTheSupplier() {                                        // select double click
            Actions a = new Actions(driver);
            a.doubleClick(driver.findElement(By.xpath("//ul[@class=\"footer__links\"]/li[2]/a"))).build().perform();
            suppliers1.click();
        }




        @FindBy(xpath = "//ul[@class=\"footer__links\"]/li[2]/a")
        WebElement suppliers2;

        void clickTheSupplier2() {                                        // actions right click
            Actions a = new Actions(driver);
            a.contextClick(driver.findElement(By.xpath("//ul[@class=\"footer__links\"]/li[2]/a"))).build().perform();
            suppliers2.click();
        }




        @FindBy(css = "[class=\"direct external pink-external\"]")
        WebElement sustainability;
        void clickSustainability(){

            sustainability.click();
        }


        @FindBy(css = "[style=\"text-decoration: underline;\"]")
        WebElement clickyes;
        void clickAlert() throws InterruptedException {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[style=\"text-decoration: underline;\"]")));
            driver.switchTo().frame(0);
            clickyes.click();
            driver.switchTo().defaultContent();
        }

        @FindBy(xpath = "//[@class=\"search-button af-icon-button\"]")
        WebElement searchcircle;

        void clickOnsecarh(){
            searchcircle.click();
        }



        @FindBy(css = "[class=\"home global page basicpage\"]")
        WebElement searchbar2;

        void clickOnsearchbarA(){
            searchbar2.click();

        }


        @FindBy(css = "[/html/body]")
        WebElement text;

        void gettext (){

            text.sendKeys("Careers");
        }





        @FindBy(css = "[onclick=\"closemodal(this);return false;\"]")
        WebElement aleart;

        void hitaleart() throws InterruptedException {

            driver.switchTo().frame(0);
            Thread.sleep(5000);
            aleart.click();
            driver.switchTo().defaultContent();
        }
















}
