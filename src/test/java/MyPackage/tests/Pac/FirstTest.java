package MyPackage.tests.Pac;


import MyPackage.tests.BaseClasse;
import Pages.Page1;
import Pages.Page2;
import Pages.Page3;
import Pages.Page4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


    public class FirstTest extends BaseClasse {

        @Test
        public void test()  {

            driver.get("http://blazedemo.com/index.php");

            //Страница 1

            Page1 page1 = new Page1(driver);

            page1.ChooseFromTheListFromPort("Boston");
            page1.ChooseFromTheListToPort("Rome");
            Page2 page2 = page1.submitEnterToFind();


            //Страница 2

            assertTrue(page2.isInitialized());
            assertEquals(page2.getTextElementContainer(), "Flights from Boston to Rome:","Ошибка Flights from");

           String TextAirlinePage2 = page2.getTextElementTextAirline();
           String TextFlightPage2 = "Flight Number: " + page2.getTextElementTextFlight();

           Page3 page3 = page2.EnterChooseToFindClick();


            //Страница 3

            WebElement ElementTextAirlinePage3 = driver.findElement(By.cssSelector("div.container p:nth-child(2)"));
            String TextAirlinePage3 = ElementTextAirlinePage3.getText();
            assertEquals(TextAirlinePage3, TextAirlinePage3,"Ошибка TextAirline");

            WebElement ElementTextFlightPage3 = driver.findElement(By.cssSelector("div.container p:nth-child(3)"));
            String TextFlightPage3 = ElementTextFlightPage3.getText();
            assertEquals(TextFlightPage3, TextFlightPage2,"Ошибка TextFlight");


            page3.ElementInputNameSendKeys("Вася");
            page3.ElementAddressSendKeys("address");
            page3.ElementCitySendKeys("city");
            page3.ElementStateSendKeys("state");
            page3.ElementZipCodeSendKeys("123");
            page3.ElementСardTypeSelect("amex");
            page3.ElementCreditCardNumberSendKeys("4123");
            page3.ElementCreditCardMonthSendKeys("12");
            page3.ElementCreditCardYearSendKeys("2018");
            page3.ElementNameOnCardSendKeys("Vasia");
            Page4 page4 = page3.EnterToBtn();


            //Страница4
            String expectedText = "Thank you for your purchase today!";
            WebElement ElementActualText = driver.findElement(By.cssSelector("div.container h1"));
            assertEquals(ElementActualText.getText(), expectedText,"Ошибка ActualText Page4");

            WebElement ElementId = driver.findElement(By.xpath("/html/body/div[2]//tr[1]/td[2]"));
            assertTrue(ElementId.isDisplayed());

            WebElement ElementStatus = driver.findElement(By.xpath("/html/body/div[2]//tr[2]/td[2]"));
            assertTrue(ElementStatus.isDisplayed());

            WebElement ElementAmount = driver.findElement(By.xpath("/html/body/div[2]//tr[3]/td[2]"));
            assertTrue(ElementAmount.isDisplayed());
            assertEquals(ElementAmount.getText(), "USD","Ошибка USD Page4");

            WebElement ElementCardNumber = driver.findElement(By.xpath("/html/body/div[2]//tr[4]/td[2]"));
            assertTrue(ElementCardNumber.isDisplayed());
            assertEquals(ElementCardNumber.getText(), "xxxxxxxxxxxx4123","Ошибка CardNumber Page4");


            WebElement ElementExpiration = driver.findElement(By.xpath("/html/body/div[2]//tr[5]/td[2]"));
            assertTrue(ElementExpiration.isDisplayed());
            assertEquals(ElementExpiration.getText(), "12 /2018","Ошибка Expiration Page4");

            WebElement ElementAuthCode = driver.findElement(By.xpath("/html/body/div[2]//tr[6]/td[2]"));
            assertTrue(ElementAuthCode.isDisplayed());

            WebElement ElementDate = driver.findElement(By.xpath("/html/body/div[2]//tr[7]/td[2]"));
            assertTrue(ElementDate.isDisplayed());



        }

    }

