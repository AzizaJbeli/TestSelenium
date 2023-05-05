package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OuvrirChrome {
	
	public static void main (String[] args) {
		
		//chemin de chromedriver PATH 
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		
		//ouvrir chrome 
		WebDriver driver = new ChromeDriver ();
		
		//maximiser la fenetre 
		driver.manage().window().maximize();
		
		//ouvrir l'URL
		//driver.get("https://www.google.com/")
		driver.navigate().to("https://www.google.com/");
		
		
	}

}