package cydeo.myProject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        // using WebDriverManager under bonigarcia library I was setting up browser driver
        //but with Selenium 4 we dont need that any more
        //shift w d
        WebDriver driver=new ChromeDriver();

        // goto Kahoot.com
        // URL is https://kahoot.com/

        driver.get("https://kahoot.com/");

        Thread.sleep(2000);

        driver.get("https://www.youtube.com/");

        Thread.sleep(2000);

        driver.get("https://www.tesla.com/");

        Thread.sleep(2000);

        //navigate back

        driver.navigate().back();

        Thread.sleep(2000);

        //navigate back
        driver.navigate().back();

        Thread.sleep(2000);

        // navigate forward
        driver.navigate().forward();

        Thread.sleep(2000);
        // do a refresh
        driver.navigate().refresh();


    }
}
