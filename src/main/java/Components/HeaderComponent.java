package Components;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjects.BasePage;
import pageObjects.HomePage;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static java.text.MessageFormat.format;


public class HeaderComponent extends BasePage {

    protected ListCategories listCategories;
    public LoginPage loginPage;

    public HeaderComponent(WebDriver driver){
        super(driver);
        listCategories = PageFactory.initElements(driver, ListCategories.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }



    @FindBy(className = "logo-box")
    private SelenideElement logoUaKinoClub;

    @FindBy(xpath = "//*[contains(@href, '/filmy/')]/..")
    private SelenideElement filmsInHeaderButton;

    @FindBy(xpath = "//*[@id='all-wrap']/div/div/header/div/div[1]/nav/ul/li[2]/a")
    private SelenideElement seriesInHeaderButton;

    @FindBy(xpath = "//*[@id='all-wrap']/div/div/header/div/div[1]/nav/ul/li[3]/a")
    private SelenideElement cartoonsInHeaderButton;

    @FindBy(xpath = "//*[@id='all-wrap']/div/div/header/div/div[1]/nav/ul/li[4]/a")
    private SelenideElement collectionsInHeaderButton;

    @FindBy(xpath = "//*[@id='all-wrap']/div/div/header/div/div[1]/nav/ul/li[5]/a")
    private SelenideElement communitiesInHeaderButton;

    @FindBy(xpath = "//*[@id='all-wrap']/div/div/header/div/div[1]/nav/ul/li[6]/a")
    private SelenideElement announcementsInHeaderButton;

    @FindBy(xpath = "//*[@id='all-wrap']/div/div/header/div/div[1]/nav/ul/li[7]/a")
    private SelenideElement findYearInHeaderButton;

    @FindBy(xpath = "//*[@id='all-wrap']/div/div/header/div/div[1]/nav/ul/li[8]/a")
    private SelenideElement top100InHeaderButton;

    @FindBy(xpath = "//*[@id='all-wrap']/div/div/header/div/div[1]/div/a[2]")
    private SelenideElement emojiRatingInHeaderButton;

    @FindBy(className = "show-fav")
    private SelenideElement favoritesInHeaderButton;

    @FindBy(xpath = "//*[@class='show-login']")
    private SelenideElement loginInHeaderButton;

    @FindBy(className = "show-login")
    private SelenideElement myCabinetButton;

    @FindBy(id = "ajax_search")
    private SelenideElement searchField;

    @FindBy(xpath = "//*[@id='quicksearch']/div")
    private SelenideElement searchButton;

    @Step("Get 'My cabinet' button text")
    public String getMyCabinetButtonText(){
        return this.myCabinetButton.getText();
    }

    public void clickLogoUaKinoClub(){
        logoUaKinoClub.click();
    }

    @Step("")
    public void clickFilmsInHeaderButton(){
        filmsInHeaderButton.click();
    }

    public void clickSeriesInHeaderButton(){
        seriesInHeaderButton.click();
    }

    public void clickCartoonsInHeaderButton(){
        cartoonsInHeaderButton.click();
    }

    public void clickCollectionsInHeaderButton(){
        collectionsInHeaderButton.click();
    }

    public void clickCommunitiesInHeaderButton(){
        communitiesInHeaderButton.click();
    }

    public void clickAnnouncementsInHeaderButton(){
        announcementsInHeaderButton.click();
    }

    public void clickFindYearInHeaderButton(){
        findYearInHeaderButton.click();
    }

    public void clickTop100InHeaderButton(){
        top100InHeaderButton.click();
    }

    public void clickEmojiRatingInHeaderButton(){
        emojiRatingInHeaderButton.click();
    }

    public void clickFavoritesInHeaderButton(){
        favoritesInHeaderButton.click();
    }

    @Step("Click login button")
    public void clickLoginInHeaderButton(){
        loginInHeaderButton.click();
    }

    public void inputSearchField(String input){
        searchField.sendKeys(input);
    }

    public void clickSearchButton(){
        searchButton.click();
    }

//    public void moveToFilmsInHeaderButton(int index){
//        SelenideElement element = Selenide.$x(format("//*[@id='all-wrap']/div/div/header/div/div[1]/nav/ul/li[%s]/a", index));
//
//    }


}
