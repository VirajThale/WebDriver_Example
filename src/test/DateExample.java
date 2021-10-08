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

public class DateExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","chromedriver");
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		
		
		WebDriver dr =new ChromeDriver();
		//WebDriver drf =new FirefoxDriver();
		
		dr.get("https://jqueryui.com/datepicker/");
		
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		dr.switchTo().frame(0);
		
		WebElement date = dr.findElement(By.id("datepicker"));
//		date.sendKeys("10/15/2010");
		date.click();
		
		WebElement arrow = dr.findElement(By.xpath("//a[@title='Next']"));
		WebElement month =dr.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
		
		String sMonth =month.getText();
		
		while(!sMonth.equals("December")) {
			
			arrow.click();
			arrow = dr.findElement(By.xpath("//a[@title='Next']"));
			month =dr.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
			sMonth=month.getText();
		}
		WebElement day =dr.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()='20']"));
		day.click();
		
		
		
		
		


	}

}
