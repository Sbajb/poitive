package vakt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KamNondani {

	public static void main(String[] args) {
		 
		
		
		
//		System.setProperty("webdriver.chrome.driver","C:\\Chrome driver etenshsion\\chromedriver.exe");
//		
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		WebDriver driver = new ChromeDriver(options);

		
	//	System.setProperty("webdriver.gecko.driver", "D:\\firefox\\geckodriver.exe");
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver =new EdgeDriver();

		// Start Edge Session
	 
		
		driver.get("https://q3techportal.co.in/WebUI/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
		
		driver.findElement(By.id("Email")).sendKeys("sbambilke@Q3tech.com");
		driver.findElement(By.name("Password")).sendKeys("shubham@93");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
		 
	    driver.findElement(By.xpath("//div//button[contains(text(),'Login')]")).click();
		//driver.findElement(By.)
	    
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
  
        Select  drop =new Select(driver.findElement(By.name("ddlProject0")));
        drop.selectByVisibleText("KiwiMed - Instrutrack");
    
        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        
        Select  dropr =new Select(driver.findElement(By.name("ddlProject0")));
        dropr.selectByVisibleText("KiwiMed - Instrutrack");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        
         Select  drop3=new Select(driver.findElement(By.name("ddlTask0")));
	    drop3.selectByVisibleText("Testing");
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	    
	    Select  drop4=new Select(driver.findElement(By.name("ddlTaskStatus0")));
	    drop4.selectByVisibleText("Completed");
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	    
	    driver.findElement(By.id("txtHours0")).clear();
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	    
	    driver.findElement(By.id("txtHours0")).sendKeys("8");
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	    
	    driver.findElement(By.id("txtDescription0")).clear();
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	    
	    driver.findElement(By.id("txtDescription0")).sendKeys("1.Retesting the resolved issues on QA 2.Reporting the issues in backlog");
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	    
	   WebElement undefinedDropdown=driver.findElement(By.xpath("//select[@id='ddlProjectTask0']"));
	   Select ddropunefined=new Select(undefinedDropdown);
	   ddropunefined.selectByValue("0");
	   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	   
	   Select  dropsubtask=new Select(driver.findElement(By.id("ddlSubTask0")));
	   dropsubtask.selectByValue("173");
	   
	   
	   
		
	 //  String TextOFTAsk  = driver.findElement(By.name("SavedData[0].Description")).getText();
     //  System.out.println("text is "+TextOFTAsk);
       
       
       
    	
	    //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	   
	   
	 //   driver.findElement(By.id("btnspantext")).click();
	   
	    
	   
	  
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
