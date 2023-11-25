import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class unittest {
    @Test
    public void testLoginPage() {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/home/runner/bin/chromedriver");

        // Print ChromeDriver version
        System.out.println("ChromeDriver version: " + System.getProperty("webdriver.chrome.driver.version"));

        // Print Chrome browser version
        Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
        System.out.println("Chrome browser version: " + caps.getCapability("browserVersion"));


        // Create a new instance of the Chrome driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        //options.AddArgument("no-sandbox");
        WebDriver driver = new ChromeDriver(options);

        // Navigate to the login page
        driver.get("/home/runner/work/Github-Action-Project/Github-Action-Project/WebContent/login.html");

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
