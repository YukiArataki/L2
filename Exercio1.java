import java.util.Scanner;

/*1.Construa um programa que leia em um vetor uma sequência de 5 números digitadospelo usuário, 
calcule a média e apresente na tela quais valores são menores, iguaisou superiores à média. */

public class Exercio1 {

    public static void executar() {
        
        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[5];
        int soma = 0;

        System.out.println("Digite 5 números:");
        for (int i = 0; i < 5; i++) {
            numeros[i] = leitor.nextInt();
            soma += numeros[i];
        }
        
        double media = soma / 5.0;
        System.out.println("A média é: " + media);

        System.out.println("Valores menores que a média:");
        for (int i = 0; i < 5; i++) {
            if (numeros[i] < media) {
                System.out.println(numeros[i]);
            }
        }

        System.out.println("Valores iguais à média:");
        for (int i = 0; i < 5; i++) {
            if (numeros[i] == media) {
                System.out.println(numeros[i]);
            }
        }

        System.out.println("Valores superiores à média:");
        for (int i = 0; i < 5; i++) {
            if (numeros[i] > media) {
                System.out.println(numeros[i]);
            }
        }
    }

}
