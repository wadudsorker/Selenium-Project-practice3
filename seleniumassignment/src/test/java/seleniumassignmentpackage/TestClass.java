package seleniumassignmentpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		//initialization....
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		//SiteNavigate....
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		
		// first & second Name.....
		
		driver.findElement(By.id("fname")).sendKeys("Md. Abdul Wadud");
		driver.findElement(By.id("lname")).sendKeys("Sorker");
		
          //Radio Button....	
		
		
		WebElement radiobutton = driver.findElement(By.id("Male"));
		radiobutton.click();
		
		assert radiobutton.isSelected();
		System.out.println(radiobutton.isSelected());
		
		
//Drop Down option...
		
		WebElement testdropdown = driver.findElement(By.id("option"));
		Select dropdown = new Select (testdropdown);
		
		//dropdown.selectByIndex(1);
		
	    //dropdown.selectByValue("2");
		
		dropdown.selectByVisibleText("Option 3");
		
//Checklist	option...
		
		WebElement testcheckbox1 = driver.findElement(By.name("option1"));
		WebElement testcheckbox2 = driver.findElement(By.name("option2"));
		testcheckbox1.click();
		testcheckbox2.click();
		
		
//Submit button.....
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		
		
		

	}

}
