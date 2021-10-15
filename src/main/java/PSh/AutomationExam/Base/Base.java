package PSh.AutomationExam.Base;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {
	
	//Clase que tiene algunas de las funciones que se puede hacer sobre un objeto y la configuracion de que navegador se va a usar
	
	protected WebDriver driver;
	
	public Base(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebDriver chromeDriverConnection() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mauro.andres\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	public String getText(WebElement element) {
		return element.getText();
	}
	
	public String getText (By locator) {
		return driver.findElement(locator).getText();
	}
	
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	public Boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		}catch (org.openqa.selenium.NoSuchElementException e){
			return false;
		}
	}
	
	public void visit (String url) {
		driver.get(url);
	}
	
	
}
