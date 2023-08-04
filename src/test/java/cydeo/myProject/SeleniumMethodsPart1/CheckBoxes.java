package cydeo.myProject.SeleniumMethodsPart1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/checkboxes");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='box1']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='box2']")).click();

        System.out.println(driver.findElement(By.xpath("//*[@id='box2']")).isSelected());



    }
}
