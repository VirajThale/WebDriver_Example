
package test;

import java.awt.event.ActionEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

public class drag {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","chromedriver");
		//System.setProperty("webdriver.gecko.driver", "geckodriver");
		
		
		WebDriver dr =new ChromeDriver();
		//WebDriver drf =new FirefoxDriver();
		
		dr.get("http://demo.guru99.com/test/drag_drop.html"); 
		
		
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
	
		WebElement from =dr.findElement(By.xpath("//*[@id='credit2']/a"));
		WebElement To = dr.findElement(By.xpath("//*[@id='bank']/li"));
		
		Actions actions =new Actions(dr);
		actions.dragAndDrop(from, To).build().perform();
		
	
	
	
	
	
	
	
	
	
	
	}}