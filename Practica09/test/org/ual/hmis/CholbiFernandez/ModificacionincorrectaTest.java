package org.ual.hmis.CholbiFernandez;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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

public class ModificacionincorrectaTest {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@Before
	public void setUp() {

		int browser = 0;
		Boolean headless = false;

		switch (browser) {
		case 0:

			FirefoxOptions firefoxOptions = new FirefoxOptions();
			firefoxOptions.setHeadless(true);
			driver = new FirefoxDriver(firefoxOptions);

			break;
		case 1:

			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setHeadless(true);
			chromeOptions.addArguments("window-size=1920,1080");
			driver = new ChromeDriver(chromeOptions);

			break;

		default:
			fail("Please select a browser");
			break;
		}
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void modificacionincorrecta() {
		driver.get("https://msdocs-node-mongo-2022-jcl539.azurewebsites.net/");
		driver.manage().window().setSize(new Dimension(941, 528));
		driver.findElement(By.cssSelector(".row:nth-child(5) .btn-danger")).click();
	}
}
