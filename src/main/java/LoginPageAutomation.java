import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageAutomation {
    public static void main(String[] args) {
        // set the path to the chrome driver executable
        System.setProperty("webdriver.chrome.driver", "C:/Users/Ptdr/Desktop/Interview Assessment/chromedriver_win32/chromedriver.exe");

        // create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Nvigate to the login page
        driver.get("https://sakshingp.github.io/assignment/login.html");

        // Perforing functional testing scenarios
        // Testing login with valid credentials
        WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginButtton = driver.findElement(By.xpath("//button[contains(text(), 'login')]"));

        usernameInput.sendKeys("ptdr1516");
        passwordInput.sendKeys("abc123@");
        loginButtton.click();

        // Testing login with empty credentials
        usernameInput.clear();
        passwordInput.clear();
        loginButtton.click();

        // close the browser
        driver.quit();
    }
}
