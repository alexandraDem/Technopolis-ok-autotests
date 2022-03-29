import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public MainPage login(@NotNull User user){
        // <input type="text" name="st.email" value="" id="field_email" class="it h-mod" data-l="t,login" maxlength="100" data-module="autofocus">
        $(By.xpath("//input[@name='st.email']")).setValue(user.login);
        //<input type="password" name="st.password" value="" autocomplete="off" id="field_password" class="it " data-l="t,password" maxlength="null">
        $(By.xpath("//input[@name='st.password']")).setValue(user.password);

        //<input value="Войти в Одноклассники" data-l="t,sign_in" type="submit" class="button-pro __wide">
        $(By.xpath("//input[@value='Войти в Одноклассники']")).click();

        return (new MainPage());
    }
}
