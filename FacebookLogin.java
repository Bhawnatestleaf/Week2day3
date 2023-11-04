package week2.day3;

import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
	//Launch the browser
	ChromeDriver driver=new ChromeDriver();
	
	//Load the url
	driver.get("https://www.facebook.com/");
	
	//Maximize Window
    driver.manage().window().maximize();
    
    //wait for seconds to not close
    Thread.sleep(3000);
    
    //close window
    driver.close();

	}


	}

