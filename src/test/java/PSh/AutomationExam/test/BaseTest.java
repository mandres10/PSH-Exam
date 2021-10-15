package PSh.AutomationExam.test;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import PSh.AutomationExam.Base.Base;

public class BaseTest {
	
	static WebDriver driver;
	Base base;
	
	
	
	//Esta clase contiene las funciones que debe cumplir el driver y ademas las funciones que seran base para usar en los Test
	//Use un refresh ya que la pagina a veces no carga en la primera apertura que hace y arroja error
	
	@Before 
	public void setUp() throws Exception{
		base = new Base(driver);
		driver = base.chromeDriverConnection();
		base.visit("https://qa.psh.test.wearepsh.com/blog/");//("https://twitter.com/wearepsh/");
		driver.navigate().refresh();
		
	}
	
	@After 
	public void tearDown() throws Exception{
		driver.quit();
	}
	
	//devuelve el id de la ventana actual
	public String getCurrentWindosHandle () {
		return driver.getWindowHandle();
	}
	
	//me muevo a la ventana que abro
	public void swichtToNewWindowHandle(String currentWindowHandle) {
		ArrayList<String> windowHandles = new ArrayList<String>(driver.getWindowHandles());
	    for (String window:windowHandles){
	        if (window != currentWindowHandle){
	            driver.switchTo().window(window);    
	        }
	    }
	}
	
	

}
