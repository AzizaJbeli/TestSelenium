package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://fr-fr.facebook.com/");
		
		WebElement creerCompte;
		creerCompte=driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
		Actions action=new Actions(driver);
		action.click(creerCompte).perform();
		
		WebElement prenom ;
		prenom = driver.findElement(By.name("firstname"));
		prenom.sendKeys("Aziza");
		
		WebElement nom ;
		nom = driver.findElement(By.name("lastname"));
		nom.sendKeys("Jbeli");
		
		WebElement email ;
		email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("azizadjebali@hotmail.com");
		
		WebElement confirmemail ;
		confirmemail = driver.findElement(By.name("reg_email_confirmation__"));
		confirmemail.sendKeys("azizadjebali@hotmail.com");
		
		WebElement password ;
		password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("123456789");
		
		WebElement liste;
		liste =driver.findElement(By.id("day"));
		Select liste1 = new Select(liste);
		liste1.selectByValue("13");
		
		
		WebElement mois;
		mois =driver.findElement(By.id("month"));
		Select liste2 = new Select(mois);
		liste2.selectByValue("1");
		
		WebElement annee;
		annee =driver.findElement(By.id("year"));
		Select liste3 = new Select(annee);
		liste3.selectByValue("1997");
		
		WebElement genre;
		genre=driver.findElement(By.name("sex"));
		Actions action1=new Actions(driver);
		action1.click(genre).perform();
		
		WebElement inscription;
		inscription=driver.findElement(By.name("websubmit"));
		Actions action2=new Actions(driver);
		action2.click(inscription).perform();
	}
}


