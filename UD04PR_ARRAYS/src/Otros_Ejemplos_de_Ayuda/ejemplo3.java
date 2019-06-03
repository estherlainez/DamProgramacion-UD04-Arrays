package Otros_Ejemplos_de_Ayuda;

import java.util.Scanner;

public class ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int[][] num=new int[10][10];
		int[] sumafila=new int[10];
		int[] sumacolumna=new int[10];
		int suma=0; int sumatotal=0;
		int numeroIntroducido;
		int sumadiagonal;
		for (int i=0;i<10;i++) {
			for (int j=0;j<10;j++) {
				num[i][j]=(int)(Math.random()*51);
				sumatotal=sumatotal+num[i][j];
			}
		}
		do {
		  System.out.println(" ");	
		  System.out.println("                 -----------------------------------------");
		  System.out.println("                 |  1.-Mostrar suma parcial por filas    |");
		  System.out.println("                 |  2.-Mostrar suma parcial por columnas |");
		  System.out.println("                 |  3.-Mostrar suma total                |");
		  System.out.println("                 |  4.-Mostrar la suma de la diagonal    |");
		  System.out.println("                 |  5.-Salir del programa                |");
		  System.out.println("                 -----------------------------------------");
		  
		  numeroIntroducido = teclado.nextInt();
		  
		 
		  for (int i=0;i<10;i++) {
			  for (int j=0;j<10;j++) {
				suma=suma+num[i][j];
			  }
			  sumafila[i]=suma;
			  suma=0;
		   }
		  for (int j=0;j<10;j++) {
			  for (int i=0;i<10;i++) {
				  suma=suma+num[i][j];
			  }
			  sumacolumna[j]=suma;
			  suma=0;
		  }
					
			  
		  switch (numeroIntroducido) {
			  case 1: 
				  	System.out.println("La tabla final es: ");
					for (int i=0;i<10;i++) {
						for (int j=0;j<10;j++) {
							if (num[i][j]<10) {
								System.out.print(" | "+num[i][j]+"| ");
							}
							if (num[i][j]>=10) {
								System.out.print(" |"+num[i][j]+"| ");
							}							
						}
					System.out.print("     |"+sumafila[i]+"| ");
					System.out.println(" ");
					}	
					System.out.println("                                                                   ^");
					System.out.println("                                                                   |");
					System.out.println("                                                                   |");
					System.out.println("                                                         suma parcial por filas");
					break;
			  case 2: 
				  for (int i=0;i<10;i++) {
						for (int j=0;j<10;j++) {
							if (num[i][j]<10) {
								System.out.print(" |  "+num[i][j]+"| ");
							}
							if (num[i][j]>=10) {
								System.out.print(" | "+num[i][j]+"| ");
							}							
						}
					System.out.println(" ");
					}
				    System.out.println(" ");
					for (int j=0;j<10;j++) {
						System.out.print(" |"+sumacolumna[j]+"| ");
						}
					System.out.print(" <---------Suma por columnas");
					break;
			  case 3: 
				  System.out.println("La suma total es: "+sumatotal);break;
			  case 4: 
				  sumadiagonal=num[0][0]+num[1][1]+num[2][2]+num[3][3]+num[4][4]+num[5][5]+num[6][6]+num[7][7]+num[8][8]+num[9][9];
				  System.out.println("La suma de la diagonal es: "+sumadiagonal);break;
			  case 5:
				  System.out.println("Has salido");
				  System.out.println("                 -------------------------------");
				  System.out.println("                 |            Autor            |");
				  System.out.println("                 |                             |");
				  System.out.println("                 |         Jorge Chueca        |");
				  System.out.println("                 |                             |");
				  System.out.println("                 -------------------------------");;break;				
			  }
			}while(numeroIntroducido!=5);
		teclado.close();
	}
}
