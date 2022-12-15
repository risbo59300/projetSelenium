package projetSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Projet1 {

    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver", "./driver/chromedriver.exe");
        // instanciation de chromeDriver
        WebDriver driver = new ChromeDriver();
        // Accès au site qualité logiciel
        driver.get("https://www.qualitelogiciel.com/");
        // Demande de fermeture de la page
        driver.close();
    }
}
