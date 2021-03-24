import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class Base {
    public WebDriver driver;

    public WebDriver initializeDriver() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/stevenmignardi/Desktop/TEST OKTANA/tools/chromedriver");
        this.driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        return driver;
    }
}
