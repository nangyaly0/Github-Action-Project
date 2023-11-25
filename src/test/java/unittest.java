import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class unittest {
    @Test
    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/home/runner/bin/chromedriver  ");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to the login page
        driver.get("file:///path/to/your/project/WebContent/login.html");

        // Find the element by its ID
        WebElement welcomeDiv = driver.findElement(By.id("topmid"));

        // Check if the element is present
        if (welcomeDiv.isDisplayed()) {
            WebElement h1Element = welcomeDiv.findElement(By.tagName("h1"));
            String messageText = h1Element.getText();
            System.out.println("Element is present. Message: " + messageText);
        } else {
            System.out.println("Element is not present on the login page.");
        }

        // Close the browser
        driver.quit();
    }
}
