package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverChrome {


    private static ChromeDriver driver;

    public static  void main(String[]args) throws InterruptedException {
        // 1,setup chromedriver9(Mediator) path

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Keyash\\IdeaProjects\\Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window();
        driver.findElement(By.className("ico-login")).click();
       driver.findElement(By.id("Email")).sendKeys("rps3308@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("123456");
      driver.findElement(By.className("login")).click();




    }












    }































































