package selenium;// Generated by Selenium IDE
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class ActorDatabase3 {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void actordatabase3() {
    driver.get("http://localhost:3000/");
    driver.manage().window().setSize(new Dimension(1382, 744));
    driver.findElement(By.cssSelector("form > input")).click();
    driver.findElement(By.cssSelector("button:nth-child(4)")).click();
    driver.findElement(By.name("actor_id")).click();
    driver.findElement(By.cssSelector(".actorIdDelete > input")).click();
    driver.findElement(By.cssSelector(".actorIdDelete > input")).sendKeys("215");
    driver.findElement(By.cssSelector("button:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".actorIdDelete > input")).click();
    driver.findElement(By.cssSelector(".actorIdDelete > input")).sendKeys("215");
    driver.findElement(By.cssSelector("button:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".actorIdDelete > input")).click();
    driver.findElement(By.cssSelector(".actorIdDelete > input")).sendKeys("216");
    driver.findElement(By.cssSelector("button:nth-child(2)")).click();
  }
}
