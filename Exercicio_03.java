package ExercicioEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_03
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int valorA, valorB, valorC, valorD, resultado;

        System.out.println("DIGITE O VALOR DE 'A' :");
        valorA = sc.nextInt();

        System.out.println("DIGITE O VALOR DE 'B' :");
        valorB = sc.nextInt();

        System.out.println("DIGITE O VALOR DE 'C' :");
        valorC = sc.nextInt();

        System.out.println("DIGITE O VALOR DE 'D' :");
        valorD = sc.nextInt();

        resultado = (valorA * valorB)-(valorC * valorD);

        System.out.println("RESULTADO de : (A x B) - (C x D)");
        System.out.printf("%d", resultado);

        sc.close();

    }
}
