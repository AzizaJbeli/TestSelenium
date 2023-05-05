package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragAndDrop {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		// implicity wait 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/droppable/");
	WebElement from;
		
		from = driver.findElement(By.id("draggable"));
WebElement to;
		
		to = driver.findElement(By.id("drappable"));
		Actions action=new Actions(driver);
		//draganddrop pertmet de deplacer le contenu de from dans to
		action.dragAndDrop(From, To).perform();
		String txt;
		txt=To.getText();
		org.testng.Assert.assertEquals(txt, "Dropped!");
		System.out.println("test ok");
		driver.close();

}
	
}