package at.plate.training.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static java.lang.System.*;

public class SeleniumWebDriverClient {

    public static void main(String[] args) throws MalformedURLException {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeOptions);
        driver.get("http://www.google.com");
        out.println(driver.getTitle());
        driver.quit();
    }
}
