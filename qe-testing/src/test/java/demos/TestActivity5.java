package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class TestActivity5 {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/target-practice");
        driver.manage().window().maximize();
    }

    @Test
    public void pageTitleTest() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "Target Practice");
    }

    @Test(groups = {"HeaderTests"})
    public void thirdHeaderTextTest() {
        // Find all headers
        List<WebElement> headers = driver.findElements(By.xpath("//h1 | //h2 | //h3 | //h4 | //h5 | //h6"));

        WebElement thirdHeader = headers.get(2);

        String text = thirdHeader.getText();
        Assert.assertEquals(text, "Third header");
    }

    @Test(groups = {"HeaderTests"})
    public void fifthHeaderColorTest() {
        List<WebElement> headers = driver.findElements(By.xpath("//h1 | //h2 | //h3 | //h4 | //h5 | //h6"));

        WebElement fifthHeader = headers.get(4);

        String color = fifthHeader.getCssValue("color");
        System.out.println("Fifth header color: " + color);

        Assert.assertNotNull(color);
    }


    @Test(groups = {"ButtonTests"})
    public void emeraldButtonTextTest() {
        WebElement emeraldButton = driver.findElement(By.cssSelector("button.emerald"));
        String text = emeraldButton.getText();

        Assert.assertEquals(text, "Emerald");
    }

    @Test(groups = {"ButtonTests"})
    public void thirdRowFirstButtonColorTest() {
        // Third row
        WebElement thirdRow = driver.findElement(By.xpath("(//div[@class='row'])[3]"));

        // First button in third row
        WebElement firstButton = thirdRow.findElement(By.xpath(".//button[1]"));

        String color = firstButton.getCssValue("background-color");
        System.out.println("First button in third row color: " + color);

        Assert.assertNotNull(color);
    }

    
    @AfterClass
    public void tearDown() {
        driver.close();
    }
}

