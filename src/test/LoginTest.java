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

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","chromedriver");
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		
		
		WebDriver dr =new ChromeDriver();
		//WebDriver drf =new FirefoxDriver();
		
		dr.get("https://www.simplilearn.com/");
		
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		
		WebElement LoginLink =dr.findElement(By.linkText("Log in"));
		WebDriverWait wait= new WebDriverWait(dr,30);
		wait.until(ExpectedConditions.visibilityOf(LoginLink));
		
		WebElement LoginLink1 =dr.findElement(By.linkText("Log in"));
		LoginLink1.click();
		WebElement Username =dr.findElement(By.name("user_login"));
		Username.sendKeys("abc@gmail.com");
		WebElement password =dr.findElement(By.id("password"));
		password.sendKeys("PAss@123445");
		
		Thread.sleep(1000);
		
		 WebElement Rememeber =dr.findElement(By.className("rememberMe"));
	     Rememeber.click();
	     
		Thread.sleep(4000);

	     
	     
		
		WebElement btn_login = dr.findElement(By.name("btn_login"));
		btn_login.click();
		
		WebElement error= dr.findElement(By.id("msg_box"));
		String Actualmsg= error.getText();
		String Expmsg ="The email or password you have entered is invalid.";
		
		if(Actualmsg.equals(Expmsg)) {
			
			System.out.println("Test pass");
		}
		else {
			System.out.println("Test failed");
		}
		
		List<WebElement> Links =dr.findElements(By.tagName("a"));
		System.out.println("Total Links" +Links.size());
		for (WebElement data :Links){
			//System.out.println(data.getText());
			System.out.println("Target URL"+ data.getAttribute("href"));
		}
		
		System.out.println(dr.getTitle());
		System.out.println(dr.getCurrentUrl());
		
		
		
//		WebElement ForgetPass = dr.findElement(By.partialLinkText("Forgot"));
//		ForgetPass.click();
//		Thread.sleep(5000);
//		dr.quit();
		//dr.close();

	}

}
