package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page2 extends PageObject {

    @FindBy(css = "table > tbody > tr:nth-child(1) > td:nth-child(2) >input")
    private WebElement EnterChooseToFind;

    @FindBy(css = "div.container h3")
    private WebElement ElementContainer;

    @FindBy(css = "table > tbody > tr:nth-child(1) > td:nth-child(4)")
    private WebElement ElementTextAirline;

    @FindBy(css = "table > tbody > tr:nth-child(1) > td:nth-child(3)")
    private WebElement ElementTextFlight;


    public Page2 (WebDriver driver) {super(driver);}

    public boolean isInitialized() {return ElementContainer.isDisplayed(); }

    public String getTextElementContainer() {return ElementContainer.getText(); }

    public String getTextElementTextAirline() {return ElementTextAirline.getText(); }

    public String getTextElementTextFlight() {return ElementTextFlight.getText(); }

    public Page3 EnterChooseToFindClick() {
        EnterChooseToFind.click();
        return new Page3(driver);

    }
}
