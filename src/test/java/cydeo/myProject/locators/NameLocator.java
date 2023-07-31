package cydeo.myProject.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class NameLocator {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        driver.findElement(By.name("q")).sendKeys("wooden spoon" + Keys.ENTER);

        Thread.sleep(3000);

        // get Text () method

        WebElement results = driver.findElement(By.id("result-stats"));

        String searchResults = results.getText();

        System.out.println(searchResults);



        // Asserting if our code is running correctly

        if (driver.getTitle().contains("wooden spoon")){
            System.out.println("Your code is running perfectly  :)  ");
        }else{
            System.out.println(" Your code is not searching the correct thing ! ");
        }


     //   driver.quit();



    }


}
