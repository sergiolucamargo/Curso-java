package ExercicioEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_02
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final double PI = 3.14159;
        double raio, area;

        System.out.println("Digite o valor do raio da circunferencia");
        raio = sc.nextDouble();

        area = PI * raio * raio;

        System.out.println("Valor da area da circunferencia:");
        System.out.printf("A=%.4f%n", area);

        sc.close();
    }
}
