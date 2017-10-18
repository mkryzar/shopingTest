package shopingTest;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PodsumowanieZakupowTest {
	private WebDriver driver;

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
	}


	@Test
	public void sprawdzCzyPoZalogowaniuOrazZakupieSukienkiCenaSieZgadza1() {
		ZakupyUtil.logowanie(driver);
		for (int i = 1; i < 3; i++) {
		ZakupyUtil.wybieranieZakladkiWomen(driver);
		ZakupyUtil.pobranieElementowSize(driver);
		ZakupyUtil.wybieranieRozmiaruS(driver);
		ZakupyUtil.waitForAjax(driver);
		ZakupyUtil.wybieranieSukienki(driver, i);
		ZakupyUtil.waitForAjax(driver);
		ZakupyUtil.wybieranieAddToCard(driver);
		ZakupyUtil.waitForAjax(driver);
		ZakupyUtil.wybieranieProceed(driver);
		ZakupyUtil.waitForAjax(driver);
		}
		ZakupyUtil.pobranieElementowTabeli(driver);
		ZakupyUtil.waitForAjax(driver);
		
		
		
//		ZakupyUtil.sprawdzanieCenyKupionejSukienki(driver);
//		ZakupyUtil.total(driver);

		assertEquals(ZakupyUtil.policzSumeProduktowWKoszyku(driver),
				ZakupyUtil.total(driver),2);

		
	}
	
	@Test
	public void sprawdzCzyPoZalogowaniuZakupieSukienkiOrazDodaniuKolejnejTakiejSamejCenaSieZgadza() {
		ZakupyUtil.logowanie(driver);
		ZakupyUtil.wybieranieZakladkiWomen(driver);
		ZakupyUtil.pobranieElementowSize(driver);
		ZakupyUtil.wybieranieRozmiaruS(driver);
		ZakupyUtil.waitForAjax(driver);
		ZakupyUtil.wybieranieSukienki(driver, i);
		ZakupyUtil.waitForAjax(driver);
		ZakupyUtil.wybieranieAddToCard(driver);
		ZakupyUtil.waitForAjax(driver);
		ZakupyUtil.wybieranieProceed(driver);
		ZakupyUtil.waitForAjax(driver);

}
