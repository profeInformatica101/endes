package com;

public class Factorial { 
	  public static int calculo(int n) {
	       if (n < 0 ) {
	            throw new IllegalArgumentException("Número "+ n + 
	                                  " no puede ser < 0");
	        }
	        int fact = 1;
	        for (int i = 2; i <= n; i++) 
	            fact *= i;        
	        if (fact < 0 ) {
	            throw new ArithmeticException("Overflow, número "+
	                          n +" demasiado grande");
	        }
	        return fact;
	    }
}
/* public static void main(String[] args) {
	System.out.println(calculo(3)); //6
	System.out.println(calculo(5)); //120
	System.out.println(calculo(7)); //5040

//	System.out.println(calculo(-1)); //IllegalArgumentException
	//System.out.println(calculo(20)); //error ArithmeticException	
		/** calculo(20) == 2,432,902,008,176,640,000 */
//	System.out.println(calculo(31)); //738197504	
	    /** calculo(31)  == 8222838654177922817725562880000000 */
	
	 /** El resultado de 31 factorial es mucho más grande 
	  *  que el máximo valor para un int, 
	  *  por lo que debería dar un error de desbordamiento.
	  *  Pero lo que sucede en realidad es 
	  *  que el desbordamiento causa que el resultado se 
	  *  "envuelva" al rango negativo y luego vuelva al rango positivo.
	  *  Este comportamiento es conocido como "integer overflow",
	  *  y es un comportamiento indefinido: no puedes predecir
	  *  el valor resultante porque depende de cómo los bits 
	  *  adicionales "desbordan" y se truncan al tamaño de un int */
		
				
/*	}
    
    
}//
*/
/**
public class Factorial {
    public static BigInteger calculo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Número " + n + " no puede ser < 0");
        }
        BigInteger fact = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
}
*/
