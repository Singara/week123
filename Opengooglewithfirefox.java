package week3.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Opengooglewithfirefox {
	
	public static void main(String[] args){
		//TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\programfiles\\mozilafirefox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http:\\www.google.co.in");
		driver.close();
		
		
		
	}
	

}
