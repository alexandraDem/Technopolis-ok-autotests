package Pages;

import TestData.PostsGenerator;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class NewPostBlock extends BasePage{
    private final By postBlock = By.xpath("//*[contains(@class,\"posting_itx emoji-tx h-mod js-ok-e js-posting-itx ok-posting-handler\")]");
    private final By postButton = By.xpath("//*[contains(@data-l,\"t,button.submit\")]");

    public MainPage AddPost(){
        $(postBlock).clear();
        $(postBlock).sendKeys(PostsGenerator.getPostMessage());
        return new MainPage();
    }

    @Override
    public void IsLoaded() {
        $(postBlock).shouldBe(Condition.exist);
    }
}
