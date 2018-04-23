package MyPackage.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.WebDriverManager;

public  class BaseClasse {
    protected WebDriver driver;

    @BeforeClass
    public void BeforeClass(){

        //driver = new ChromeDriver();
        driver = WebDriverManager.getInstans();

    }


    @AfterClass
    public void AfterClass() {

       driver.quit();
    }
}