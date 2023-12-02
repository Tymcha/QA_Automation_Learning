package Components;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class MovieIcon {
    @FindBy(className = "animate img")
    SelenideElement movieImg;

    @FindBy(className = "fa fa-info-circle show-desc")
    SelenideElement shortInfoAboutFilm;

    @FindBy(className = "fa fa-play-circle go-watch")
    SelenideElement playButton;

    @FindBy(className = "movie-title")
    SelenideElement movieTitle;

    public void clickPlayButton(){
        playButton.click();
    }

    public void clickMovieTitle(){
        movieTitle.click();
    }

    public String getMovieTitle(){
        return movieTitle.getText();
    }

    public boolean displayMovieImg(){
        return movieImg.isDisplayed();
    }


}
