 package chromedrive;

 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement;
 import org.openqa.selenium.chrome.ChromeDriver;

 public class FacebookLogin {
     public static void main(String[] args) {
         // Set the path of the chromedriver executable
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\Girish H C\\Downloads\\chromedriver.exe");
         
         // Create a new instance of the ChromeDriver
         WebDriver driver = new ChromeDriver();

         // Navigate to Facebook
         driver.get("https://www.facebook.com/");

         // Enter username and password
         WebElement email = driver.findElement(By.id("Girishhc1996@gmail.com"));
         WebElement password = driver.findElement(By.id("Noway"));
         email.sendKeys("Girishhc1996@gmail.com");
         password.sendKeys("girish");

         // Click on login button
         WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
         loginButton.click();
     }
 }
