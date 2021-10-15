package PSh.AutomationExam.test;

import org.junit.Test;


import PSh.AutomationExam.Base.BlogPage;
import PSh.AutomationExam.Base.TweetPShPage;

public class TweetTest extends BaseTest {
	
	//Esta clase contiene el test donde se extrae el titulo y el contenido del primer Tweet y se lo muestra por consola
	
	// Para resolver el ejercicio obte por hacer click en el icono de twitter de la pagina para que me redigiera a la pagina oficial
	// de twitter, ya que desde el tweet de la pagina blog de psh no pude obtener su contenido
	
	@Test
	public void testTweet() throws InterruptedException {
		BlogPage bp = new BlogPage(driver);
		String cwh = getCurrentWindosHandle(); 
		bp.clickTW();
		swichtToNewWindowHandle(cwh);
		TweetPShPage tpsh = new TweetPShPage(driver);
		System.out.println(tpsh.getTitleFirstTW());
	}

}
