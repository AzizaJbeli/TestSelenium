package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Saqara {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://v2.staging.chantierprive.fr/login");
		
		WebElement mail ;
		mail = driver.findElement(By.id("email"));
		mail.sendKeys("secretariat@loncle.fr");
		
		WebElement password ;
		password = driver.findElement(By.id("password"));
		password.sendKeys("$aqaraTest7");
		
		WebElement connecter;
		connecter=driver.findElement(By.id("button-login"));
		Actions action=new Actions(driver);
		action.click(connecter).perform();
		
		WebElement Connecter;
		Connecter=driver.findElement(By.id("button-login-mobile"));
        action.click(Connecter).perform();
      
        WebElement utilisateur;
        utilisateur=driver.findElement(By.xpath("//button[@data-testid='icon-button']//div"));
        action.click(utilisateur).perform();
    
        WebElement compte;
        compte=driver.findElement(By.xpath("//div[contains(text(),'Compte')]"));
        action.click(compte).perform();
     
        WebElement utilisateur1;
        utilisateur1=driver.findElement(By.xpath("//button[@type='button']//div"));
        action.click(utilisateur1).perform();
        
        WebElement abonnement;
        abonnement=driver.findElement(By.xpath("//div[contains(text(),'Abonnement')]"));
        action.click(abonnement).perform();
 
        WebElement utilisateur2;
        utilisateur2=driver.findElement(By.xpath("//button[@type='button']//div"));
        action.click(utilisateur2).perform();

        WebElement centredaide;
        centredaide=driver.findElement(By.xpath("//body/div/div[@data-overlay-container='true']/div[@data-testid='main-layout']/div/div[@data-testid='Body']/header[@data-testid='header']/div[@data-testid='title-actions-container']/div[@data-testid='header-menu-button']/div/div/button[1]"));
        action.click(centredaide).perform();

        WebElement home;
		home=driver.findElement(By.xpath("//body/div/div[@data-overlay-container='true']/div[@data-testid='main-layout']/div[@data-testid='Navbar']/div/a[1]"));
        action.click(home).perform();

        WebElement filtres;
        filtres=driver.findElement(By.xpath("//button[@data-testid='button-filters']"));
        action.click(filtres).perform();

        WebElement recherche ;
		recherche = driver.findElement(By.xpath("//input[@placeholder='Recherchez un mot clé, un maître d’ouvrage, ...']"));
		recherche.sendKeys("Hameau");
    
		WebElement detailsprojet;
		detailsprojet=driver.findElement(By.xpath("//div[@data-testid='project-card-link']//a//div"));
        action.click(detailsprojet).perform();
      
  	    WebElement projets;
  	    projets=driver.findElement(By.xpath("//body/div[@id='__next']/div[@data-overlay-container='true']/div[@data-testid='main-layout']/div[@data-testid='Navbar']/div/div/div[1]/div[1]/a[1]/div[1]"));
        action.click(projets).perform();
  
        WebElement favoris;
        favoris=driver.findElement(By.xpath("//body/div/div[contains(@data-overlay-container,'true')]/div[contains(@data-testid,'main-layout')]/div[contains(@data-testid,'Navbar')]/div/div/div[2]/div[1]/a[1]/div[1]"));
        action.click(favoris).perform();

        WebElement demandeacces;
        demandeacces=driver.findElement(By.xpath("//body/div/div[@data-overlay-container='true']/div[@data-testid='main-layout']/div[@data-testid='Navbar']/div/div/div[3]/div[1]/a[1]/div[1]"));
        action.click(demandeacces).perform();
      

	}

}
