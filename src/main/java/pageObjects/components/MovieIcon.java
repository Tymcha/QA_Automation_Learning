package pageObjects.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MovieIcon{
    SelenideElement movieImg = $x("//*[@class = 'animate img'");
    SelenideElement shortInfoAboutFilm = $x("//*class='fa fa-info-circle show-desc']");
    SelenideElement playButton = $x("//*[@class='fa fa-play-circle go-watch'");
    SelenideElement movieTitle = $x("//*[@class='movie-title']");

    public void clickPlayButton() {
        playButton.click();
    }

    public void clickMovieTitle() {
        movieTitle.click();
    }

    public String getMovieTitle() {
        return movieTitle.getText();
    }

    public boolean displayMovieImg() {
        return movieImg.isDisplayed();
    }


}
