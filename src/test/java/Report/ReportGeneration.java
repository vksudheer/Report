package Report;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReportGeneration {
    WebDriver driver;
    @Test(priority = 1)
    public void openBrowser(){
    System.setProperty("webdriver.chrome.driver","D:\\Extended report\\chromedriver.exe");
    this.driver = new ChromeDriver();
    driver.manage().window().maximize();
    }
   @Test(priority = 2)
   public void  Navigate() {
        this.driver.get("https://www.google.com/");
        driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/div/div/div/div[1]/div[1]/a")).click();
   }
   @Test(priority = 3)
    public void checkSignInButton(){
       WebElement element = driver.findElement(By.xpath("/html/body/nav/div/a[2]"));
       System.out.println(element.getText());
       Assert.assertEquals(element.getText(),"Sign In");
   }
   @Test(priority = 4)
   public void clickForSignIn(){
       driver.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
       }
     @Test(priority = 5 )
    public void checkSignInPage(){
         WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/content/form/div[3]/div/div/content/span"));
         Assert.assertEquals(element.getText(),"Forgot email?");
      }
}
