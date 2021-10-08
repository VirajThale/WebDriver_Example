package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","chromedriver");
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		
		
		WebDriver dr =new ChromeDriver();
		//WebDriver drf =new FirefoxDriver();
		
		dr.get("https://www.monsterindia.com/seeker/registration");
		
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
//        WebElement file = dr.findElement(By.xpath("//input[@type='file']"));
//        file.sendKeys("/home/vthalecisco/Documents/name.txt");
        
        WebElement file1 = dr.findElement(By.xpath("//*[@class='upload-file']"));
        file1.click();
  
        // creating object of Robot class
        Robot rb = new Robot();
     
        // copying File path to Clipboard
        StringSelection str = new StringSelection("/home/vthalecisco/Documents/name.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
     
         // press Contol+V for pasting
         rb.keyPress(KeyEvent.VK_CONTROL);
         rb.keyPress(KeyEvent.VK_V);
     
        // release Contol+V for pasting
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);
     
        // for pressing and releasing Enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
        
        String nwtb = Keys.chord(Keys.CONTROL,Keys.ENTER);
        dr.findElement(By.xpath("//*[text()=' Previous Page']")).sendKeys(nwtb);
        
        
        
}
}