package cydeo.myProject.locators;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDLocator {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://qa.fleetgru.com/user/login");

        WebElement username = driver.findElement(By.id("prependedInput"));
        WebElement password = driver.findElement(By.id("prependedInput2"));
        WebElement submit = driver.findElement(By.id("_submit"));

        //username :  salesmanager101
        //password :  UserUser123

        username.sendKeys("salesmanager101");
        password.sendKeys("UserUser123");

        Thread.sleep(3000);

        submit.click();
         Thread.sleep(9000);
        if (driver.getTitle().contains("Dashboard")){
            System.out.println("Congrat you Logged In !");
        }else{
            System.out.println("Please check your credentials");
        }

        driver.quit();


    }

}
