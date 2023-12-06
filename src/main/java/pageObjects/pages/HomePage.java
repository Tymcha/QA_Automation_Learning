package pageObjects.pages;

import pageObjects.BasePage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.open;

public class HomePage extends BasePage {
    @Step("Go to https://uakino.club/")
    public HomePage goTo() {
        open("https://uakino.club/");

        return this;
    }
}
