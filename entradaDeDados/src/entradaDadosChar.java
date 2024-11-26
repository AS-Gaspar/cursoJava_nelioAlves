import java.util.Locale;
import java.util.Scanner;

/*
Output esperado:
Primeira letra da string digitada
 */

public class entradaDadosChar {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char x;
        x = sc.next().charAt(0);
        System.out.println("Você digitou: " + x);

        sc.close();
    }
}
