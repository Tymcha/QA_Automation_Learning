package Components;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import pageObjects.BasePage;
import pageObjects.HomePage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.$x;
import static java.text.MessageFormat.format;

public class ListCategories {
    //*[@id="all-wrap"]/div/div/header/div/div[1]/nav/ul/li[2]/div/ul[1]/li[1]

    @FindBy(xpath = "//*[@id='all-wrap']/div/div/header/div/div[1]/nav/ul/li[2]/div/ul[1]/li[1]")
    SelenideElement movieCategories;

    public List<SelenideElement> categoties;
    public ListCategories (SelenideElement element, WebDriver driver){
        this.categoties = element.$$x("//*[@class='hidden-menu clearfix']//ul//li");
    }

    public void selectCategory(String category){
        SelenideElement categ = this
                .categoties
                .stream()
                .filter(categoty -> categoty.getText().equals(category))
                .collect(Collectors.toList())
                .stream()
                .findFirst()
                .get();

        categ.click();
    }

//    public List<SelenideElement> getMovieCategories(int index1, int index2){
//
//        List<SelenideElement> allMovieCategoriesList = new LinkedList<>();
//
//        for (int i = 1; i <= index1; i++) {
//            for (int j = 1; j <= index2; j++) {
//                allMovieCategoriesList.add(movieCategories.find(By.xpath(format("//*[@id='all-wrap']/div/div/header/div/div[1]/nav/ul/li[2]/div/ul[%s]/li[%l]"), i, j);
//            }
//        }
//
//        return allMovieCategoriesList;
//    }

//    public void clickMovieCategories (List<String> allMovieCategoriesList, int index1){
//        SelenideElement clickMovieCategories;
//        for (int i = 1; i <= index1; i++) {
//            clickMovieCategories = allMovieCategoriesList.get(i);
//        }
//    }

}
