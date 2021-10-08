
package test;

import java.awt.event.ActionEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","chromedriver");
		//System.setProperty("webdriver.gecko.driver", "geckodriver");
		
		
		WebDriver dr =new ChromeDriver();
		//WebDriver drf =new FirefoxDriver();
		
		dr.get("https://demoqa.com/alerts"); 
		
		
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
	
		WebElement button =dr.findElement(By.xpath("//button[@id='alertButton']"));
		button.click();
		
		Alert alert = dr.switchTo().alert();
		alert.accept();
		
//		Alert alert2 =dr.switchTo().alert();
//		alert2.sendKeys("Clicked Ok");
//		Thread.sleep(10000);
//		alert2.accept();
		
		
		
		
	
		
	
	
	
	
	
	
	
	
	
	
	}}