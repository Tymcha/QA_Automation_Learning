package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdrive.chrome.driver", "D:\\WebDriver\\chromedriver-win64\\chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://uakino.club/");
        String text = driver.findElement(By.xpath("//div[contains(@class, 'top-header')]/descendant::p[@class='sidebar-title']")).getText();
        System.out.println(text);
        driver.findElement(By.xpath("//i[@id='show-search']")).click();
        driver.findElement(By.xpath("//input[@id='ajax_search']")).sendKeys("Loki");
        driver.findElement(By.xpath("//*[@class='search-box']//button")).click();
        boolean isDisplayed = driver.findElement(By.xpath("//a[@class='logo-box']")).isDisplayed();
        System.out.println(isDisplayed);

    }
}