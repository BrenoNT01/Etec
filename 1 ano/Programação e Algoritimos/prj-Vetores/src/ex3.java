import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		final int TAM=10;
		int a[], b[], i;
		a = new int[TAM];
		b = new int[TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o"+(i+1)+"valor de A");
			a[i] = sc.nextInt();
		}
	

		for (i=9; i>-1; i--) {
			b[i] = a[i];
			System.out.println( "A posição a "+(i)+"do valor de b"  +b[i]);
		}
		
	}

}
