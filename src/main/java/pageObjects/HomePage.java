package pageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(className = "main-section-inner")
    private SelenideElement mainSlider;

//    public SelenideElement getMainSliderBlockElement(){
//        return new mainSliderComponent(mainSlider.$x())
//    }
}
