package testcases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

import base.Base;

public class Verify_Customer_Login_functionality extends Base{
	@Test  //Test Annotation Junit
	
	 public void verify_Customer_Login_with_ValidData_functionality() {

	//public static void main(String[] args) {
		
		
		/*
		Test Case: Verify Customer Login functionalty
		Test step:
			1. Navigate to http://it.microtechlimited.com
			2. Click on Login Menu
			3. Click on Customer Login
			4. Enter User Id as david@gmail.com
			5. Enter Password as 1234
			6. Click Login Button
			7. Verify I am in Home Page
		*/
		
		//setup();  //instantiate webdriver
		
		//1.Navigate to http://it.microtechlimited.com
		navigateURL("http://it.microtechlimited.com");
		System.out.println("Navigate Done");
		
		//2.Click on Login Menu
		click(By.xpath("//a[@href='elogin.php']"));
		System.out.println("Login menue Done");
		
		
		//3.Click on Customer Login
		click(By.xpath("//a[@href='clogin.php']"));
		System.out.println("Customer Login Done");
		
		//4.Enter User Id as david@gmail.com
		sendkeys(By.xpath("//input[@name='mailuid']"),"david@gmail.com");
		System.out.println("User ID Done");
		
		//5.Enter Password as 1234
		sendkeys(By.xpath("//input[@name='pwd']"),"1234");
		System.out.println("Password Done");
		
		//6.Click Login Button
		click(By.name("login-submit"));
		System.out.println("login Done");
		
		//7.Verify I am in Home page
		
		String s = getElementText(By.xpath("//h2[2]"));
		//Verify the text is "Welcome David1"
		assertEquals("Welcome David", s);
		
//		if(s.contentEquals("Welcome "))
//			System.out.println("Login - pass");
//		else
//			System.out.println("Login - Fail");
		
		System.out.println("assertaion Done");
		//tearDown() ;

	}

}
