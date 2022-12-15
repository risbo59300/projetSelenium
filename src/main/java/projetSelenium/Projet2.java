package projetSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Projet2 {

    public static void main(String[] args) {
        //System.setProperty("Webdriver.chrome.driver", "./driver/chromedriver.exe");

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        driver.get("https://www.netflix.com/fr/");

        System.out.println("Le titre du premier site est: " + driver.getTitle());

        driver.navigate().to("https://www.youtube.com/?hl=FR");

        System.out.println("Le titre du deuxième site est: " + driver.getTitle());

        driver.getTitle();

        driver.quit(); // cloture toutes les pages du navigateur
//        driver.close(); // cloture juste la page web qu'on a tester
    }
}
