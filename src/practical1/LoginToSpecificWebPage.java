package practical1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToSpecificWebPage {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("http://localhost/");
        chromeDriver.findElement(By.id("username")).sendKeys("abc");
        chromeDriver.findElement(By.id("password")).sendKeys("abc");
        chromeDriver.findElement(By.id("login")).click();
    }
}