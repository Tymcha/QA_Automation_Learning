package pageObjects.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class LoginComponent {
    private final SelenideElement loginTitle = $x("//*[@class='login-title']");
    private final SelenideElement facebookButton = $x("//*[@id='overlay']/div/div[2]/a[1]");
    private final SelenideElement googleButton = $x("//*[@id='overlay']/div/div[2]/a[2]");
    private final SelenideElement QRButton = $x("//*[@id='overlay']/div/div[2]/a[3]");
    private final SelenideElement emailInput = $x("//*[@id = 'login_name']");
    private final SelenideElement passwordInput = $x("//*[@id = 'login_password']");
    private final SelenideElement loginButton = $x("//*[@class= 'login-button']");
    private final SelenideElement checkBox = $x("//*[@id='overlay']/div/div[3]/form/div[4]/label");
    private final SelenideElement forgotPasswordButton = $x("//*[@id='overlay']/div/div[3]/form/div[5]/a[1]");
    private final SelenideElement sendButton = $x("//*[@class= 'log-register']");
    private final SelenideElement closeLoginPageButton = $x("//*[@class='fa fa-times overlay-close']");

    public String getLoginTitle() {
        return loginTitle.getText();
    }

    public LoginComponent clickFacebookButton() {
        facebookButton.click();

        return this;
    }

    public void clickGoogleButton() {
        googleButton.click();
    }

    public void clickQRButton() {
        QRButton.click();
    }

    @Step("Set email: {0}")
    public LoginComponent setEmail(String email) {
        emailInput.sendKeys(email);

        return this;
    }

    public LoginComponent setPassword(String password) {
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

    public void clickForgotPasswordButton() {
        forgotPasswordButton.click();
    }

    public void clickSendButton() {
        sendButton.click();
    }

    public void clickCloseLoginPageButton() {
        closeLoginPageButton.click();
    }


}
