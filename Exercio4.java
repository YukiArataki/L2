import java.util.Scanner;

/*4. Faça um programa que leia em um vetor uma sequência finita de números digitadospelo usuário. 
Crie um segundo vetor que armazene o dobro de cada número doprimeiro vetor e depois apresente os valores deste vetor. */

public class Exercio4 {

    public static void executar() {
        
        Scanner leitor = new Scanner(System.in);

        int[] vetor = new int[5];

        System.out.println("Digite 5 números:");
        for (int i = 0; i < 5; i++) {
            vetor[i] = leitor.nextInt();
        }

        System.out.print("Digite um número n: ");
        int n = leitor.nextInt();

        System.out.println("Índices dos elementos inferiores a " + n + ":");
        for (int i = 0; i < 5; i++) {

            if (vetor[i] < n) {
                System.out.println(i);
            }
        }
    }

}
