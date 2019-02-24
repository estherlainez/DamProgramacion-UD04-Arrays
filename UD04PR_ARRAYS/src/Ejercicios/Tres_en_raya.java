package Ejercicios;
import java.util.Scanner;
import java.util.Arrays;
public class Tres_en_raya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int tablero[][]=new int[3][3];
		int turno=0;
		int i=0,j=0,a=0,b=0;
		int jugador1=1;
		int jugador2=0;
		String nombre1;
		String nombre2;	
		boolean ganar=false;
		
		if(turno%2==0) {
			System.out.println("Turno del jugador 1");
		}else {
			System.out.println("Turno del jugador 2");
		}
		
		System.out.println("Introduce tu nombre jugador 1");
		nombre1=teclado.nextLine();
		System.out.println(nombre1+" juega con el simbolo "+jugador1);
		
		System.out.println("Introduce tu nombre jugador 2");
		nombre2=teclado.nextLine();
		System.out.println(nombre2+" juega con el simbolo "+jugador2);
		
		for( i=0;i<3;i++) {
			for( j=0;j<3;j++) {
				 tablero[i][j]=' ';
				 System.out.println(tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2] + "\n------------");
				 System.out.println(tablero[1][0] + " | " + tablero[1][1] + " | " + tablero[1][2] + "\n------------");
				 System.out.println(tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2] + "\n");
				 
			}
		
		}
		
		do {
			do {
				do {
						
				//jugador 1
				System.out.println(nombre1 +" Selecione fila");
				i=teclado.nextInt();
				System.out.println(nombre1+" Selecione columna");
				j=teclado.nextInt();
				tablero[i][j]=jugador1;	
				System.out.println(tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2] + "\n-------------");
			    System.out.println(tablero[1][0] + " | " + tablero[1][1] + " | " + tablero[1][2] + "\n-------------");
			    System.out.println(tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2] + "\n");
			    
			    //jugador2
			    System.out.println(nombre2+" Selecione fila");
				a=teclado.nextInt();
				System.out.println(nombre2+" Selecione columna");
				b=teclado.nextInt();
			    tablero[a][b]=jugador2;
			    System.out.println(tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2] + "\n-------------");
			    System.out.println(tablero[1][0] + " | " + tablero[1][1] + " | " + tablero[1][2] + "\n-------------");
			    System.out.println(tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2] + "\n");
			    
			    
			    if ((tablero[0][0] == jugador1) && (tablero[0][1] == jugador1) && (tablero[0][2]==jugador1)){
					ganar = true;
					System.out.println("¡"+nombre1+" has ganado!");
				}else {
					turno++;
				}
			    if ((tablero[1][0] == jugador1) && (tablero[1][1] == jugador1) && (tablero[1][2]==jugador1)){
					ganar = true;
					System.out.println("¡"+nombre1+" has ganado!");
				}else {
					turno++;
				}
			    if ((tablero[2][0] == jugador1) && (tablero[2][1] == jugador1) && (tablero[2][2]==jugador1)){
					ganar = true;
					System.out.println("¡"+nombre1+" has ganado!");
				}else {
					turno++;
				}
				if ((tablero[0][0] == jugador1) && (tablero[1][1] == jugador1) && (tablero[2][2]==jugador1)){
					ganar = true;
					System.out.println("¡"+nombre1+" has ganado!");
				}else {
					turno++;
				}
				if ((tablero[0][2] == jugador1) && (tablero[1][1] == jugador1) && (tablero[2][0]==jugador1)){
					ganar = true;
					System.out.println("¡"+nombre1+" has ganado!");
				}else {
					turno++;
				}
				if ((tablero[0][0] == jugador1) && (tablero[1][0] == jugador1) && (tablero[2][0]==jugador1)){
					ganar= true;
					System.out.println("¡"+nombre1+" has ganado!");
				}else {
					turno++;
				}
				if ((tablero[0][1] == jugador1) && (tablero[1][1] == jugador1) && (tablero[2][1]==jugador1)){
					ganar= true;
					System.out.println("¡"+nombre1+" has ganado!");
				}else {
					turno++;
				}
				if ((tablero[0][2] == jugador1) && (tablero[1][2] == jugador1) && (tablero[2][2]==jugador1)){
					ganar = true;
					System.out.println("¡"+nombre1+" has ganado!");
				}else {
					turno++;
				}
			
		}while((i>=0 || i<=2||j>=0 ||j<=2)&&(tablero[i][j]!=' '));
		
		
			if ((tablero[0][0] == jugador2) && (tablero[0][1] == jugador2) && (tablero[0][2]==jugador2)){
				ganar = true;
				System.out.println("¡"+nombre2+" has ganado!");
			}else {
				turno++;
			}
			if ((tablero[1][0] == jugador2) && (tablero[1][1] == jugador2) && (tablero[1][2]==jugador2)){
				ganar = true;
				System.out.println("¡"+nombre2+" has ganado!");
			}else {
				turno++;
			}
			if ((tablero[2][0] == jugador2) && (tablero[2][1] == jugador2) && (tablero[2][2]==jugador2)){
				ganar = true;
				System.out.println("¡"+nombre2+" has ganado!");
			}else {
				turno++;
			}
			if ((tablero[0][0] == jugador2) && (tablero[1][1] == jugador2) && (tablero[2][2]==jugador2)){
				ganar = true;
				System.out.println("¡"+nombre2+" has ganado!");
			}else {
				turno++;
			}
			if ((tablero[0][2] == jugador2) && (tablero[1][1] == jugador2) && (tablero[2][0]==jugador2)){
				ganar = true;
				System.out.println("¡"+nombre2+" has ganado!");
			}else {
				turno++;
			}
			if ((tablero[0][0] == jugador2) && (tablero[1][0] == jugador2) && (tablero[2][0]==jugador2)){
				ganar = true;
				System.out.println("¡"+nombre2+" has ganado!");
			}else {
				turno++;
			}
			if ((tablero[0][1] == jugador2) && (tablero[1][1] == jugador2) && (tablero[2][1]==jugador2)){
				ganar = true;
				System.out.println("¡"+nombre2+" has ganado!");
			}else {
				turno++;
			}
			if ((tablero[0][2] == jugador1) && (tablero[1][2] == jugador1) && (tablero[2][2]==jugador1)){
				ganar = true;
				System.out.println("¡"+nombre1+" has ganado!");
			}else {
				turno++;
			}
			
		}while((a>=0||a<=2||b>=0||b<=2)&&(tablero[a][b]!=' '));
		
	}while(turno<=9&&ganar!=true);
		
		
	}

}
