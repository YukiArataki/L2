import java.util.Scanner;

/*3.Faça um programa que leia em um vetor uma sequência finita de números digitadospelo usuário. 
Crie um segundo vetor que armazene o dobro de cada número doprimeiro vetor e depois apresente os valores deste vetor. */

public class Exercio3 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = leitor.nextInt();

        int[] primeiroVetor = new int[tamanho];
        int[] segundoVetor = new int[tamanho];
        System.out.println("Digite os números do primeiro vetor:");
        for (int i = 0; i < tamanho; i++) {
            primeiroVetor[i] = leitor.nextInt();
        }

        for (int i = 0; i < tamanho; i++) {
            segundoVetor[i] = primeiroVetor[i] * 2;
        }

        System.out.println("Valores do segundo vetor (dobro do primeiro vetor):");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(segundoVetor[i]);
        }
        
    }

}
