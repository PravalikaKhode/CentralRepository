package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import CommonMethods.CommonReusableMethods;
import Core.BaseClass;
import ReusableMethods.*;

public class TC1 extends BaseClass {
	
	
	//the below test should be run using xml suite as we have parameterized
	@Test 
	@Parameters({"EmailId", "Password"})
	public void AmazonSignINSignOutTestCase(String EmailId, String Password) throws Exception
	{
		LoginPageSteps.ClickOnSignIn();
		LoginPageSteps.EnterEmail(EmailId);
		LoginPageSteps.EnterPassword(Password);
		LoginPageSteps.ClickOnLogin();
		LoginPageSteps.ClickonLogout();
	}
	
/*//the below test used parameters from Global properties
	@Test
	public void AmazonSignINSignOutTestCase_Using_Properties() throws Exception
	{
		LoginPageSteps.ClickOnSignIn();
		LoginPageSteps.EnterEmail(Pro.getProperty("Username"));
		LoginPageSteps.EnterPassword(Pro.getProperty("Password"));
		LoginPageSteps.ClickOnLogin();
		LoginPageSteps.ClickonLogout();
	}
	
	//the below test used parameters from Excel i.e Email Id, Password
	@Test
	public void AmazonSignINSignOutTestCase_Using_Excel() throws Exception
	{
		CommonReusableMethods.ReadExcel("2");
		LoginPageSteps.ClickOnSignIn();
		LoginPageSteps.EnterEmail(EmailId_Excel);
		LoginPageSteps.EnterPassword(Password_Excel);
		LoginPageSteps.ClickOnLogin();
		LoginPageSteps.ClickonLogout();
	}
	
*/
	
}
