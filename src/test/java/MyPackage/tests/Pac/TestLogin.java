package MyPackage.tests.Pac;

import MyPackage.tests.BaseClasse;
import Pages.Page_Login;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class TestLogin extends BaseClasse {

    @Test
    public void test()  {

        driver.get("http://blazedemo.com/login");
        Page_Login page_login = new Page_Login();
        int LoginHeight_1 = page_login.getSizeLoginHeight();
        int LoginWidth_1 = page_login.getSizeLoginWidth();

        page_login.moveToElementLogin();

        assertEquals(page_login.getBackgroundColorLogin(),"rgba(37,121,169,1)","Цвет кнопки Логин не верный!");

        assertEquals(LoginHeight_1 ,page_login.getSizeLoginHeight(),"Высота кнопки Логин изменилась!");
        assertEquals(LoginWidth_1 ,page_login.getSizeLoginWidth(),"Ширина кнопки Логин изменилась!");

    }





}