import java.io.IOException;
import java.math.BigInteger;
import java.util.Random;

import javax.swing.JOptionPane;


public class Karatsuba {
	
	public static BigInteger Karatsuba(BigInteger a, BigInteger b) {
		try {	
			//Se determina cual numero utiliza mas bits
				    
			
					int numMayor = Math.max(a.bitLength(), b.bitLength());
				    
				    //si el numero mayor usa menos de mil bits es mas eficiente la multiplicacion normal 
				    if (numMayor <= 1000) {
				      return multNormal(a,b);
				    }
				    // se determina en que bit se encuentra la mitad para separa los numeros
				    int mitad = numMayor / 2;
				 
				    //se dividen los numero en dos partes
				    BigInteger w = a.shiftRight(mitad);
				    BigInteger x = a.subtract(w.shiftLeft(mitad));
				    BigInteger y = b.shiftRight(mitad);
				    BigInteger z = b.subtract(y.shiftLeft(mitad));
				 
				    //se realizan multiplicaciones y sumas de los numeros divididos en partes
				    BigInteger p = multKaratsuba(w, y); 
				    BigInteger q = multKaratsuba(x, z); 
				    BigInteger r = multKaratsuba(x.add(w), z.add(y));
				    BigInteger z1 = r.subtract(p).subtract(q);
				 
				    //se unen todos los resultados para dar la solucion final
				    return p.shiftLeft(2 * mitad).add(z1.shiftLeft(mitad)).add(q);
				 
				    
		}
		catch (IllegalArgumentException iae) {
			
			JOptionPane.showMessageDialog(null,"Se han ingresado valores no validos, "+"\n"+
												"Solo son permitidos numeros enteros ");
		     
		    return null;
		}
	    catch (Exception e) {
	    		
	    	JOptionPane.showMessageDialog(null,"Se han ingresado valores no validos, "+"\n"+
												"Solo son permitidos numeros enteros ");

	    	return null;
	    }
		
	
	}
	
	//realiza una multiplicacion usando el metodo Karatsuba
	public static BigInteger multKaratsuba(BigInteger a, BigInteger b){
		
		return Karatsuba(a, b);
	}
	
	//realiza una multiplicacion normal
	public static BigInteger multNormal (BigInteger a, BigInteger b){
		
		return a.multiply(b);
	}
	
	//genera un numero al azar de 1000 digitos para ser utilizado en la multiplicacion Karatsuba
	public static BigInteger numeroAlAzar(){
			
		return new BigInteger(10, new Random());
	}
}
