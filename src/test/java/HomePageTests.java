import jdk.jfr.Description;
import org.testng.annotations.Test;

import static constants.Constants.*;
import static org.testng.Assert.assertEquals;

public class HomePageTests extends BaseTest {

    @Test(description = "Verify successful login")
    @Description("Verify successful login with Email: Андрій Тимчук, Password: hcbbmnv4662")
    public void login() {

        homePage.goTo()
                .headerComponent
                .clickLoginInHeaderButton()
                .login(email, pass);

        assertEquals(homePage.headerComponent.getMyCabinetButtonText(), "Miй кабінет",
                "My cabinet button should have text Мій кабінет");
    }
}
