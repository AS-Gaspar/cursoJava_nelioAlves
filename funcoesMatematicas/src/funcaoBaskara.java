import java.util.Scanner;

public class funcaoBaskara {
    public static void main(String[] args) {
        //algoritmo para fórmula de báskara
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        double a = scanner.nextDouble();
        System.out.println("Digite o valor de b: ");
        double b = scanner.nextDouble();
        System.out.println("Digite o valor de c: ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2.0) - 4 * a * c;

        double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

        System.out.println("Raiz 1: " + x1);
        System.out.println("Raiz 2: " + x2);

        scanner.close();

    }
}
