package pageObjects;

import Components.HeaderComponent;
import Components.LoginPage;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.codeborne.selenide.Selenide.open;

public class HomePage extends BasePage {

    public HeaderComponent headerComponent;

    public HomePage (WebDriver driver){
        super(driver);
        headerComponent = PageFactory.initElements(driver, HeaderComponent.class);
    }
    @Step("Go to https://uakino.club/")
    public void goTo(){
        open("https://uakino.club/");
    }
}
