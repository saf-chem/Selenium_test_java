import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;
import java.util.Set;

public class SearchTest {

    @Test
    public void openGoogleComInSearchTest(){
        File file = new File("/Users/pasha/java_basics/Selenium_test_java/src/test/java/resources/chromedriver");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.youtube.com/");
        driver.navigate().refresh();
        System.out.println(driver.getTitle());
        driver.quit();


    }
}
