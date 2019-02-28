package test.cenfotec.kataanalytics.ac.cr;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

import cenfotec.kataanalytics.ac.cr.Analytics;

public class TestAnalytics {
	
	@Test
	public void testMasLarga() {
		
		String palabra = "casa casita casototota";
		String palabra2 = "luz mueble cartas ";
		String palabra3 = "ama verde" ;
		
		String p1 = Analytics.masLarga(palabra);
		String p2 = Analytics.masLarga(palabra2);
		String p3 = Analytics.masLarga(palabra3);
				
		assertEquals("casototota", p1);
		assertEquals("cartas", p2);
		assertEquals("verde", p3);
		
		
	}
	
	@Test
	public void testMasCorta() {
		
		String palabra = "casa casita casototota";
		String palabra2 = "luz mueble cartas ";
		String palabra3 = "ama verde" ;
		
		String p1 = Analytics.masCorta(palabra);
		String cadena2 = Analytics.masCorta(palabra2);
		String cadena3 = Analytics.masCorta(palabra3);
				
		assertEquals("casa", p1);
		assertEquals("luz", cadena2);
		assertEquals("ama", cadena3);
	}

}
