package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v111.input.Input;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();



        // Initializing the driver object
//        ChromeDriver driver = new ChromeDriver();
        FirefoxDriver driver = new FirefoxDriver();

        //Opening the page
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        driver.manage().window().fullscreen();

        //Locating elements
        WebElement textInput = driver.findElement(By.name("my-text"));
        WebElement passwordField = driver.findElement(By.name("my-password"));
        WebElement textArea = driver.findElement(By.name("my-textarea"));
        WebElement dropdownElement = driver.findElement(By.name("my-select"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));


        Select dropdownMenu = new Select(dropdownElement);

        //Performing actions against page elements
        Thread.sleep(1000);
        textInput.sendKeys("Hello, World!");
        Thread.sleep(1000);
        passwordField.sendKeys("MyStrongPassword123!!!");
        Thread.sleep(1000);
        textArea.sendKeys("AUTO QA 1.0 WELCOMES YOU");
        Thread.sleep(1000);
        dropdownMenu.selectByIndex(2);
        Thread.sleep(1000);
        submitButton.click();





    }
}