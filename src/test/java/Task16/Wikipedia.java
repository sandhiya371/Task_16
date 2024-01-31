package Task16;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wikipedia {

	public static void main(String[] args) {

		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// Open the URL (we can use either get method or navigate method.)
		// driver.get("https://www.wikipedia.org/");
		driver.navigate().to("https://www.wikipedia.org/");

		// To maximize
		driver.manage().window().maximize();

		WebElement searchText = driver.findElement(By.id("searchInput"));

		searchText.sendKeys("Artificial intelligence", Keys.ENTER);

		// Click History tab

		driver.findElement(By.id("toc-History")).click();

		// Get the title of current page.

		String titleName = driver.getTitle();

		System.out.println("Current title for the Webpage: " + titleName);

		// Qus:3 close browser option is not given.
		// driver.close();

	}

}
// Output:
//  Current title for the Webpage: Artificial intelligence - Wikipedia
