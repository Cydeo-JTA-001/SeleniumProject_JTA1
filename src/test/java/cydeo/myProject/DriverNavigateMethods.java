package cydeo.myProject;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigateMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        driver.get("https://yahoo.com");

        Thread.sleep(3000);

        driver.navigate().refresh();

        Thread.sleep(3000);

        //maximize the window

        driver.manage().window().maximize();

        Thread.sleep(3000);

        //minimize the window
        //driver.manage().window().minimize()
        driver.manage().window().minimize();

        Thread.sleep(3000);
        //fullscreen the window
        //driver.manage().window().fullscreen()
        driver.manage().window().fullscreen();

// expected  Login     actual data= login
   // expected.equal(actual)    false true


    }
}
