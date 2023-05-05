package Test;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListeDeroulante {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		// implicity wait 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/select-menu");
		
		WebElement liste;
		liste =driver.findElement(By.id("oldSelectMenu"));
		 //appel fonction select
		Select liste1 = new Select(liste);
		liste1.selectByValue("5");
		
		

	}

}
