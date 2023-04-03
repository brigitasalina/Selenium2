import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Skelbiult {
    public WebDriver driver;

    @Test
    public void pageLoads() {

       driver.get("https://www.skelbiu.lt");
        WebElement oneTrustBtn = driver.findElement(By.id("onetrust-accept-btn-handler"));
        oneTrustBtn.click();
        driver.findElement(By.id("searchKeyword")).sendKeys("garu puodas");
        driver.findElement(By.id("searchButton")).click();

    }


    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.com.driver","drivers\\chromedriver111.exe");
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver. manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   }

   @AfterClass
    public void afterClass(){
//        driver.quit();
   }

}
