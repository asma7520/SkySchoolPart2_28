package testcases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

import base.Base;

public class Verify_Customer_Contact_Number_Modification_functionality extends Base {
	@Test // Test Annotation Junit

	public void verify_Customer_Login_with_ValidData_functionality() throws InterruptedException {

		// public static void main(String[] args) {

		/*
		 * Test Case: Verify Customer Contact Number Modifivations functionalty
		 *  Test step: 
		 *  1. Navigate to http://it.microtechlimited.com
		 *  2. Click on Login Menu 
		 *  3. Click on Customer Login
		 *  4. Enter User Id as david@gmail.com
		 *  5. Enter Password as 1234
		 *  6. Click Login Button
		 *  7. Verify I am in Home Page
		 *  
		 *  
		 */
		 
	

		// setup(); //instantiate webdriver

		// 1.Navigate to http://it.microtechlimited.com
		navigateURL("http://it.microtechlimited.com");
		System.out.println("Navigate done");

		// 2.Click on Login Menu
        click(By.xpath("//a[@href='elogin.php']"));

		// 3.Click on Customer Login
		click(By.xpath("//a[@href='clogin.php']"));

		// 4.Enter User Id as david@gmail.com
		sendkeys(By.xpath("//input[@name='mailuid']"), "david@gmail.com");

		// 5.Enter Password as 1234
		sendkeys(By.xpath("//input[@name='pwd']"), "1234");

		// 6.Click Login Button
		click(By.name("login-submit"));
		// System.out.println("login done");

		// 7.Verify I am in Home page

		// String s = getElementText(By.xpath("//h2[2]"));
		// Verify the text is "Welcome David1"
		// assertEquals("Welcome David1", s);

		// System.out.println("assertaion done");
		// tearDown() ;

		// 8. Click "My Profile menue" on Customer welcome Page
		click(By.xpath("//a[text()='My Profile']"));

		// 9. Click on Update Info
		click(By.xpath("//button[text()='Update Info']"));

		// 10. Clear and Enter First Name
		clear(By.name("firstName"));
		sendkeys(By.name("firstName"), "Asma");

		// 11. Clear and Enter Last Name
		clear(By.name("lastName"));
		sendkeys(By.name("lastName"), "Rahman");

		// 12. Clear and Enter DOB
		clear(By.name("birthday"));
		sendkeys(By.name("birthday"), "02021973");

		// 13. Clear and Enter Gender
		clear(By.name("gender"));
		sendkeys(By.name("gender"), "F");

		// 14. Clear and Enter Phone Number
		clear(By.name("contact"));
		sendkeys(By.name("contact"), "8707180452");

		// 15. Clear and Enter Address
		clear(By.name("address"));
		sendkeys(By.name("address"), "Arkasas");

		// 16.Click on Submit
		click(By.name("update"));

		// 17. Verify On Upadte Page "My Info"
		String v = getElementText(By.xpath("//h2[text()='My Info']"));

		assertEquals("My Info", v);

	}

}
