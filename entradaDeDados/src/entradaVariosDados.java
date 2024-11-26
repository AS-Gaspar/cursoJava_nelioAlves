import java.util.Locale;
import java.util.Scanner;

/*
Output esperado:
String
Número Int
Número Double com 2 casas decimais
 */

public class entradaVariosDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(y);
        System.out.printf("%.2f%n", z);
    }
}
