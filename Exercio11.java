import java.util.Scanner;

/*11. Elabore um algoritmo que calcule o produto escalar entre dois vetores de inteirosde tamanho igual a 5. 
Exemplo: {0, 2, 4, 6, 8}, {1, 3, 5, 7, 9} = 0*1 + 2*3 + 4*5 + 6*7 +8*9 = 140 */

public class Exercio11 {

    public static void executar() {
        
        Scanner leitor = new Scanner(System.in);

        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];

        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < 5; i++) {
            vetor1[i] = leitor.nextInt();
        }

        System.out.println("Digite os elementos do segundo vetor:");
        for (int i = 0; i < 5; i++) {
            vetor2[i] = leitor.nextInt();
        }

        int produtoEscalar = 0;
        for (int i = 0; i < 5; i++) {
            produtoEscalar += vetor1[i] * vetor2[i];
        }

        System.out.println("O produto escalar entre os dois vetores é: " + produtoEscalar);
    }

}
