package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PassengerDetails {
    WebDriver w;
    public  PassengerDetails(WebDriver W){
        this.w =W;
    }

    //Personal Information
    By NameField = By.xpath("//*[@id=\"passengerNameForward0\"]");
    By Gender = By.xpath("//*[@id=\"genderCodeIdForward0\"]");
    By AgeField = By.xpath("//*[@id=\"passengerAgeForward0\"]");
    By SelectConssecion = By.xpath("//*[@id=\"concessionIdsForward0\"]");
    By Nationality  = By.xpath("//*[@id=\"nationalityForward0\"]");


    public void EnterName(String name) {
        w.findElement(NameField).sendKeys(name);
    }
    public void ChooseGender(int i) {
        WebElement Sortby= w.findElement(Gender);
        Select DropDown = new Select(Sortby);
        DropDown.selectByIndex(i);
    }
    public void EnterAge(int age) {
        w.findElement(AgeField).sendKeys(Integer.toString(age));
    }
    public void ChooseSelectConssecion(int i) {
        WebElement Sortby= w.findElement(SelectConssecion);
        Select DropDown = new Select(Sortby);
        DropDown.selectByIndex(i);
    }
    public void ChooseNationality(int i) {
        WebElement Sortby= w.findElement(Nationality);
        Select DropDown = new Select(Sortby);
        DropDown.selectByIndex(i);
    }
}
