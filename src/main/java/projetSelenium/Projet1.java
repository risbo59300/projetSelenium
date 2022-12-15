package projetSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Projet1 {

    public static void main(String[] args) {
        //System.setProperty("Webdriver.chrome.driver", "./driver/chromedriver.exe");
        WebDriverManager.chromedriver().setup(); // a la place de ligne ci-dessus

        // instanciation de chromeDriver
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        // Accès au site qualité logiciel
        driver.get("https://www.qualitelogiciel.com/");

        driver.getTitle(); // obtention du titre du site

        // Demande de fermeture de la page
        driver.close();
    }
}
