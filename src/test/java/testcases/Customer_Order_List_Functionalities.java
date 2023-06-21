package testcases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

import base.Base;

public class Customer_Order_List_Functionalities extends Base {
	//test annotation of junit
	
  @Test
	public void customer_Order_List_Functionalities() throws InterruptedException {
	  
	
			 //I am in Landing page
	   Thread.sleep(2000);
		navigateURL("http://it.microtechlimited.com");
		System.out.println("Navigate Url");
		
		
		//Then I click  Login Menu
		 Thread.sleep(2000);
		click(By.linkText("LOG IN"));
		System.out.println("Click on Login menu");
		
		//Then Click Customer login menu
		 Thread.sleep(2000);
		click(By.xpath("//a[text()='Customer Login']"));
		System.out.println("Click on customer login menu");
		
		//Then I enter User ID
		 Thread.sleep(2000);
		sendkeys(By.name("mailuid"),"david@gmail.com");
		System.out.println("Enter user ID");
		
		//Then I enter Password
		 Thread.sleep(2000);
		sendkeys(By.name("pwd"), "1234");
		System.out.println("Enter user Password");
		
		//Then I Click Login button
		click(By.name("login-submit"));
		System.out.println("Click on login menu");
		
		//I will see Customer Home page
		 Thread.sleep(2000);
		String actualValue = getElementText(By.xpath("//h2[text()='Welcome David']"));
		
		assertEquals("Welcome David",actualValue);
		
		//Then I Click on order product menue
		 Thread.sleep(2000);
		click(By.linkText("Order Product"));
		System.out.println("Click on order product");
		
		//Then I choose product name
		 Thread.sleep(2000);
		click(By.name("prodId"));
		click(By.xpath("//option[text()='Camera']"));
		System.out.println("Choose product name");
		
		
		//Then I enter order date
		 Thread.sleep(2000);
		sendkeys(By.name("ordDate"), "01/28/2023");
		System.out.println("Enter order date");
		
		//Then I click order product button
		 Thread.sleep(2000);
		click(By.xpath("//button[text()='Order Product']"));
		System.out.println("Click on product button");
		System.out.println("Test project");
		
	}
	
	
	
	
	
	
	
		

	}


