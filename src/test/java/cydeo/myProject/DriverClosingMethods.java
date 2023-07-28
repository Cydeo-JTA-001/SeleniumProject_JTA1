package cydeo.myProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverClosingMethods {
    public static void main(String[] args) throws InterruptedException {

        // open google.com
        // then close the browser

        // first step
        WebDriver driver=new ChromeDriver();
        //second step goto the website

        driver.get("https://google.com");

        // I had to pass captcha manually unfortunatelly

       // to close the current tab we will use close() method.

        Thread.sleep(3000);

        driver.close();

        // create another driver because first driver is gone we canNOT use it anymore

        WebDriver driver1=new ChromeDriver();

        driver1.get("https://www.msn.com/");

        Thread.sleep(3000);

        //Using quit() method we close all the windows and tabs

        driver1.quit();
    }
}
