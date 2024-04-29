package Task2;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.edge.EdgeOptions;
import pages.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestCase {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new Getdriver().getDriver();
    }
    @Test
    public void valid_Register() throws InterruptedException {
        Thread.sleep(400);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)", "");
        RoutePopular r= new RoutePopular(driver);
        r.Enter_turn_right();
        r.EnterRoute();

        Thread.sleep(500);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,700)", "");
        BookYourTicket B=new BookYourTicket(driver);
        B.Enter_arrival_date();
        B.Enter_day();
        B.Enter_button_search_for_Bus();

        driver.manage().window().maximize();
        Thread.sleep(400);
        SelectSeat S=new SelectSeat(driver);
        S.PressSelectSeat();

        Thread.sleep(1000);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");
        S.PressBookTicket();

        Thread.sleep(1000);
        S.PressBoardingPoint();
        Thread.sleep(200);
        S.PressDropingPoint();
        Thread.sleep(200);
        S.PressCustomerDetails();

        Thread.sleep(200);
        CustomerDetails C=new CustomerDetails(driver);
        C.Enter_Mobile_phone(6789125987L);
        C.Enter_Email("Ruwida@gmail.com");









    }

    @AfterTest
    public void AfterRegisterTest() {
        //new Getdriver().quitDriver();
    }
}