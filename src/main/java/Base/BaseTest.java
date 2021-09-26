package Base;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.Logger;

public class BaseTest {

    public static WebDriver driver;
    public Logger log = Logger.getLogger(String.valueOf(BaseTest.class));

    @BeforeClass
    public static void browserOpen() {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.gittigidiyor.com/");
        driver.manage().window().maximize();

    }

    @AfterClass
    public static void browserClose() {
        driver.close();
    }

}
