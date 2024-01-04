package ExercicioEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;
public class Exercicio_04
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numFuncionario;
        double horasTrabalho, valorHoras, salario;

        System.out.println("DIGITE O NUMERO DO FUNCIONARIO");
        numFuncionario = sc.nextInt();
        System.out.println("DIGITE O NUMERO DE HORAS TRABALHADAS");
        horasTrabalho = sc.nextInt();
        System.out.println("DIGITE O VALOR QUE O FUNCIONARI RECEBE POR HORA");
        valorHoras = sc.nextInt();

        salario = (horasTrabalho * valorHoras);

        System.out.println("NUMERO DO FUNCIONARIO");
        System.out.printf("%d %n", numFuncionario);
        System.out.printf("SALARIO : %f", salario);

        sc.close();

    }
}
