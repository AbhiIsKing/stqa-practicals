package practical7;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToSpecificRemoteWebPage {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://github.com/login");
        chromeDriver.findElement(By.id("login_field")).sendKeys("IAmShridharr");
        chromeDriver.findElement(By.id("password")).sendKeys("IAmShridhar@Git");
        chromeDriver.findElement(By.name("commit")).click();
    }
}