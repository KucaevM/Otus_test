package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
    static WebDriver driver;

    public  static WebDriver getInstans() {
        if (driver==null) {
            driver = new ChromeDriver();
        }
        return driver;
    }
}
