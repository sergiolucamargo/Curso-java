import java.util.Locale;
import java.util.Scanner;

public class Exercicio_01
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A, B, soma;
        String nome = "SERGIO";

        System.out.println("Digite o primeiro numero");
        A = sc.nextInt();

        System.out.println("Digite o segundo numero");
        B = sc.nextInt();

        soma = A + B;

        System.out.println("SOMA = " + soma);
        System.out.println("Final do Programa");

        sc.close();

    }
}
