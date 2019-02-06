package PageObjectRepository;

import org.openqa.selenium.By;

public class LoginPage {

	public static By HoverOnOrdersTab = By.xpath("//a[@id='nav-link-yourAccount']");
	public static By SignINButton = By.xpath("//div[@id='nav-flyout-ya-signin']/a");
	public static By EmailField = By.xpath("//input[@type='email']");	
	public static By ContinueButton = By.xpath("//input[@id='continue']");
	public static By PasswordField = By.xpath("//input[@type='password']");
	public static By LoginButton = By.xpath("//input[@id='signInSubmit']");
	public static By Hello_Pravalika_Tab= By.xpath("//span[text()='Hello, Pravalika']");
	public static By SignOutButton = By.xpath("//span[text()='Sign Out']");
	
}
