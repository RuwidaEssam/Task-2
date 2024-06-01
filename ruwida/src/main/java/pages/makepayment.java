package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class makepayment {
    int i=2;
    WebDriver w;
    public  makepayment(WebDriver W){
        this.w =W;
    }
    By termcheck = By.xpath("//*[@id=\"termsChk\"]");
    By MakePayment = By.xpath("//*[@id=\"PgBtn\"]");

    public void TermCheck() {
            w.findElement(termcheck).click();
    }
    public void pressPaymentButton() {
       w.findElement(MakePayment).click();
    }
}
