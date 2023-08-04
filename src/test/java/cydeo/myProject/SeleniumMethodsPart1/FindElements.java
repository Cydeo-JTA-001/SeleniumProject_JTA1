package cydeo.myProject.SeleniumMethodsPart1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/checkboxes");

       driver.findElement(By.xpath("//input[@name=\"checbox1\"]")).click();

       List <WebElement> myCheckboxes = driver.findElements(By.xpath("//*[@type=\"checkbox\"]"));
       Thread.sleep(2000);
       myCheckboxes.get(1).click();


       //Please come back at 12:30


        driver.get("https://qa.nextbasecrm.com/");


        WebElement userNameInputBox = driver.findElement(By.xpath("//input[@name=\"USER_LOGIN\"]"));
        WebElement passwordInputBox = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        WebElement loginButton = driver.findElement(By.xpath("//*[@value=\"Log In\"]"));

        userNameInputBox.sendKeys("marketing21@cybertekschool.com");
        passwordInputBox.sendKeys("UserUser");
        checkBox.click();
        Thread.sleep(5000);

        // here we tried contains method and clicked forgot password link
        // driver.findElement(By.xpath("//*[contains(@class ,\"forgot-pass\")]")).click();

        loginButton.click();

        List <WebElement> mainMenuItems = driver.findElements(By.xpath("//span[@class='menu-item-link-text']"));

        System.out.println(mainMenuItems.size());

        mainMenuItems.get(4).click();



    }
}
