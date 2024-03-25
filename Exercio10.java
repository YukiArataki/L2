import java.util.Arrays;
import java.util.Scanner;

/*10. Crie um programa que leia um vetor A de 5 posições e, ao final da leitura, copieos elementos de A em B de forma 
invertida. Ou seja, o primeiro elemento de A é oúltimo elemento de B, o segundo elemento de A é o penúltimo elemento de B, 
e assimpor diante. */

public class Exercio10 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        int[] A = new int[5];

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < 5; i++) {
            A[i] = leitor.nextInt();
        }

        int[] B = new int[5];

        for (int i = 0; i < 5; i++) {
            B[i] = A[4 - i];
        }

        System.out.println("Vetor A: " + Arrays.toString(A));
        System.out.println("Vetor B (elementos de A invertidos): " + Arrays.toString(B));
    }

}
