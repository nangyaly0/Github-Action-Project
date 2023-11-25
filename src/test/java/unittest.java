import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class unittest {
    @Test
    public void testLoginPage() {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to the login page
        driver.get("/Users/alikhan/Documents/Lambton_College/3rd_semester/CI-CD/Github-Action-Project/WebContent/login.html");

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
