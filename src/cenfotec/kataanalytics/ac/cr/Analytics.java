package cenfotec.kataanalytics.ac.cr;

import java.util.LinkedList;
import java.util.StringTokenizer;

public class Analytics {

	public static void main (String [] args) {
		String txt = "casa casita casototota";
		
		masLarga(txt);
		
		
	}

	
	public static String masLarga(String cadenaPalabra) {
		
		String palabra = cadenaPalabra; 
		
		StringTokenizer cadena = new StringTokenizer (palabra);
		
		String sCadena;	    
	    String palabraMasGrande = "";
	 
	    int palabraMasGrandeSize = 0;
	 
	    
	    
	    int palabras = cadena.countTokens();
	    
	    for (int x=0; x<palabras; x++){
	    	
	    	sCadena = cadena.nextToken();
	    	
	    	if (sCadena.length() >= palabraMasGrandeSize){
	    		palabraMasGrande = sCadena;
	    		palabraMasGrandeSize = sCadena.length();
	    
	   
	    	}
	    	
	    }
	    
	   return palabraMasGrande;
		

		
	}
		
	

}
