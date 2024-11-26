import java.util.Locale;
import java.util.Scanner;

/*
Output esperado:
Número Double com 4 casas decimais
 */

public class entradaDadosDouble {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x;
        x = sc.nextDouble();
        System.out.printf("Você digitou: %.4f%n", x);

        sc.close();
    }
}
