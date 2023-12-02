import Components.HeaderComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import pageObjects.HomePage;

public class BaseTest {
    protected HomePage homePage;
    protected WebDriver driver;
    @BeforeTest
    public void testsSetup(){
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

}
