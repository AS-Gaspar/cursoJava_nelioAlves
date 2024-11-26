import java.util.Scanner;

/*
Output esperado:
String
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();
        System.out.println("Você digitou: " + x);

        sc.close();
    }
}