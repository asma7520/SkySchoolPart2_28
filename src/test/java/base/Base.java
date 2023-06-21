package base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;// driver declaration

	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();// driver instantiation
		driver.manage().window().maximize();
		System.out.println("before execution");
	}

	public static void navigateURL(String url) {
		driver.get(url);
	}

	public static void click(By locator) {
		driver.findElement(locator).click();
	}

	public static void sendkeys(By locator, String value) {
		driver.findElement(locator).sendKeys(value);
	}

	public static void clear(By object) {
		driver.findElement(object).clear();
	}

	public static String getElementText(By locator) {
		// Get the text of the Element (H3) Expert Teacher
		// locate that element

		String s = driver.findElement(locator).getText();
		// WebElement element = driver.findElement( locator);
		// get the text of that element
		// String s = element.getText();
		return s;
	}

	@After
	public void tearDown() {
		driver.quit();
		System.out.println("After execution");
	}

}
