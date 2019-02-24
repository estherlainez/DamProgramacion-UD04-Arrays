package Ejercicios;

public class Ej01_bidimensionales_definirArray_mostrarTabla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num[][]=new int [3][6];
		
		num[0][0]=0;
		num[0][1]=30;
		num[0][2]=2;
		num[0][5]=5;
		num[1][0]=75;
		num[1][4]=0;
		num[2][2]=-2;
		num[2][3]=9;
		num[2][5]=11;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<6;j++) {
				System.out.print("["+i+"]["+j+"]  ");
				System.out.print(num[i][j]+" ");
				
			
			}
			System.out.println("\n");
		}
	}

}
