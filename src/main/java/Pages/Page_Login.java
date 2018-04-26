package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.WebDriverManager;


public class Page_Login {

    private final static By BATTON_LOGIN = By.cssSelector("[class = 'btn btn-primary']");


    private WebElement getLoginElement() {
        return WebDriverManager.getInstans().findElement(BATTON_LOGIN);
    }

    public int getSizeLoginHeight(){
        return getLoginElement().getSize().height;
    }
    public int getSizeLoginWidth(){
        return getLoginElement().getSize().width;
    }

    public String getBackgroundColorLogin() {
        return getLoginElement().getCssValue("background-color");
    }

    public void moveToElementLogin() {

        Actions actions = new Actions(WebDriverManager.getInstans());
        actions.moveToElement(getLoginElement()).build().perform();
    }
}