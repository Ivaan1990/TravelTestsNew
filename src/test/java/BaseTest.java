import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

/**
 * @author Ivan Yushin
 *
 */
public class BaseTest {
    public WebDriver drv;

    @Before
    public void initTest(){
        System.out.println("Travel");
        System.setProperty("webdriver.chrome.driver", "drv/chromedriver.exe");
        drv = new ChromeDriver();
        drv.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        drv.manage().window().maximize();
        drv.get("https://www.rgs.ru/");
    }

    @After
    public void close(){
        drv.quit();
    }
}