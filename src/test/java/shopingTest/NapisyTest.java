package shopingTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NapisyTest {

   @Test
   
   public void czyDanyCiagZnakowMaDlugosc4() {
	   
	   String nazwa = "lawa";
	   //nazwa.length();
	   
	   assertEquals(4, nazwa.length());
	   
	   
   }
   @Test
   public void czyWyrazZaczynasieOdLiteryT() {
	   String nazwa = "trawa";
	   String zmienna =  nazwa.substring(0, 1);
	   
	   assertEquals( new String("t"), zmienna);
   }
   
   
   @Test
   public void czyOstatnieDwieLiteryWNapisieToNa() {
	   String slowo = "maniana";
			   String ostatnieDwieLitery = slowo.substring(5, slowo.length());
			   
			   assertEquals("na", ostatnieDwieLitery);
   }
   
   @Test
   public void czySlowoZawieraLitereK() {
	   String slowo = "ksiazka";
	   
	   assertEquals(true, slowo.contains("k"));
   }
   
   
   @Test
   public void czySlowoZawieraNapisMa() {
	   String slowo = "mama";
	   assertEquals(true, slowo.contains("ma"));
	   
   }
   
   @Test 
   public void czySlowoRozpoczynaSieOdMak() {
	   String  slowo = "makaron";
	   String poczatek = slowo.substring(0, 3);
	   assertEquals(true, poczatek.equals("mak"));
   }
   
   @Test
   public void zliczycIleRazyWystepujeLiteraA() {
	   String slowo = "kaszka";
	   int licznik = 0;
	   for( Character znak : slowo.toCharArray() ) {
		   if (znak.charValue() == 'a') {
			   licznik++;
		   }
	   }
	   assertEquals(2, licznik);
   }
   
   
   @Test
   public void czyPodanyNapisJestZawieraLiczbe21() {
	   String cena = "$21";
	  String liczbaString = cena.substring(1);
	  int liczba = Integer.parseInt(liczbaString);
			  
			  assertEquals(21, liczba);
   }
   
   
   @Test
   public void czyPodanyNapisZawieraLiczbe13() {
	   String cena = "cena: 113.12z�";
	   int indexDwukropek = cena.indexOf(":");
	   int indexZ = cena.indexOf("z");
	   String liczbaString = cena.substring(indexDwukropek + 2, indexZ);
	   double liczba = Double.parseDouble(liczbaString);
		assertEquals(113.12, liczba,2);	   
	   //System.out.println(liczbaString);
   }
   
//   @Test
//   public void 
}
