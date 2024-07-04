package batch15package;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestClass15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initialization
				WebDriverManager.chromedriver().setup();
				WebDriver driver= new ChromeDriver();
				//SiteNavigate
				driver.get("https://www.saucedemo.com/");
				driver.manage().window().maximize();
			
				
			        
			     //login check
			        driver.findElement(By.id("user-name")).sendKeys("standard_user");
			        driver.findElement(By.id("password")).sendKeys("secret_sauce");
			        driver.findElement(By.id("login-button")).click();
			        
			      //Title Check
					String ExpectedTitle="Swag Labs";
					String ActualTitle= driver.getTitle();
					
					if(ActualTitle.equals(ExpectedTitle)) {
						
						System.out.println("Title match");
					}
					else {
					System.out.println("Title doesn't match");
					}
					//URL Check
					String ExpectedUrl="https://www.saucedemo.com/inventory.html";
					String ActualUrl= driver.getCurrentUrl();
					
					if(ActualUrl.equals(ExpectedUrl)) {
						
						System.out.println("URL match");
					}
					else {
					System.out.println("URL doesn't match");
					}

		            
				

	}

}
