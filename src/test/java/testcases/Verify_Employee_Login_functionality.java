package testcases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

import base.Base;

public class Verify_Employee_Login_functionality extends Base{

	//public static void main(String[] args) {
	@Test
	public void verify_Employee_with_Valid_id_password_functionality()  {
		
		/*
		Test Case: Verify Employee Login functionalty
		Test step:
			1. Navigate to http://it.microtechlimited.com
			2. Click on Login Menu
			3. Click on Employee  Login
			4. Enter User Id as testpilot@gmail.com
			5. Enter Password as 1234
			6. Click Login Button
			7. Verify I am in Home Page
		*/
		
		
		//	setup();  //instantiate webdriver
		
		//1.Navigate to http://it.microtechlimited.com
		
		navigateURL("http://it.microtechlimited.com");
		
		//2.Click on Login Menu
		
		click(By.xpath("//a[@href='elogin.php']"));
		
		//3.Click on Employee  Login
		click(By.xpath("//a[@href='elogin.php']"));
		
		//4.Enter User Id as testpilot@gmail.com
		sendkeys(By.xpath("//input[@name='mailuid']"),"testpilot@gmail.com");
		
		//5.Enter Password as 1234
		sendkeys(By.xpath("//input[@name='pwd']"),"1234");
		
		//6.Click Login Button
		click(By.name("login-submit"));
		
		//7.Verify I am in Home page
		
		String s = getElementText(By.xpath("//h2[2]"));
		assertEquals("Welcome Test", s);
		//Verify the text is "Welcome Test"
//		if(s.contentEquals("Welcome Test"))
//			System.out.println("Login - pass");
//		else
//			System.out.println("Login - Fail");
//		
		
		//tearDown() ;
	
		
	}

}
