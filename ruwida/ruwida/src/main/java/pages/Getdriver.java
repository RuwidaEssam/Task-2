package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.Dimension;

public class Getdriver {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            Dimension dimension = new Dimension(1024, 768);
            EdgeOptions options= new EdgeOptions();
            options.addArguments("inprivate");
            driver = new EdgeDriver();
            driver.manage().window().setSize(dimension);
            driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");

        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}

