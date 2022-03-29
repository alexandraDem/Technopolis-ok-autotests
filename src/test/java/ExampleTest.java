import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.util.Scanner;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ExampleTest {

    String targetUrl = "https://ok.ru/";

    static final String userName = "Alexandra";
    static final String userLastName = "Demianko";
    static final String userLogin = "alexandra15dem@gmail.com";
    static final String userPassword = "nodoubt15";

    @Test
    void LoginTest(){
        User loginUser = new User(userName, userLastName, userLogin, userPassword);
        open(targetUrl);

        LoginPage loginPage = new LoginPage();
        MainPage mainPage = loginPage.login(loginUser);


    }
}
