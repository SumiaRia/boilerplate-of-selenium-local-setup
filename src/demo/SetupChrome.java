package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetupChrome {

	public static void main(String[] args) {
		//chrome driver setup 
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "G:\\chrome-win64\\chrome-win64\\chrome.exe");
		
		//other way to setup
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.setBinary("G:\\chrome-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(options);
		

	}

}
