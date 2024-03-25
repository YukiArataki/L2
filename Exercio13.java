import java.util.Scanner;

/*13. Elabore um algoritmo que receba um número n e retorne um vetor com os nprimeiros termos da sequência de Fibonacci. 
Exemplo: n = 8, vetor = {1, 1, 2, 3, 5, 8,13, 21} */

public class Exercio13 {

    public static void executar() {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite o número de termos da sequência de Fibonacci que deseja gerar: ");
        int n = leitor.nextInt();

        int[] fibonacci = gerarFibonacci(n);

        System.out.println("Os " + n + " primeiros termos da sequência de Fibonacci são:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }

    public static int[] gerarFibonacci(int n) {
        int[] fibonacci = new int[n];

        if (n >= 1) {
            fibonacci[0] = 1;
        }
        if (n >= 2) {
            fibonacci[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        return fibonacci;
    }
}

