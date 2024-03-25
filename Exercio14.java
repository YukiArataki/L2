import java.util.Scanner;

/*14. Faça um programa que leia um vetor de 5 elementos e, após a leitura, posicioneo maior elemento 
na última posição do vetor. 
Nenhum número do vetor pode serapagado ou duplicado. Apresente o vetor atualizado na tela. */

public class Exercio14 {

    public static void executar() {
        
        Scanner leitor = new Scanner(System.in);

        int[] vetor = new int[5];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < 5; i++) {
            vetor[i] = leitor.nextInt();
        }

        int indiceMaior = 0;
        for (int i = 1; i < 5; i++) {
            if (vetor[i] > vetor[indiceMaior]) {
                indiceMaior = i;
            }
        }

        int temp = vetor[4];
        vetor[4] = vetor[indiceMaior];
        vetor[indiceMaior] = temp;

        System.out.println("Vetor atualizado com o maior elemento na última posição:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

}
