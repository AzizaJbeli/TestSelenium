package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ESSAI {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		
		Thread.sleep(10000);
		
		WebElement user ;
		
		user = driver.findElement(By.name("search_query"));
		
		user.sendKeys("Tunisie");
		
		WebElement bouton;
		
		bouton = driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]"));
		
		bouton.click();
		Thread.sleep(10000);
WebElement bouton2;
		
		bouton2 = driver.findElement(By.xpath("//*[@id=\"container\"]/ytd-toggle-button-renderer/yt-button-shape/button/yt-touch-feedback-shape/div/div[2]"));
		
		bouton2.click();
		
WebElement bouton3;
		
		bouton3 = driver.findElement(By.xpath("//*[@id=\"label\"]/yt-formatted-string"));
		
		bouton3.click();
		
		
		WebElement verif;
		verif = driver.findElement(By.xpath("//*[@id=\"endpoint\"]/tp-yt-paper-item/yt-formatted-string"));
		
		String url;
		url= driver.getCurrentUrl();
		Assert.assertEquals("https://www.youtube.com/results?search_query=Tunisie&sp=EgIIAQ%253D%253D", url);
		System.out.println("test OK ");
	}

}
