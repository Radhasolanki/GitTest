package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class Firefox {



    public static void main(String[]args) {

        System.setProperty("webdriver.gecko.driver","C:\\Users\\Keyash\\IdeaProjects\\Software\\geckodriver.exe");

          WebDriver driver = new FirefoxDriver();

          driver.get("https://demo.nopcommerce.com/");







     }




}
