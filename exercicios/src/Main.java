import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a medida da largura do terreno: ");
        double largura = sc.nextDouble();
        System.out.println("Digite a medida do comprimento do terreno: ");
        double comprimento = sc.nextDouble();;
        System.out.println("Digite o valor do metro quadrado: ");

        double valorMetro = sc.nextDouble();;

        double areaTotal = largura * comprimento;
        double valorTerreno = areaTotal * valorMetro;
        System.out.printf("A área total do terreno é: %.2f%n", areaTotal);
        System.out.printf("O valor total do terreno é: %.2f%n", valorTerreno);

        sc.close();
    }
}