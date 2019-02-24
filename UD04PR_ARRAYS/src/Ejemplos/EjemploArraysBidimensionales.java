package Ejemplos;

public class EjemploArraysBidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1)Ejemplo de array bidimensional
		int n01[][];
		int [][]n02;
		
//2)Ejemplo de reserva de memoria de arrays
		 n01=new int[5][2];
		 
//Las dos operaciones anteriores a la vez
		 int n03[][]=new int [3][6];
		 String n04[][]=new String [3][6];
//3)Ejemplo de dar valores a un array bidimensional
		n03[0][0]=1;
		n03[0][1]=2;
		n03[0][2]=3;
		n03[0][3]=4;
		n03[0][4]=5;
		n03[0][5]=6;
		n03[1][0]=7;
		n03[1][1]=8;
		n03[1][2]=9;
		n03[1][3]=10;
		n03[1][4]=1;
		n03[1][5]=2;
		n03[2][0]=3;
		n03[2][1]=4;
		n03[2][2]=5;
		n03[2][3]=6;
		n03[2][4]=7;
		n03[2][5]=8;
		
		
//esto no se hace asi, se utilizan indices
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<6;j++) {
				System.out.print("["+i+"]["+j+"]  ");
			}
			System.out.println("\n");
			
		}
		
	}

}
