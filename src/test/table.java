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

public class table {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","chromedriver");
		//System.setProperty("webdriver.gecko.driver", "geckodriver");
		
		
		WebDriver dr =new ChromeDriver();
		//WebDriver drf =new FirefoxDriver();
		
		dr.get("https://www.w3schools.com/html/html_tables.asp"); 
		
		
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		
		List<WebElement> rows= dr.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int cnt = rows.size();
		List<WebElement> cols =dr.findElements(By.xpath("//table[@id='customers']/tbody"));
		int cntc= cols.size();
		System.out.println("No of rows:-"+cnt);
		System.out.println("No of cols:-"+cntc);
		
		WebElement data = dr.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[1]"));
		System.out.println(data.getText());
		
		for(int i=2;i<rows.size();i++) {
            WebElement data1 = dr.findElement(By.xpath("//table[@id='customers']/tbody/tr[" + i + "]/td[1]"));
            System.out.println(data1.getText());
        }
		WebElement elem = dr.findElement(By.xpath("//*[text()='Define an HTML Table']"));
		
		JavascriptExecutor js= (JavascriptExecutor)dr;
		js.executeScript("arguments[0].scrollIntoView()",elem);
		
		
		
		
		
		
		
}
	}