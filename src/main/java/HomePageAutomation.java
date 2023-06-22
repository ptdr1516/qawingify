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
         driver.get("https://sakshingp.github.io/assignment/login.html");
    
    }
}