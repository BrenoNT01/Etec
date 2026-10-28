import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		final int TAM = 10;
		int a[], i;
		a = new int[TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Insira o número");
			a[i] = sc.nextInt();
		
		if (a[i]% i == 0) {
			System.out.println("PRIMO");
		} else {
			System.out.println("NAO PRIMO");
		}
		
		}
		
		

	}

}
