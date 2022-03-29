import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    SelenideElement userNameField;

    MainPage(){
        // <div class="tico ellip"><svg class="svg-ic svg-ico_user_square_18 tico_img null" viewBox="0 0 18 18">
        //<path fill-rule="evenodd" clip-rule="evenodd" d="M1.2 11.3a5.499 5.499 0 0 0 5.5 5.5h4.6a5.498 5.498 0 0 0 5.5-5.5V6.7a5.499 5.499 0 0 0-5.5-5.5H6.7a5.498 5.498 0 0 0-5.5 5.5v4.6zm12 3.404a.756.756 0 0 1-.066-.19v-.002a2.162 2.162 0 0 0-2.115-1.712h-3.98c-1.01 0-1.889.694-2.123 1.677v.002a.769.769 0 0 1-.099.235A3.89 3.89 0 0 0 6.7 15.2h4.6a3.88 3.88 0 0 0 1.9-.496zm1.298-1.173A3.89 3.89 0 0 0 15.2 11.3V6.7a3.902 3.902 0 0 0-3.9-3.9H6.7a3.901 3.901 0 0 0-3.9 3.9v4.6c0 .82.259 1.613.73 2.271A3.78 3.78 0 0 1 7.04 11.2h3.98c1.546 0 2.908.941 3.479 2.331zM8.992 4.467a2.792 2.792 0 0 0 0 5.583 2.792 2.792 0 0 0 0-5.583zm0 1.6a1.191 1.191 0 1 1-.003 2.382 1.191 1.191 0 0 1 .003-2.382z" class="svg-fill"></path>
        //</svg>Alexandra Demianko</div>
        this.userNameField =  $(By.xpath("//div[contains(@class, 'tico ellip')]"));

    }

    public boolean LoginIsCorrect(String requiredName){
        return userNameField.getText().equals(requiredName);
    }


}
