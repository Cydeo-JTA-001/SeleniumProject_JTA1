package cydeo.myProject.LocatorsPart2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sound.midi.Soundbank;

public class CssSelector {
    public static void main(String[] args) throws InterruptedException {
        String expectedText="Remember me on this computer";

        WebDriver driver = new ChromeDriver();

        driver.get("https://login1.nextbasecrm.com/");

     //  WebElement rememberMe = driver.findElement(By.cssSelector("label[for=\"USER_REMEMBER\"]"));
       WebElement rememberMe = driver.findElement(By.cssSelector("label[class=\"login-item-checkbox-label\"]"));

       String actualText = rememberMe.getText();

       if (actualText.equals(expectedText)){
           System.out.println(" Tests Passed !!");
       }else{
           System.out.println("Please check the texts");
       }

        Thread.sleep(2000);
        WebElement checkBox = driver.findElement(By.cssSelector("#USER_REMEMBER"));
       checkBox.click();

        Thread.sleep(2000);
       driver.findElement(By.cssSelector(".login-btn")).click();


    }
}
