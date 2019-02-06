package ReusableMethods;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import PageObjectRepository.LoginPage;
import CommonMethods.CommonReusableMethods;

public class LoginPageSteps {
	

	public static void ClickOnSignIn() throws Exception
	{		
		Thread.sleep(5000);
		CommonReusableMethods.HoveronElement(LoginPage.HoverOnOrdersTab,"OrdersTab");
		CommonReusableMethods.Click(LoginPage.SignINButton, "SignIn Button");
	}

	public static void EnterEmail(String Text)
	{
		CommonReusableMethods.EnterText(LoginPage.EmailField, Text);
		CommonReusableMethods.Click(LoginPage.ContinueButton, "Continue Button");
	}	

	public static void EnterPassword(String Text)
	{
		CommonReusableMethods.EnterText(LoginPage.PasswordField, Text);
	}

	public static void ClickOnLogin() throws Exception
	{
		CommonReusableMethods.Click(LoginPage.LoginButton, "SignIn Button");
		Thread.sleep(5000);
	}

	public static void ClickonLogout() throws Exception
	{    //Thread.sleep(5000);
		CommonReusableMethods.HoveronElement(LoginPage.Hello_Pravalika_Tab, "Hello Pravalika");
		CommonReusableMethods.Click(LoginPage.SignOutButton, "SignOut Button");
	}
		

}
