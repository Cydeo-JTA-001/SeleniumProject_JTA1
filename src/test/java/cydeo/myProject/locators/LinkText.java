package cydeo.myProject.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cydeo.com/");

        Thread.sleep(3000);

       // driver.findElement(By.linkText("A/B Testing")).click();



       WebElement ABLink = driver.findElement(By.linkText("A/B Testing"));

       ABLink.click();

       Thread.sleep(3000);

       driver.navigate().back();

       Thread.sleep(3000);

       driver.findElement(By.partialLinkText("A/B")).click();



    }



}
