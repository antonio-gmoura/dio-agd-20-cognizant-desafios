import java.io.IOException;
import java.util.Scanner;

public class Desafio3ValidacaoDeNotas {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double nota = 0.0;
        double nota1 = 0.0;
        double nota2 = 0.0;
        double media = 0.0;
        int flag = 1;
        int entradaValida;

        while (flag == 1) {
            for (int n = 1; n <= 2; n++) {
                entradaValida = 0;
                while (entradaValida == 0) {
                    nota = leitor.nextDouble();
                    if (nota >= 0.0 && nota <= 10.0) {
                        entradaValida = 1;
                    } else {
                        System.out.println("nota invalida");
                    }
                }
                if (n == 1) {
                    nota1 = nota;
                } else {
                    nota2 = nota;
                }
            }
            media = (nota1 + nota2) / 2;
            System.out.printf("media = %.2f%n", media);
            entradaValida = 0;
            while (entradaValida == 0) {
                System.out.println("novo calculo (1-sim 2-nao)");
                flag = leitor.nextInt();
                if (flag == 1 || flag == 2) {
                    entradaValida = 1;
                }
            }
        }
    }
}
