package ExercicioEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_05
{
    public static void main(String[] args)
    {
        //Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo01, codigo02, quantidade01, quantidade02;
        double preco01, preco02, valor_peca01, valor_peca02, valor_total;

        System.out.println("DIGITE O CÓDIGO DA PEÇA 01 (quatro dígitos)");
        codigo01 = sc.nextInt();
        System.out.println("DIGITE A QUANTIDADE DE PEÇAS 01");
        quantidade01 = sc.nextInt();
        System.out.println("DIGITE O VALOR DE CADA PEÇAS 01");
        preco01 = sc.nextDouble();

        System.out.println("DIGITE O CÓDIGO DA PEÇA 02 (quatro dígitos)");
        codigo02 = sc.nextInt();
        System.out.println("DIGITE A QUANTIDADE DE PEÇAS 02");
        quantidade02 = sc.nextInt();
        System.out.println("DIGITE O VALOR DE CADA PEÇAS 02");
        preco02 = sc.nextDouble();

        valor_peca01 = quantidade01 * preco01;
        valor_peca02 = quantidade02 * preco02;

        valor_total = valor_peca01 + valor_peca02;

        System.out.printf("-----------------------------------------------------------------------------%n");
        System.out.printf("PEÇA COD: %d - VALOR UNITARIO: %.2f - QUANTIDADE: %d - VALOR: %.2f %n", codigo01, preco01, quantidade01, valor_peca01);
        System.out.printf("PEÇA COD: %d - VALOR UNITARIO: %.2f - QUANTIDADE: %d - VALOR: %.2f %n", codigo02, preco02, quantidade02, valor_peca02);
        System.out.printf("-----------------------------------------------------------------------------%n");

        System.out.printf("*****************************************%n");
        System.out.printf("VALOR TOTAL DA COMPRA: %.2f %n", valor_total);
        System.out.printf("*****************************************%n");

        sc.close();
    }
}
