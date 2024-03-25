import java.util.Scanner;

/*12. Elabore um programa que leia um vetor de 12 elementos apresente na tela oproduto dos elementos pares positivos (desconsiderar o zero). 
Exemplo: {0, 5, 8, 1, -6, 4, -7, 9, 10, -14, 3, 12} = 8 * 4 * 10 * 12 = 3840 */

public class Exercio12 {

    public static void executar() {
        
        Scanner leitor = new Scanner(System.in);

        int[] vetor = new int[12];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < 12; i++) {
            vetor[i] = leitor.nextInt();
        }

        int produtoParesPositivos = 1;

        for (int i = 0; i < 12; i++) {
            if (vetor[i] % 2 == 0 && vetor[i] > 0) {
                produtoParesPositivos *= vetor[i];
            }
        }

        if (produtoParesPositivos != 1) {
            System.out.println("O produto dos elementos pares positivos é: " + produtoParesPositivos);
        } else {
            System.out.println("Não há elementos pares positivos no vetor.");
        }
    }

}
