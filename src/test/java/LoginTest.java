import Pages.LoginPage;
import Pages.MainPage;
import Users.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;


public class LoginTest {

    String targetUrl = "https://ok.ru/";

    static final String userName = "Alexandra";
    static final String userLastName = "Demianko";
    static final String userLogin = "alexandra15dem@gmail.com";
    static final String userPassword = "nodoubt15";

    @Test
    void LoginTest(){
        User loginUser = new User.UserBuilder()
                .withLogin(userLogin)
                .withPassword(userPassword)
                .withName(userName)
                .withLastName(userLastName)
                .build();
        open(targetUrl);

        LoginPage loginPage = new LoginPage();
        MainPage mainPage = loginPage.login(loginUser);


        Assertions.assertEquals(loginUser.GetFullName(), mainPage.GetUserName());

    }
}
