package week2.day3;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launchbrowser {

	public static void main(String[] args) {
   //Launch the browser
	ChromeDriver driver=new ChromeDriver();
	
	//Load url
	driver.get("https://www.facebook.com/");
	
	//Maximize window
	driver.manage().window().maximize();
	
	
	//close the browser
	driver.close();

	}

		
	}


