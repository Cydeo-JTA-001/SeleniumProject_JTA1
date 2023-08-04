package cydeo.myProject.SeleniumMethodsPart1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cydeo.com/radio_buttons");


        // locate as a list of webelements
        List<WebElement> colors = driver.findElements(By.xpath("//input[@name=\"color\"]"));


        System.out.println(colors.size());
        Thread.sleep(3000);
        // get the 3rd element of the list, it is a single WebElement now, click it
        colors.get(2).click();

        System.out.println(colors.get(3).isSelected());
        Thread.sleep(3000);


        // locate and click as a single element
        driver.findElement(By.cssSelector("#hockey")).click();





    }
}
