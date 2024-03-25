import java.util.Scanner;

/*2. Escreva um algoritmo que leia em um vetor uma sequência finita de númerosdigitados pelo 
usuário e, logo após, mostre o número de cada posição do vetor e se ele é positivo, negativo ou zero. */

public class Exercio2 {

    public static void executar() {
        
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = leitor.nextInt();
        
        int[] vetor = new int[tamanho];
        
        System.out.println("Digite os números:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = leitor.nextInt();
        }
        

        System.out.println("Número\t\tPositivo/Negativo/Zero");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + "\t\t");
            
            if (vetor[i] > 0) {
                System.out.println("Positivo");
            } else if (vetor[i] < 0) {
                System.out.println("Negativo");
            } else {
                System.out.println("Zero");
            }
        }
    }

}
