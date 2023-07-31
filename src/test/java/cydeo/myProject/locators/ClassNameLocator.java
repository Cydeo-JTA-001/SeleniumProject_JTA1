package cydeo.myProject.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver1 =new ChromeDriver();


        driver1.get("https://qa.fleetgru.com/user/login");

        WebElement username = driver1.findElement(By.className("span2"));
        WebElement password = driver1.findElement(By.name("_password"));

       // WebElement password = driver1.findElement(By.className("span2"));
        WebElement submit = driver1.findElement(By.id("_submit"));

       username.sendKeys("salesmanager101");
       password.sendKeys("UserUser123");

       Thread.sleep(3000);
       submit.click();




    }
}
