package actionlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsLearning {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		 driver = new ChromeDriver();
		 driver.get("https://jqueryui.com/droppable/");
		 Thread.sleep(4000);
	driver.switchTo().frame(0);	
	WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		 WebElement destination = driver.findElement(By.xpath("//div[@id='droppable']"));
		 Actions action = new Actions(driver);
		 action.dragAndDrop(source, destination).build().perform();
	}

}
