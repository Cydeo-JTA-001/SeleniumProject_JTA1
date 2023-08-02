package cydeo.myProject.LocatorsPart2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

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


        Thread.sleep(500);

      // locating with id attribute
      //  WebElement activityStreamTitle = driver.findElement(By.xpath("//*[@id=\"pagetitle\"]"));

        // Locating using text, it is only possible with xpath
        WebElement activityStreamTitle = driver.findElement(By.xpath("//div[text()=\"Activity Stream\"]"));

        driver.manage().window().maximize();

        if(activityStreamTitle.isDisplayed()){
            System.out.println("Congrats you are logged in");
        }else{
            System.out.println("check the credentials please");
        }

        // using indexes and locating one of the multiple webElements is very useful with xpath
        driver.findElement(By.xpath("(//span[@class=\"menu-item-link-text\"])[4]")).click();


      // driver.quit();




    }
}
