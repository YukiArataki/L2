import java.util.Arrays;
import java.util.Scanner;

/*9. Elabore um programa que leia os vetores A e B de 5 elementos e gere um vetor Cde acordo com as seguintes regras:
a. Os elementos das posições pares de C são os elementos das posições pares de A;
b. Os elementos das posições ímpares de C são os elementos das posições ímpares de B; */

public class Exercio9 {

    public static void executar() {
        
        Scanner leitor = new Scanner(System.in);

         int[] A = new int[5];
        int[] B = new int[5];

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < 5; i++) {
            A[i] = leitor.nextInt();
        }

        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < 5; i++) {
            B[i] = leitor.nextInt();
        }

        int[] C = new int[5];
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) { 
                C[i] = A[i];
            } else { 
                C[i] = B[i];
            }
        }

        System.out.println("Vetor C (de acordo com as regras especificadas): " + Arrays.toString(C));
    }

}
