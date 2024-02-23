package demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetupFirefox {

	public static void main(String[] args) {
		//setup firefox browser
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "G:\\geckodriver-v0.34.0-win32\\geckodriver.exe");

	}

}
