
import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final int TAM = 5;
        int a[], i, j, r;
        a = new int[TAM];

        for (i = 0; i < TAM; i++) {
            System.out.println("Insira um número:");
            a[i] = sc.nextInt();
        }

        for (i = 0; i < TAM; i++) {
            System.out.println("\nTabuada do " + a[i] + ":");

            for (j = 1; j <= 10; j++) {
                r = a[i] * j;
                System.out.println(a[i] + " x " + j + " = " + r);
            }
        }

        sc.close();
    }
}
