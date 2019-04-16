package Principal;

public class Operaciones {
	
	public static void main (String args[]){
		
		int a,b,c,r;
		double x,y,z;
		
		//Refundicion de tipos de variables
		a = (int)Math.sqrt(9); // raiz cuadrada devuelve un dato tipo DOUBLE pero se convierte en entero con INT
		x = 3.0;
		b = (int)Math.sqrt(x);// Int convierte al entero mas proximo menor - sqrt > raiz cuadrada
		y = Math.sqrt(5.25);
		z = Math.round(y); // redondeo y resultado double
		
		System.out.println(a);
		System.out.println(x);
		System.out.println(b);
		System.out.println("El resultado Y es "+y);
		System.out.println("El resultado Z es "+z);
		
		z = Math.pow(y, z); // potencia
		System.out.println(z);
		
		System.out.println("El resultado final de z "+"es "+ z);
		
	}

}
