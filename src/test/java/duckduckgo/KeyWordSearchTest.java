package duckduckgo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class KeyWordSearchTest {

    WebDriver driver;

    @BeforeAll
    static void setupAll() {
        WebDriverManager.chromedriver().browserVersion("latest").setup();
    }

    @BeforeEach
    void setup() {
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless"); // запуск без GUI, если вдруг понадобится, например для CI
        driver = new ChromeDriver(options);
        driver.get("https://duckduckgo.com/");
    }

    @Test
    public void positiveTest() {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("weather");
        searchBox.submit();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        List<WebElement> results = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[data-testid='result-title-a']")));
        assertTrue(results.size() > 1);
    }

    @Test
    public void negativeTest() {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("@#@#$$@#$");
        searchBox.submit();
        List<WebElement> results = driver.findElements(By.cssSelector("[data-testid='result-title-a']"));
        assertTrue(results.size() == 0);
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }
}
