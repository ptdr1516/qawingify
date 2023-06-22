import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageAutomation {
    public static void main(String[] args) {
        // set the path to the chrome driver executable
        System.setProperty("webdriver.chrome.driver", "C:/Users/Ptdr/Desktop/Interview Assessment/QA/my-project/chromedriver_win32/chromedriver.exe");

        // create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the login page
        driver.get("https://sakshingp.github.io/assignment/login.html");

        // Perforing functional testing scenarios
        // Testing login with valid credentials
        WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginButtton = driver.findElement(By.xpath("//button[@id='log-in']"));

        usernameInput.sendKeys("ptdr1516");
        passwordInput.sendKeys("123456");
        // Find and interact with the checkbox
        WebElement rememberMeCheckbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        rememberMeCheckbox.click();
        loginButtton.click();

         // Verify that the application displays an error message when invalid credentials are used for login
         WebElement errorMessage = driver.findElement(By.id("error-message"));
         String errorText = errorMessage.getText();
         if (errorText.equals("Invalid username or password")) {
             System.out.println("Test Case 1: Verify Invalid Login - Passed");
         } else {
             System.out.println("Test Case 1: Verify Invalid Login - Failed");
         }
 
         // Testing login with empty credentials
         usernameInput.clear();
         passwordInput.clear();
         loginButtton.click();
 
         // Verify that the application displays an error message when the login fields are submitted empty
         String emptyFieldsErrorText = errorMessage.getText();
         if (emptyFieldsErrorText.equals("Username and Password are required fields")) {
             System.out.println("Test Case 2: Verify Empty Login Fields - Passed");
         } else {
             System.out.println("Test Case 2: Verify Empty Login Fields - Failed");
         }
 
         // Verify that the "Remember Me" checkbox retains the user's login state
         usernameInput.sendKeys("ptdr1516");
         passwordInput.sendKeys("123456");
         
         loginButtton.click();
         driver.navigate().refresh();
         
         String loggedInUsername = usernameInput.getAttribute("value");
         if (loggedInUsername.equals("ptdr1516")) {
             System.out.println("Test Case 4: Verify Remember Me Functionality - Passed");
         } else {
             System.out.println("Test Case 4: Verify Remember Me Functionality - Failed");
         }
 

        // close the browser
        driver.quit();
    }
}
