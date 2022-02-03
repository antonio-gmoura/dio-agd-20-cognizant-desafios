import java.io.IOException;
import java.util.Scanner;

public class Desafio2SomaDeImparesConsecutivosIII {
    public static void main(String[] args)  throws IOException {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int soma;

        int N = sc.nextInt();

        for (int x = 1; x <= N; x++) {
            a = sc.nextInt();
            b = sc.nextInt();

            if (a % 2 == 0) {
                a ++;
            }

            soma = 0;
            for (int i = 1; i <= b; i++) {
                soma += a;
                a += 2;
            }
            System.out.println(soma);
        }
    }
}
