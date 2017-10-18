package shopingTest;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZakupyUtil {

	public static boolean waitForAjax(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		ExpectedCondition<Boolean> jQueryLoad = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				try {
					return ((Long) ((JavascriptExecutor) driver).executeScript("return jQuery.active") == 0);
				} catch (Exception e) {

					return true;
				}
			}
		};

		ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString()
						.equals("complete");
			}
		};

		return wait.until(jQueryLoad) && wait.until(jsLoad);
	}

	public static void klikniecieLogowania(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		element.click(); // developer musi sam wiedziec, ze znaleziony element jest klikalny
	}

	public static void logowanie(WebDriver driver) {
		klikniecieLogowania(driver);
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("b2bnetworkwarszawa@gmail.com");

		WebElement haslo = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
		haslo.sendKeys("n3tw0rk2017");

		WebElement submit = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
		submit.click();
	}

	public static void wybieranieZakladkiWomen(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
		element.click();//// *[@id="block_top_menu"]/ul/li[1]/a
	}

	public static List<WebElement> pobranieElementowSize(WebDriver driver) {
		WebElement kategoria2 = driver.findElement(By.xpath("//*[@id=\"ul_layered_id_attribute_group_1\"]"));
		List<WebElement> wybor = kategoria2.findElements(By.tagName("li"));
		return wybor;
	}

	public static void wybieranieRozmiaruS(WebDriver driver) {
		WebElement rozmiarS = driver.findElement(By.xpath("//*[@id=\"uniform-layered_id_attribute_group_1\"]/span"));
		rozmiarS.click();
	}
	public static void wybieranieSukienki(WebDriver driver, int nrSukienki) {
														////*[@id="center_column"]/ul/li[2]/div/div[1]/div/a[1]/img
		WebElement element = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li["+nrSukienki+"]/div/div[1]/div/a[1]/img"));
		element.click();////*[@id="block_top_menu"]/ul/li[1]/a
		}
	public static void wybieranieAddToCard(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
		element.click();////*[@id="block_top_menu"]/ul/li[1]/a
	}
	
	public static void wybieranieProceed(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
		element.click();
	}
	
	public static List<WebElement> pobranieElementowTabeli(WebDriver driver) {
		WebElement tabela = driver.findElement(By.xpath("//*[@id=\"cart_summary\"]/tbody"));
		List<WebElement> wybor = tabela.findElements(By.tagName("tr"));
		return wybor;
	}
	
	public static double sprawdzanieCenyKupionejSukienki(WebDriver driver) {
		WebElement cenaSukienki = driver.findElement(By.xpath("//*[@id=\"product_price_1_1_31337\"]/span"));
		String cena = cenaSukienki.getText();
		String samaCena = cena.substring(1);
		double liczba1 = Double.parseDouble(samaCena);
		System.out.println(liczba1);
		
	return liczba1;
	}
	
	public static double total(WebDriver driver) {
		WebElement cenaDrugiejSukienki = driver.findElement(By.xpath("//*[@id=\"total_product\"]"));
		String cena2 = cenaDrugiejSukienki.getText(); //mozemy uniknac dodawania zmiennej poprzez dodanie kropki po getText();
		String samaCena2 = cena2.substring(1);
		double liczba2 = Double.parseDouble(samaCena2);
		System.out.println(liczba2);
		
		return liczba2;
	}
	
	public static double policzSumeProduktowWKoszyku(WebDriver driver) {
		List<WebElement> tabela = pobranieElementowTabeli(driver);
		double suma = 0;
		for(WebElement tr : tabela) {
			List<WebElement> td = tr.findElements(By.tagName("td"));
			WebElement cena = td.get(5);
			String cenaString = cena.getText().substring(1);
			
			suma = suma + Double.parseDouble(cenaString);
			
			
			}return suma;
			
	}}

		
		
	
	

