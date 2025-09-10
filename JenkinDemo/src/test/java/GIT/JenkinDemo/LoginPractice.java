package GIT.JenkinDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPractice {
	
	@Test
	public void login() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		WebElement uName=driver.findElement(By.cssSelector("#inputUsername"));		
		uName.sendKeys("mayuri"); 
		
		WebElement pwd= driver.findElement(By.name("inputPassword"));
		pwd.sendKeys("password@12345");
		
		WebElement btn = driver.findElement(By.cssSelector(".submit.signInBtn"));
		btn.submit();// submits the form/ click
		
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.className("error")).getText());

		System.out.println(driver.findElement(By.tagName("a")).getText());
		//driver.close();		
	}

	

}
