package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Createfacebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//System.setProperty("webdriver.chrome.driver","chromedriver");
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		
		
		//WebDriver dr =new ChromeDriver();
		WebDriver dr =new FirefoxDriver();
		
		dr.get("https://en-gb.facebook.com"); 
		
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		
		
		WebElement create =dr.findElement(By.xpath("//a[text()='Create New Account']"));
		create.click();
		
		
		
		WebElement Day = dr.findElement(By.xpath("//select[@id='day']"));
		Select ddDay = new Select(Day);
		ddDay.selectByValue("18");
		
		WebElement month =dr.findElement(By.xpath("//select[@id='month']"));
		Select mmMonth =new Select(month);
		mmMonth.selectByVisibleText("May");
		
		WebElement year =dr.findElement(By.xpath("//select[@id='year']"));
		Select yyYear =new Select(year);
		yyYear.selectByValue("1997");
		
		WebElement radio1= dr.findElement(By.xpath("//input[@type='radio' and @value='1']"));
		radio1.click();
		if (radio1.isSelected())
		{System.out.println("is selcted");
		
		}
		else {
			System.out.println("not selected");
		}
		
		List<WebElement> Months = dr.findElements(By.xpath("//select[@id='month']/option"));
        
        for(int i=1;i<=Months.size();i++) {
            
            WebElement data = dr.findElement(By.xpath("//select[@id='month']/option[" + i + "]"));
            System.out.println(data.getText());
        }
		
		
	}
}
		

	 