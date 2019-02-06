package Core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public static ChromeDriver Driver;
	public static Actions A;
	public static Properties Pro;
	public static String EmailId_Excel;
	public static String Password_Excel;
	
	@BeforeMethod
	public static void SetUp() throws Exception, Throwable
	{
		
		System.out.println("Before Test");
		File F = new File("C:\\Pravalika\\ZZPractice\\src\\Assets\\Global.Properties");
		 Pro = new Properties();
		 Pro.load(new FileInputStream(F));
	
		if(Pro.getProperty("Browser").equals("Chrome"))
			{
		System.setProperty("webdriver.chrome.driver", "C:\\Pravalika\\Project Files\\Softwares-Selenium\\New Software Folder\\chromedriver.exe");
		Driver = new ChromeDriver();
			}
		A= new Actions(Driver);
		Driver.manage().window().maximize();
			
		Driver.get("https://www.amazon.in/");
		}
	
	@AfterMethod
	public void Close() throws Exception
	{
		Driver.close();
		Thread.sleep(5000);
		Driver.quit();
		Thread.sleep(5000);
		System.out.println("Quit Windows");
	}
	
	public void Wait() throws Exception
	{
	Thread.sleep(5000);
	}	
}
