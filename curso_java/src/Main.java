public class Main {
    public static void main(String[] args) {
        //variavel da primeira explicação
        double x = 10.35784;
        //variaveis da segunda explicação
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        //outputs da primeira explicação
        System.out.printf("%.2f%n", x);
        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f metros%n", x);
        //outputs da segunda explicação
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }
}