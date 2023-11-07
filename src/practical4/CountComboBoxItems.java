package practical4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CountComboBoxItems {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("C:/Users/Asus/Desktop/STQA Practicals/Practical 4 - CountComboBoxItems/index.html");
        List<WebElement> optionsCount = chromeDriver.findElements(By.xpath("//select/option"));
        System.out.println("Total number of items: " + optionsCount.size());
        System.out.println("The name of the items are as follows:");
        for (int i = 0; i < optionsCount.size(); i++) {
            System.out.println("Item " + (i+1) + ": " + optionsCount.get(i).getText());
        }
    }
}