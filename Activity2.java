package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/target-practice/");
    }

    
    @Test
    public void testTitle() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "Target Practice");
    }


    @Test
    public void testBlackButtonFail() {
        driver.findElement(By.cssSelector(".black"));
        Assert.assertEquals(true, false); // intentional failure
    }


    @Test(enabled = false)
    public void testHiddenSkip() {
        System.out.println("This test will not run");
    }

    // 4️⃣ Skipped using SkipException (visible skip)
    @Test
    public void testVisibleSkip() {
        throw new SkipException("Skipping this test intentionally");
    }

    @AfterClass
    public void tearDown() {
        driver.close();
    }
}

