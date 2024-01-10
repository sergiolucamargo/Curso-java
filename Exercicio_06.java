package ExercicioEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_06
{
    public static final double PI = 3.14159;
    public static void main (String[] args)
    {
        //Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

        System.out.println("DIGITE OS VALOES DOS LADOS DOS POLIGONOS (A, B, e C) ");

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        System.out.println("CALCULANDO ........ ");

        triangulo = A * C / 2.0;
        circulo = PI * C * C;
        trapezio = (A + B) / 2.0 * C;
        quadrado = B * B;
        retangulo = A * B;

        System.out.println("VEJA OS RESULTADOS DAS AREAS DE CADA UM ");

        System.out.printf("-----------------------------------------------------------------------------%n");
        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);
        System.out.printf("-----------------------------------------------------------------------------%n");

        sc.close();
    }
}
