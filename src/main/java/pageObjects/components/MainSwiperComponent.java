package pageObjects.components;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;

public class MainSwiperComponent{

    public SelenideElement globalSwiper;
    public SelenideElement socialMedia;
    public SelenideElement titleGlobalSwiper;
    public SelenideElement rightButtonGlobalSwiper;
    public SelenideElement leftButtonGlobalSwiper;

    public MainSwiperComponent(SelenideElement element, WebDriver driver) {
        this.titleGlobalSwiper = element.$x("//*[@id=\"all-wrap\"]/div/div/div[1]/div/div[1]/p");
        this.socialMedia = element.$x("//*[@id=\"all-wrap\"]/div/div/div[1]/div/div[1]/ul");
    }
}
