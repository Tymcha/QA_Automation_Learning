package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdrive.chrome.driver", "D:\\WebDriver\\chromedriver-win64\\chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com.ua");
    }
}