//package base_clases;
//
//import java.io.IOException;
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
// 
//
//public class Base1{
//	
//	protected static WebDriver driver;
//	
//	
//	public void launchingBrowser()
//	{
//		
//		System.setProperty("webdriver.chrome.driver","C:\\chromedriverextension\\chromedriver.exe");
//		
//	    driver=new ChromeDriver();
//	}
//	
//	public void URL_Access() throws IOException
//	{
//		driver.get(Utility_class.GetPropertyFileData("URL"));
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
//		
//		driver.manage().window().maximize();
//	}
//	
//	public void ClosingBrowser()
//	{
//		driver.quit();
//	}
//
//}
//
//
