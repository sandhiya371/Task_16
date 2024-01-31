package Task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlaze {

	public static void main(String[] args) {

		// To launch the Browser
		WebDriver driver = new ChromeDriver();

		// Open the URL (we can use either get method or navigate method.)
		// driver.get("https://www.demoblaze.com/");
		driver.navigate().to("https://www.demoblaze.com/");

		// To maximize
		driver.manage().window().maximize();

		// To verify the Title
		String titleName = driver.getTitle();

		System.out.println("Title for the current page: " + titleName);

		if (titleName.equals("STORE")) {

			System.out.println("Page landed on correct website.");

		} else {

			System.out.println("Page not landed on correct website.");

		}

		driver.close();

	}

}

//Output:
//	
//	Title for the current page: STORE
//	Page landed on correct website.
