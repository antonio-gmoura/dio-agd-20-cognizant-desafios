import java.io.IOException;
import java.util.Scanner;

public class Main {

    static Scanner leitor;
    public static void main(String[] args) throws IOException {
        leitor = new Scanner(System.in);
        System.out.println(obterNota());
        System.out.println(novoCalculo());
    }

    public static double obterNota() {
        double nota = leitor.nextDouble();
        if (nota >= 0.0 && nota <= 10.0) {
            return nota;
        } else {
            System.out.println("nota invalida");
            return obterNota();
        }
    }

    public static int novoCalculo() {
        System.out.println("novo calculo (1-sim 2-nao)");
        int resposta = leitor.nextInt();
        if (resposta == 1 || resposta == 2) {
            return resposta;
        } else {
            return novoCalculo();
        }
    }
}
