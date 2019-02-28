package test.cenfotec.kataanalytics.ac.cr;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;


import org.junit.jupiter.api.Test;

import cenfotec.kataanalytics.ac.cr.Analytics;

public class TestAnalytics {
	
	@Test
	public void testMasLarga() {
		
		String palabra = "casa casita casototota";
		String palabra2 = "luz promotora mueble";
		String palabra3 = "ama verde" ;
		
		String p1 = Analytics.masLarga(palabra);
		String p2 = Analytics.masLarga(palabra2);
		String p3 = Analytics.masLarga(palabra3);
				
		assertEquals("casototota", p1);
		assertEquals("promotora", p2);
		assertEquals("verde", p3);

	}
	
	@Test
	public void testMasCorta() {
		
		String palabra = "casita casototota casa";
		String palabra2 = "mueble arboleda anaranjado luz";
		String palabra3 = "verde ama" ;
		
		String cadena1 = Analytics.masCorta(palabra);
		String cadena2 = Analytics.masCorta(palabra2);
		String cadena3 = Analytics.masCorta(palabra3);
				
		assertEquals("casa", cadena1);
		assertEquals("luz", cadena2);
		assertEquals("ama", cadena3);
	}
	
	@Test
	public void testMasLargaOrdenado() {
		
		String palabra = "arbol lapicero maiz";
		String palabra2 = "comida playas sol";
		String palabra3 = "mujer rosas" ;
		
		String p1 = Analytics.masLarga(palabra);
		String p2 = Analytics.masLarga(palabra2);
		String p3 = Analytics.masLarga(palabra3);
				
		assertEquals("lapicero", p1);
		assertEquals("comida", p2);
		assertEquals("mujer", p3);

	}
	

	@Test
	public void testMasCortaOrdenado() {
		
		String pal = "reparto tren an";
		String pal2 = "trenza azul";
		String pal3 = "verde ama" ;
		
		String cade1 = Analytics.masCorta(pal);
		String cade2 = Analytics.masCorta(pal2);
		String cade3 = Analytics.masCorta(pal3);
				
		assertEquals("an", cade1);
		assertEquals("azul", cade2);
		assertEquals("ama", cade3);
	}
}
