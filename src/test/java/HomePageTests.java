import Components.HeaderComponent;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import Components.LoginPage;

import static org.testng.Assert.assertEquals;


public class HomePageTests extends BaseTest {

    @Test(description = "Verify successful login")
    @Description("Verify successful login with Email: Андрій Тимчук, Password: hcbbmnv4662")
    public void login() {
        homePage
                .goTo();

        homePage
                .headerComponent
                .clickLoginInHeaderButton();
        homePage.headerComponent.loginPage
                .login("Андрій Тимчук", "hcbbmnv4662");

//        assertEquals(headerComponent.getMyCabinetButtonText(), "Miй кабінет",
//                "My cabinet button should have text Мій кабінет ");
    }

}
