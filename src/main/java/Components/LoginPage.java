package Components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import pageObjects.BasePage;
import pageObjects.HomePage;

import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    @FindBy(className = "login-title")
    private SelenideElement loginTitle;

    @FindBy(xpath = "//*[@id='overlay']/div/div[2]/a[1]")
    private SelenideElement facebookButton;
    @FindBy(xpath = "//*[@id='overlay']/div/div[2]/a[2]")
    private SelenideElement googleButton;

    @FindBy(xpath = "//*[@id='overlay']/div/div[2]/a[3]")
    private SelenideElement QRButton;

    @FindBy(id = "login_name")
    private SelenideElement emailInput;

    @FindBy(id = "login_password")
    private SelenideElement passwordInput;

    @FindBy(className = "login-button")
    private SelenideElement loginButton;

    @FindBy(xpath = "//*[@id='overlay']/div/div[3]/form/div[4]/label")
    private SelenideElement checkBox;

    @FindBy(xpath = "//*[@id='overlay']/div/div[3]/form/div[5]/a[1]")
    private SelenideElement forgotPasswordButton;

    @FindBy(className = "log-register")
    private SelenideElement sendButton;

    @FindBy(className = "fa fa-times overlay-close")
    private SelenideElement closeLoginPageButton;


    public void getLoginTitle() {
        loginTitle.getText();
    }

    public void clickFacebookButtom() {
        facebookButton.click();
    }

    public void clickGoogleButtom() {
        googleButton.click();
    }

    public void clickQRButtom() {
        QRButton.click();
    }

    @Step("Set email: {0}")
    public LoginPage setEmail(String email) {
        emailInput.sendKeys(email);

        return this;
    }


    public LoginPage setPassword(String password) {
        passwordInput.sendKeys(password);

        return this;
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    @Step("Login with email: {0} and password: {1}")
    public void login(String email, String password) {
        setEmail(email)
                .setPassword(password)
                .clickLoginButton();
    }

    public void clickCheckBox() {
        checkBox.click();
    }

    public void clickforgotPasswordButton() {
        forgotPasswordButton.click();
    }

    public void clickSendButton() {
        sendButton.click();
    }

    public void clickCloseLoginPageButton() {
        closeLoginPageButton.click();
    }


}
