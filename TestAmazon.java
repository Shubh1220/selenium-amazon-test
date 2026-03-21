package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAmazon {
    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in");

        // IMPORTANT wait
        Thread.sleep(5000);

        // Try safer XPath
        driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("Laptop");

        driver.findElement(By.xpath("//input[@type='submit']")).click();

        Thread.sleep(3000);

        System.out.println(driver.getTitle());

        driver.quit();
    }
}