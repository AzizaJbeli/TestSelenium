package Test;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Authentification {

	public static void main(String[] args) throws InterruptedException {
		// chemin to chrome driver 
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		
		//ouvrir chrome
		WebDriver driver = new ChromeDriver();
		
		// maximiser la fenetre 
		driver.manage().window().maximize();
		
		//ouvrir l'URL
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//sleep
		Thread.sleep(15000);
		
		//identification de Web Element
		WebElement user ;
		user = driver.findElement(By.name("username"));
		
		//action
		user.sendKeys("Admin");
		
		WebElement mdp;
		mdp = driver.findElement(By.name("password"));
		
		mdp.sendKeys("admin123");
		
		//identification boutton
		WebElement bouton;
		bouton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		bouton.click();
		
		Thread.sleep(1000);
		//verification 
		WebElement profil;
		profil = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span"));
		//recuperation text 
		String text;
		text= profil.getText();
		Assert.assertEquals("Paul Collings",text);
		System.out.println("test OK ");
		
		
		
		

	}

}
