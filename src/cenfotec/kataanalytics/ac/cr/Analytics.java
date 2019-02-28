package cenfotec.kataanalytics.ac.cr;

import java.util.StringTokenizer;

public class Analytics {


	public static String masLarga(String cadenaPalabra) {
		
		String palabra = cadenaPalabra; 
		
		StringTokenizer cadena = new StringTokenizer (palabra);
		
		String sCadena;	    
	    String palabraMasGrande = "";
	 
	    int palabraMasGrandeSize = 0;
	
	    int palabras = cadena.countTokens();
	    
	    for (int x=0; x<palabras; x++){
	    	
	    	sCadena = cadena.nextToken();
	    	
	    	if (sCadena.length() > palabraMasGrandeSize){
	    		palabraMasGrande = sCadena;
	    		palabraMasGrandeSize = sCadena.length();

	    	}
	    	
	    }
	    
	   return palabraMasGrande;
	
	}
	
		
	public static String masCorta(String cadenaPalabra) {
		
		String palabra = cadenaPalabra; 
		
		StringTokenizer cadenaPalabras = new StringTokenizer (palabra);
		
		String sCadena;	    
	    String palabraMasCorta = "";
	    String palabraMasLarga = "";
	    
	 
	    int palabraMasCortaSize = 0;
	
	    int palabras = cadenaPalabras.countTokens();
	    
	    for (int x=0; x<palabras; x++){
	    	
	    	sCadena = cadenaPalabras.nextToken();
	    	
	    	if (sCadena.length() >  palabraMasCortaSize){
	
	    		palabraMasCortaSize = sCadena.length();
	    	}else {
	    		
	    		palabraMasCorta = sCadena;
	    	}
	    	
	    }
	    
	   return palabraMasCorta;
	
	}
	

}
