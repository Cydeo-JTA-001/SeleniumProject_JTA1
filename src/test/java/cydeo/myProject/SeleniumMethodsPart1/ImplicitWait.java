package cydeo.myProject.SeleniumMethodsPart1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWait {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // putting this once in the code is enough, everytime we use findelement(s) method it will run
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://qa.fleetgru.com/user/login");

        driver.findElement(By.xpath("//*[@id='prependedInput']")).sendKeys("user1");
        driver.findElement(By.xpath("//*[@id='prependedInput2']")).sendKeys("UserUser123");
        driver.findElement(By.xpath("//*[@id='_submit']")).click();

        String subTitle = driver.findElement(By.xpath("//h1[@class='oro-subtitle']")).getAttribute("innerHTML");
        System.out.println(subTitle);


    }
}
