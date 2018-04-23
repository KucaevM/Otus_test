package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class Page3 extends PageObject {

    @FindBy(css = "#inputName")
    private WebElement ElementInputName;

    @FindBy(css = "#address")
    private WebElement ElementAddress;

    @FindBy(css = "#city")
    private WebElement ElementCity;

    @FindBy(css = "#state")
    private WebElement ElementState;

    @FindBy(css = "#zipCode")
    private WebElement ElementZipCode;

    @FindBy(css = "#cardType")
    private  WebElement ElementСardType;

    @FindBy(css = "#creditCardNumber")
    private  WebElement ElementCreditCardNumber;

    @FindBy(css = "#creditCardMonth")
    private  WebElement ElementCreditCardMonth;

    @FindBy(css = "#creditCardYear")
    private  WebElement ElementCreditCardYear;

    @FindBy(css = "#nameOnCard")
    private WebElement ElementNameOnCard;

    @FindBy(css = "div [class = 'btn btn-primary']")
    private WebElement ElementEnterBtn;

    public Page3 (WebDriver driver) {super(driver);}

    public void ElementInputNameSendKeys(String Name) {
        ElementInputName.sendKeys(Name);
    }

    public void ElementAddressSendKeys(String Address) {
        ElementAddress.sendKeys(Address);
    }

    public void ElementCitySendKeys(String City) {
        ElementCity.sendKeys(City);
    }

    public void ElementStateSendKeys(String State) {
        ElementState.sendKeys(State);
    }

    public void ElementZipCodeSendKeys(String ZipCode) {
        ElementZipCode.sendKeys(ZipCode);
    }

    public void ElementCreditCardNumberSendKeys(String CardNumber) {
        ElementCreditCardNumber.sendKeys(CardNumber);
    }

    public void ElementCreditCardMonthSendKeys(String Month) {
        ElementCreditCardMonth.clear();
        ElementCreditCardMonth.sendKeys(Month);
    }

    public void ElementCreditCardYearSendKeys(String Year) {
        ElementCreditCardYear.clear();
        ElementCreditCardYear.sendKeys(Year);
    }

    public void ElementNameOnCardSendKeys(String NameOnCard) {
        ElementNameOnCard.sendKeys(NameOnCard);
    }

    public void ElementСardTypeSelect(String СardType) {
        Select selectСardType = new Select(ElementСardType);
        selectСardType.selectByValue(СardType);

    }

    public Page4 EnterToBtn() {
        ElementEnterBtn.click();
        return new Page4(driver);

    }
}
