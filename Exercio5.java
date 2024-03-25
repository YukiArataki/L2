import java.util.Scanner;

/*5.Elabore um programa que leia 5 números do teclado e os armazene em um vetor.
Em seguida, leia um número n qualquer e apresente na tela a quantidade de vezesque o número n aparece no vetor. */

public class Exercio5 {

    public static void executar() {
        
        Scanner leitor = new Scanner(System.in);

        int[] vetor = new int[5];

        System.out.println("Digite 5 números:");
        for (int i = 0; i < 5; i++) {
            vetor[i] = leitor.nextInt();
        }

        System.out.print("Digite um número n: ");
        int n = leitor.nextInt();

        int contador = 0;
        for (int i = 0; i < 5; i++) {
            if (vetor[i] == n) {
                contador++;
            }
        }

        System.out.println("O número " + n + " aparece " + contador + " vezes no vetor.");

    }

}
