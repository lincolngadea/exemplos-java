import java.util.Scanner;

public class ProgramMatriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informar o número de linhas:");
		int line = sc.nextInt();

		System.out.print("Informar o número de colunas:");
		int col = sc.nextInt();

		int[][] mat = new int[line][col];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print("Linha " + (i + 1) + " Coluna " + (j + 1) + ":");
				mat[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

		System.out.print("Buscar valor:");
		int valor = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == valor) {
					System.out.println();
					System.out.println("Position: "+i+","+j);
					if(j-1 >= 0) {
						System.out.println("Left: "+mat[i][j-1]);
					}
					if(j+1 < mat[i].length ) {
						System.out.println("Right: "+mat[i][j+1] );
					}
					if(i-1>= 0) {
						System.out.println("Up: "+mat[i-1][j]);
					}
					if(i+1 < mat.length) {
						System.out.println("Down: "+mat[i+1][j]);
					}
					System.out.println();
				}
			}
		}

		sc.close();
	}

}
