package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookYourTicket {

    WebDriver w;
    public BookYourTicket(WebDriver W){
        this.w =W;
    }
    By arrival_date  = By.xpath("//*[@id=\"txtJourneyDate\"]");
    By turn_right  = By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]");
    By choose_day  = By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[4]");
    By Search_for_bus  = By.xpath("//*[@id=\"bookingsForm\"]/div[1]/div/div[2]/div[3]/button");
    public void Enter_day(){
        w.findElement(turn_right).click();
        w.findElement(choose_day).click();
    }
    public void Enter_arrival_date() {
        w.findElement(arrival_date).click();
    }
    public void Enter_button_search_for_Bus() {
        w.findElement(Search_for_bus).click();
    }



}
