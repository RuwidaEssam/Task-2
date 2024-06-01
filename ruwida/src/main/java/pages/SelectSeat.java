package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectSeat {
    WebDriver w;
    //int i=1;
    public SelectSeat(WebDriver W){
        this.w =W;
    }
    By SelectSeat=By.xpath("//*[@onclick=\"displayLayoutRevampDiv('Forward', '0',\n" +
            "\t\t\t\t\t\t\t '1690523241081', '1690523241084',\n" +
            "\t\t\t\t\t\t\t '1696583213595', 'Forward0');\"]");
    By book_ticket1=By.xpath("//*[@id=\"Forward2\"]");
    By Button_BoardingPoint=By.xpath("//*[@id=\"Forwardboarding-tab\"]");
    By Button_DropingPoint=By.xpath("//*[@id=\"Forwarddroping-tab\"]");
    By Button_CustomerDetails=By.xpath("//*[@id=\"Forwardprofile-tab\"]");

    public void PressSelectSeat() {
        w.findElement(SelectSeat).click();
    }
    public void PressBookTicket() {
        w.findElement(book_ticket1).click();
    }
    public void PressBoardingPoint() {
        w.findElement(Button_BoardingPoint).click();
    }
    public void PressDropingPoint() {
        w.findElement(Button_DropingPoint).click();
    }
    public void PressCustomerDetails() {
        w.findElement(Button_CustomerDetails).click();
    }

}
