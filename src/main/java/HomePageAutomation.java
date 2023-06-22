import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageAutomation {
   
    public static void main(String[] args) {
         // set the path to the chrome driver executable
         System.setProperty("webdriver.chrome.driver", "C:/Users/Ptdr/Desktop/Interview Assessment/chromedriver_win32/chromedriver.exe");

         // create a new instance of ChromeDriver
         WebDriver driver = new ChromeDriver();

         // Navigate to the login page
         driver.get("https://sakshingp.github.io/assignment/home.html");

         // Perform login using valid credentials
         WebElement usernameInput = driver.findElement(By.id("username"));
         WebElement passwordInput = driver.findElement(By.id("password"));
         WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(), 'Login')]"));

         usernameInput.sendKeys("valid-username");
         passwordInput.sendKeys("valid-password");
         loginButton.click();

         // Wait for the home page to load
         // For waiting mechanism use Thread.sleep(2000)
         try {
            Thread.sleep(2000);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }

         // click on the AMOUNT header to sort the values
         WebElement amountHeader = driver.findElement(By.xpath("//th[contains(text(), 'amount')]"));
         amountHeader.click();

         // Retreive the sorted values from the transaction table
    
    }
}