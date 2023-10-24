package seleniumlearning;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fbautomation {
public static void main(String[] args) throws InterruptedException {
	System.out.println("Enter the browser you want me to execute : ");
	Scanner sc = new Scanner(System.in);
	String n = sc.nextLine();
	
	WebDriver driver;
	
	if(n.contains("Chrome")) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	}
	else if(n.contains("Edge")) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
			
	}
	else {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='_8fgl _9l2p']//input[@name='firstname']")).sendKeys("karthikroci03@gmail");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Easwaran");
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("karthikroci03@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("karthikroci03@gmail");
	driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Kart@345");
	Select dropdownday = new Select(driver.findElement(By.id("day")));
	dropdownday.selectByVisibleText("3");
	Select dropdownmon = new Select(driver.findElement(By.id("month")));
	dropdownmon.selectByVisibleText("Mar");
	Select dropdownyear = new Select(driver.findElement(By.id("year")));
	dropdownyear.selectByVisibleText("2000");
	driver.findElement(By.xpath("//label[text()='Male']")).click();
	//driver.findElement(By.linkText("Sign Up")).click();
	driver.findElement(By.xpath("//button[@type='submit' and @name='websubmit' and text()='Sign Up'] ")).click();
	
	
	
	


}
}
