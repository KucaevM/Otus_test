package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class Page1 extends PageObject {

    @FindBy(name = "fromPort")
    private WebElement ElementfromPort;

    @FindBy(name = "toPort")
    private WebElement ElementtoPort;

    @FindBy(css = "body div > input")
    private WebElement EnterToFind;


    public Page1 (WebDriver driver) {super(driver);}

    public void ChooseFromTheListFromPort(String value) {
        Select selectfromPort = new Select(ElementfromPort);
        selectfromPort.selectByValue(value);

    }

    public void ChooseFromTheListToPort(String value) {
        Select selecttoPort = new Select(ElementtoPort);
        selecttoPort.selectByValue(value);

    }

    public Page2 submitEnterToFind() {
        EnterToFind.click();
        return new Page2(driver);

    }
}
