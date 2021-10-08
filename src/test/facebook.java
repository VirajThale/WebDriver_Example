package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","chromedriver");
		//System.setProperty("webdriver.gecko.driver", "geckodriver");
		
		
		WebDriver dr =new ChromeDriver();
		//WebDriver drf =new FirefoxDriver();
		
		dr.get("https://en-gb.facebook.com"); 
		
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		
		WebElement Header = dr.findElement(By.tagName("h2"));  ////h2[starts-with(text(),'Facebook helps you')]
		
			if(Header.isDisplayed()) {
			
			System.out.println("Header is display");
		}
		
		
		WebElement username =dr.findElement(By.xpath("//input[@id='email'or @id='email']"));
		System.out.println(username.getAttribute("placeholder"));
		username.sendKeys("abc@gmail.com");
		
		WebElement password =dr.findElement(By.xpath("//*[@name='pass']"));
		password.sendKeys("123456@Reajd");
		
		WebElement loginbuttn =dr.findElement(By.xpath("//button[@name='login']"));
		loginbuttn.click();
		

		
		
		
		
	}
}
		

	 