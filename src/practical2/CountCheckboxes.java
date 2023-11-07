package practical2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CountCheckboxes {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("C:/Users/Asus/Desktop/STQA Practicals/Practical 2 - CountCheckboxes/index.html");
        List<WebElement> checkboxesCount = chromeDriver.findElements(By.xpath("//input[@type='checkbox']"));

        for (int i = 0; i < checkboxesCount.size(); i+=2) {
            checkboxesCount.get(i).click();
        }

        int checkedCheckboxesCount = 0, uncheckedCheckboxesCount = 0;

        for (int i = 0; i < checkboxesCount.size(); i++) {
            System.out.println((i+1) + " checkbox is selected " + checkboxesCount.get(i).isSelected());
            if (checkboxesCount.get(i).isSelected()) {
                checkedCheckboxesCount++;
            } else {
                uncheckedCheckboxesCount++;
            }
        }
        System.out.println("Total number of selected checkboxes: " + checkedCheckboxesCount);
        System.out.println("Total number of unselected checkboxes: " + uncheckedCheckboxesCount);
    }
}