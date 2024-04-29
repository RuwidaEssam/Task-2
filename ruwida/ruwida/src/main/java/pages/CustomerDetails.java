package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomerDetails {
    WebDriver w;
    public CustomerDetails(WebDriver W){
        this.w =W;
    }
    By Mobile_phone = By.xpath("//*[@id=\"mobileNo\"]");
    By Email= By.xpath("//*[@id=\"email\"]");
    public void Enter_Mobile_phone(long mobile) {
        w.findElement(Mobile_phone).sendKeys(Long.toString(mobile));
    }
    public void Enter_Email(String email) {
        w.findElement(Email).sendKeys(email); ;
    }
}
