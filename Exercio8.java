import java.util.Arrays;
import java.util.Scanner;

/*8. Dados dois vetores A e B de 5 elementos cada, criar um vetor C que 
representa aconcatenação de A e B, ou seja, C contém os elementos de A seguidos dos elementosde B. */

public class Exercio8 {

    public static void executar() {
        
        Scanner leitor = new Scanner(System.in);

         int[] A = {1, 2, 3, 4, 5};
        int[] B = {6, 7, 8, 9, 10};
    
        int[] C = new int[A.length + B.length];
    
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i];
        }
    
        for (int i = 0; i < B.length; i++) {
            C[A.length + i] = B[i];
        }
    
        System.out.println("Vetor C (concatenação de A e B): " + Arrays.toString(C)); 
    }

}
