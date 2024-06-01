package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RoutePopular {
    WebDriver w;
    public RoutePopular(WebDriver W){
        this.w =W;
    }

    By from_CHIKKAMAGALURU_to_BENGALURU= By.xpath("//*[@onclick=\"populateSearch('1467469338690', 'Chikkamagaluru', '1467467616730', 'Bengaluru');\"]");
    By turn_right= By.xpath("//*[@id=\"routeSlider\"]/div/a[2]");
    public void Enter_turn_right() {
        w.findElement(turn_right).click();
    }
    public void EnterRoute() {
        w.findElement(from_CHIKKAMAGALURU_to_BENGALURU).click();
    }
}
