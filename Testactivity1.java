package demos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity1 {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new FirefoxDriver();
        driver.get("https://training-support.net");
    }

    @Test
    public void testTitleAndAboutPage() {
        String title = driver.getTitle();
        System.out.println("Home page title: " + title);
        Assert.assertEquals(title, "Training Support");
        driver.findElement(By.linkText("About Us")).click();
        String newTitle = driver.getTitle();
        System.out.println("About page title: " + newTitle);
        Assert.assertTrue(newTitle.contains("About"));
    }

    @AfterClass
    public void tearDown() {
        driver.close();
    }
}

