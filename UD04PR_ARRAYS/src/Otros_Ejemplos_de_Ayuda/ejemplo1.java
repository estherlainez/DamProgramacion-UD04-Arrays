package Otros_Ejemplos_de_Ayuda;

import java.util.Scanner;

public class ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int numero=(int)(Math.random()*10+1);	
		int numeroIntroducido;
		do {
			System.out.println("Introduce numero: ");
			numeroIntroducido = teclado.nextInt();
			if (numero==numeroIntroducido){
				System.out.println("Has acertado el número, felicidades");
			}else {
				if (numero<numeroIntroducido){
					System.out.println("El numero es MENOR");
				}
				if (numero>numeroIntroducido){
					System.out.println("El numero es MAYOR");
				}				
			}			
		} while (numero!=numeroIntroducido);
		teclado.close();
	}
}
