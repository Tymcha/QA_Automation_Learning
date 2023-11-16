package Components;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class LoginComponent {

    @FindBy(className = "login-title")
    private SelenideElement loginTitle;

    @FindBy(xpath = "//*[@id='overlay']/div/div[2]/a[1]")
    private SelenideElement facebookButtom;
    @FindBy(xpath = "//*[@id='overlay']/div/div[2]/a[2]")
    private SelenideElement googleButtom;

    @FindBy(xpath = "//*[@id='overlay']/div/div[2]/a[3]")
    private SelenideElement QRButtom;

    @FindBy(id = "login_name")
    private SelenideElement fieldEmail;

    @FindBy(id = "login_password")
    private SelenideElement fieldPassword;

    @FindBy(className = "login-button")
    private SelenideElement loginButton;

    @FindBy(xpath = "//*[@id='overlay']/div/div[3]/form/div[4]/label")
    private SelenideElement checkBox;

    @FindBy(xpath = "//*[@id='overlay']/div/div[3]/form/div[5]/a[1]")
    private SelenideElement forgotPasswordButton;

    @FindBy(className = "log-register")
    private SelenideElement Button;

    @FindBy(className = "fa fa-times overlay-close")
    private SelenideElement closeLoginButton;



}
