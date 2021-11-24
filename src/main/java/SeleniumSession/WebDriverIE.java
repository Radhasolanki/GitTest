package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverIE {


    public static void main(String[]args){


        System.setProperty("webdriver.ie.driver" ,"C:\\Users\\Keyash\\IdeaProjects\\Software\\iedriverserver.exe");


        WebDriver driver = new InternetExplorerDriver();

        driver.get("https://demo.nopcommerce.com/");











    }
















}
