package Task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser {

	public static void main(String[] args) {

		// To Launch the browser

		WebDriver driver = new FirefoxDriver();

		// Open the URL (we can use either get method or navigate method.)
		// driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");

		// To maximize the window
		driver.manage().window().maximize();

		System.out.println("Current page of the URL is: " + driver.getCurrentUrl());

		// To reload the page
		driver.navigate().refresh();

		// Qus:2 close browser option is not given.
		//driver.close();
	}

}

//Output:
//	
//	Current page of the URL is: https://www.google.com/
