package  htmldriver;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;



public class htmlUnitYest {				
	public static void main(String[] args) throws IOException, InterruptedException{
		
		/*String path = System.getProperty("user.dir");
		System.out.println(path); 
		System.setProperty("webdriver.chrome.driver",path+"//drivers//chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("window-size=1200x600");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://contentstack.built.io");*/
		// Creating a new instance of the HTML unit driver
        
        WebDriver driver = new HtmlUnitDriver();
        driver.get("http://test-webapp.gl-project1.com/webapp/welcome.jsp");
        System.out.println("Test Case Started");
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("AB1"); 
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345"); 
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@value='Login']")).click(); 
        Thread.sleep(5000);
        System.out.println("Test Case Passed");
        driver.close();
    }
}