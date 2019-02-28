package test.cenfotec.kataanalytics.ac.cr;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;

import cenfotec.kataanalytics.ac.cr.Analytics;

public class TestAnalytics {
	
	@Test
	public void testMasLarga() {
		
		String palabra = "casa casita casototota";
		
		String listaPalabras = Analytics.masLarga(palabra);
				
		assertEquals("casototota", listaPalabras);
		
		
	}

}
