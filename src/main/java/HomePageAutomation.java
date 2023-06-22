import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class HomePageAutomation {
   
    public static void main(String[] args) {
         // set the path to the chrome driver executable
         System.setProperty("webdriver.chrome.driver", "C:/Users/Ptdr/Desktop/Interview Assessment/QA/my-project/chromedriver_win32/chromedriver.exe");

         // create a new instance of ChromeDriver
         WebDriver driver = new ChromeDriver();

         // Navigate to the login page
         driver.get("https://sakshingp.github.io/assignment/login.html");

         // Perform login using valid credentials
         WebElement usernameInput = driver.findElement(By.id("username"));
         WebElement passwordInput = driver.findElement(By.id("password"));
         WebElement loginButton = driver.findElement(By.xpath("//button[@id='log-in']"));

         usernameInput.sendKeys("ptdr1516");
         passwordInput.sendKeys("abc123@");
         loginButton.click();

         // Wait for the home page to load
         // For waiting mechanism use Thread.sleep(2000)
         try {
            Thread.sleep(2000);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }

         // click functionality on 'amount' header to sort the values
         WebElement amountHeader = driver.findElement(By.xpath("//th[@id='amount']"));
         amountHeader.click();

         // Retreive the sorted values from the transaction table
         List<WebElement> amountValues = driver.findElements(By.xpath("//table//tr/td[5]"));
         List<String> sortedAmounts = new ArrayList<String>();

         for (WebElement amountValue : amountValues) {
            sortedAmounts.add(amountValue.getText());
         }

         // Perform assertions to check if values are sorted
         for (int i = 0; i< sortedAmounts.size() - 1; i++) {
            String currentAmount = sortedAmounts.get(i);
            String nextAmount = sortedAmounts.get(i + 1);

            // Assert that the current amount is less than or equal to the next amount
            double current = Double.parseDouble(currentAmount.replace(",", ""));
            Double next = Double.parseDouble(nextAmount.replace(",", ""));
            assert current <= next : "Values are not sorted correctly";
         } 

         //  Close the browser
         driver.quit();

    }
}