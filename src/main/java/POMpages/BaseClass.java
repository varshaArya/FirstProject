package POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass {
	
	BaseClass(WebDriver driver ){
	PageFactory.initElements(driver, this);
	}

}
