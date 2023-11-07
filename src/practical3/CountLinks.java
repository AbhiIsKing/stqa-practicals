package practical3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CountLinks {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("C:/Users/Asus/Desktop/STQA Practicals/Practical 3 - CountLinks/index.html");

        List<WebElement> linksCount = chromeDriver.findElements(By.tagName("a"));
        System.out.println("Total number of links: " + linksCount.size());

        System.out.println("The name of the links are as follows:");
        for (int i = 0; i < linksCount.size(); i++) {
            System.out.println("Link number " + (i+1) + ": " + linksCount.get(i).getText());
        }
    }
}