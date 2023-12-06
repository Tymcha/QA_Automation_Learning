import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import pageObjects.pages.HomePage;
import pageObjects.components.HeaderComponent;
import pageObjects.components.ListCategories;
import pageObjects.components.LoginComponent;

public class BaseTest {
    protected HomePage homePage = new HomePage();

    @BeforeTest
    public void testsSetup() {
    }
}
