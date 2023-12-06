package pageObjects.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;


public class HeaderComponent {

    private final SelenideElement logoUaKinoClub = $x("//*[@class='logo-box']");
    private final SelenideElement filmsInHeaderButton = $x("//*[contains(@href, '/filmy/')]/..");
    private final SelenideElement seriesInHeaderButton = $x("//*[@id='all-wrap']/div/div/header/div/div[1]/nav/ul/li[2]/a");
    private final SelenideElement cartoonsInHeaderButton = $x("//*[@id='all-wrap']/div/div/header/div/div[1]/nav/ul/li[3]/a");
    private final SelenideElement collectionsInHeaderButton = $x("//*[@id='all-wrap']/div/div/header/div/div[1]/nav/ul/li[4]/a");
    private final SelenideElement communitiesInHeaderButton = $x("//*[@id='all-wrap']/div/div/header/div/div[1]/nav/ul/li[5]/a");
    private final SelenideElement announcementsInHeaderButton = $x("//*[@id='all-wrap']/div/div/header/div/div[1]/nav/ul/li[6]/a");
    private final SelenideElement findYearInHeaderButton = $x("//*[@id='all-wrap']/div/div/header/div/div[1]/nav/ul/li[7]/a");
    private final SelenideElement top100InHeaderButton = $x("//*[@id='all-wrap']/div/div/header/div/div[1]/nav/ul/li[8]/a");
    private final SelenideElement emojiRatingInHeaderButton = $x("//*[@id='all-wrap']/div/div/header/div/div[1]/div/a[2]");
    private final SelenideElement favoritesInHeaderButton = $x("//*[@class = 'show-fav']");
    private final SelenideElement loginInHeaderButton = $x("//*[@class='show-login']");
    private final SelenideElement myCabinetButton = $x("//*[@class='show-login']");
    private final SelenideElement searchField = $x("//*[@id='ajax_search']");
    private final SelenideElement searchButton = $x("//*[@id='quicksearch']/div");

    @Step("Get 'My cabinet' button text")
    public String getMyCabinetButtonText() {
        return this.myCabinetButton.getText();
    }

    public void clickLogoUaKinoClub() {
        logoUaKinoClub.click();
    }

    @Step("")
    public void clickFilmsInHeaderButton() {
        filmsInHeaderButton.click();
    }

    public void clickSeriesInHeaderButton() {
        seriesInHeaderButton.click();
    }

    public void clickCartoonsInHeaderButton() {
        cartoonsInHeaderButton.click();
    }

    public void clickCollectionsInHeaderButton() {
        collectionsInHeaderButton.click();
    }

    public void clickCommunitiesInHeaderButton() {
        communitiesInHeaderButton.click();
    }

    public void clickAnnouncementsInHeaderButton() {
        announcementsInHeaderButton.click();
    }

    public void clickFindYearInHeaderButton() {
        findYearInHeaderButton.click();
    }

    public void clickTop100InHeaderButton() {
        top100InHeaderButton.click();
    }

    public void clickEmojiRatingInHeaderButton() {
        emojiRatingInHeaderButton.click();
    }

    public void clickFavoritesInHeaderButton() {
        favoritesInHeaderButton.click();
    }

    @Step("Click login button")
    public LoginComponent clickLoginInHeaderButton() {
        loginInHeaderButton.click();

        return new LoginComponent();
    }

    public void inputSearchField(String input) {
        searchField.sendKeys(input);
    }

    public void clickSearchButton() {
        searchButton.click();
    }
}
