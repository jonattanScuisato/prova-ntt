package settings;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleChrome {

    public WebDriver driver;

    @Before
    public void start_test(Scenario scenario) {

        driver = new ChromeDriver();

        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\driver\\chromedriver.exe");

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://www.google.com.br");
        driver.manage().window().maximize();

    }
}
