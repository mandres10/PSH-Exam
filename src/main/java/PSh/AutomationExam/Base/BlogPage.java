package PSh.AutomationExam.Base;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class BlogPage extends Base {
	
	//Esta clase tiene las funciones sobre los objetos obtenidos de la seccion "blog" de la pagina 
    
	By logoTW = By.xpath("/html/body/footer/div/div[1]/ul[2]/li[3]/a");
	By firstTweet = By.xpath("/html/body/div/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div/div[2]/section/div/div/div[1]");
	
	public BlogPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public By getLogoTW() {
		return this.logoTW;
	}

	public void clickTW() throws InterruptedException {
		if (isDisplayed(this.logoTW))
			click(this.logoTW);
	}
	
	
}
