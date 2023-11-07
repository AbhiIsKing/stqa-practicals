package practical8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindAllElements {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://stqatools.com");
        List<WebElement> elementsCount = chromeDriver.findElements(By.xpath("//*"));

        System.out.println("List of all the elements are as follows:");
        for (int i = 0; i < elementsCount.size(); i++) {
            System.out.println("Element " + (i+1) + ": " + elementsCount.get(i).getText());
        }
    }
}
