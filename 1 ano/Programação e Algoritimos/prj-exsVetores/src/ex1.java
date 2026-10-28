import java.util.Scanner; 

public class ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int TAM =20;
		int a[], b[] , i;
		a = new int [TAM];
		b = new int [TAM];
		
		for (i = 0; i < 20; i++) {
			System.out.println("Digite o valor");
			a[i] = sc.nextInt();
		}
		
		System.out.println("Números pares:");
		for ( i = 0; i < 20; i++) {
			if (a[i] % 2 == 0) {
				b[i] = a[i];
				System.out.println(b[i]);
			}
		}
		System.out.println("Números ímpares:");
		for (i= 0; i <20; i++) {
			if (a[i] % 2 == 1) {
				System.out.println(a[i]);
			}
		}
		sc.close();
	}

}
