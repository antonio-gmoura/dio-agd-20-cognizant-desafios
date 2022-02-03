import java.io.IOException;
import java.util.Scanner;

public class Desafio1SomaDeImparesConsecutivos {
    public static void main(String[] args)  throws IOException {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int soma;
        int menor;
        int maior;

        int N = sc.nextInt();

        for (int x = 1; x <= N; x++) {
            a = sc.nextInt();
            b = sc.nextInt();
            soma = 0;
            menor = (a < b) ? a : b;
            maior = (a > b) ? a : b;
            for (int i = menor + 1; i < maior; i++) {
                if (i % 2 != 0) {
                    soma += i;
                }
            }
            System.out.println(soma);
        }
    }
}
