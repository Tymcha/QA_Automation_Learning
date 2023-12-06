import jdk.jfr.Description;
import org.testng.annotations.Test;
import pageObjects.components.HeaderComponent;

import static org.testng.Assert.assertEquals;


public class HomePageTests extends BaseTest {

    @Test(description = "Verify successful login")
    @Description("Verify successful login with Email: Андрій Тимчук, Password: hcbbmnv4662")
    public void login() {

        homePage.goTo()
                .headerComponent
                .clickLoginInHeaderButton()
                .login("Андрій Тимчук", "hcbbmnv4662");

        assertEquals(homePage.headerComponent.getMyCabinetButtonText(), "Miй кабінет",
                "My cabinet button should have text Мій кабінет");
    }
}
