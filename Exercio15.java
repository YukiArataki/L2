import java.util.Scanner;

/*15. Elabore um algoritmo que leia 5 números do teclado e preencha um vetor deacordo com a seguinte regra: 
com exceção do 1º número, só é permitido armazenarum número se ele for maior que o anterior. 
Ex.: se o primeiro valor lido for 5, o próximovalor lido só poderá ser maior que 5. */

public class Exercio15 {

    public static void executar() {
        
        Scanner leitor = new Scanner(System.in);

        int[] vetor = new int[5];

        System.out.print("Digite o primeiro número: ");
        vetor[0] = leitor.nextInt();

        for (int i = 1; i < 5; i++) {
            System.out.print("Digite o próximo número: ");
            int numero = leitor.nextInt();

            if (numero > vetor[i - 1]) {
                vetor[i] = numero;
            } else {
                System.out.println("Número inválido. Deve ser maior que o anterior.");
                i--; 
            }
        }

        System.out.println("Vetor preenchido de acordo com a regra:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

}
