package PSh.AutomationExam.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TweetPShPage extends Base {
	
	//Esta clase tiene las funciones sobre los objetos obtenidos de la pagina de twitter de psh 
	
	By firstTweet = By.xpath("/html/body/div/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div/div[2]/section/div/div/div[1]");
	
	public TweetPShPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public By getFirstTweet() {
		return this.firstTweet;
	}
	
	public String getTitleFirstTW() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement wTweet = wait.until(ExpectedConditions.presenceOfElementLocated(this.firstTweet));
		String result=null;
	    result = getText(wTweet);
		return result;
	}
	
	
}
