import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int TAM =10;
		int a[], b[], c[], i;
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o"+(i+1)+"valor de A");
			a[i] = sc.nextInt();
		}
	

		for (i=0; i<TAM; i++) {
			System.out.println("Digite o"+(i+1)+"valor de B");
			b[i] = sc.nextInt();
		}
		
		for (i=0; i<TAM; i++) {
			c[i] = a[i] + b[i];
			System.out.println("O resultado da é:" +c[i] );
				
		}
			
	}

}
