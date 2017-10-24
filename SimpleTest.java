import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class SimpleTest {
    private WebDriver driver;
    private String baseUrl;


    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "http://google.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testTtdasfguhapsdfuhyoaisduf() throws Exception {
        driver.get(baseUrl + "/");
        driver.findElement(By.cssSelector("#lst-ib")).click();
        driver.findElement(By.cssSelector("#lst-ib")).sendKeys("cute cat");
        driver.findElement(By.cssSelector("#lst-ib")).submit();
        List<WebElement> myElements = driver.findElements(By.cssSelector(".rc"));
       for (WebElement el : myElements) {
            assertTrue("Result doesn`t contain search word",el.getText().toLowerCase().contains("cute cat".toLowerCase()));
            System.out.println("cute cat".toLowerCase().contains(el.getText().toLowerCase()));
        }
        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,1900)", "");
        driver.findElement(By.cssSelector("[aria-label='Page 2" + "']")).click();
        List<WebElement> myElements1 = driver.findElements(By.cssSelector(".rc"));
        for (WebElement el : myElements1) {
            assertTrue("Result doesn`t contain search word",el.getText().toLowerCase().contains("cute cat".toLowerCase()));
            System.out.println(el.getText().toLowerCase().contains("cute cat".toLowerCase()));
            System.out.println(el.getText());


    }}
    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}


