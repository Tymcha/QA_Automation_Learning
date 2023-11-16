package Components;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class HeaderComponent {

    @FindBy(className = "logo-box")
    private SelenideElement logoUaKinoClub;

    @FindBy(xpath = "//*[@id='all-wrap']/div/div/header/div/div[1]/nav/ul/li[1]/a")
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

    @FindBy(className = "show-login")
    private SelenideElement loginInHeaderButton;

    @FindBy(id = "ajax_search")
    private SelenideElement searchField;

    @FindBy(xpath = "//*[@id='quicksearch']/div")
    private SelenideElement searchButton;


    public void clickLogoUaKinoClub(){
        logoUaKinoClub.click();
    }

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

    public void clickLoginInHeaderButton(){
        loginInHeaderButton.click();
    }

    public void inputSearchField(String input){
        searchField.sendKeys(input);
    }

    public void clickSearchButton(){
        searchButton.click();
    }


    
//System.setProperty("webdrive.chrome.driver", "D:\\WebDriver\\chromedriver-win64\\chromedriver");
//    WebDriver driver = new ChromeDriver();
//        driver.get("https://uakino.club/");
//    String text = driver.findElement(By.xpath("//div[contains(@class, 'top-header')]/descendant::p[@class='sidebar-title']")).getText();
//        System.out.println(text);
//        driver.findElement(By.xpath("//input[@id='ajax_search']")).sendKeys("Loki");
//        driver.findElement(By.xpath("//*[@class='search-box']//button")).click();
//    boolean isDisplayed = driver.findElement(By.xpath("//a[@class='logo-box']")).isDisplayed();
//        System.out.println(isDisplayed);

}
