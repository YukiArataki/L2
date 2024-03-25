import java.util.Scanner;

/*6. Elabore um programa que leia um vetor com 5 notas de um aluno e um outro vetorcom 5 pesos e calcule a média ponderada do aluno.
Média ponderada = nota1 * peso1 + nota2 * peso2 + nota3 * peso3 peso1 + peso2 + peso3
Ex.: notas: 7.5, 9.2 pesos: 6, 4. Média ponderada: (7.5 * 6 + 9.2 * 4) / (6 + 4) */

public class Exercio6 {

    public static void executar() {
        
        Scanner leitor = new Scanner(System.in);

        double[] notas = new double[5];
        double[] pesos = new double[5];

        System.out.println("Digite as 5 notas do aluno:");
        for (int i = 0; i < 5; i++) {
            notas[i] = leitor.nextDouble();
        }

        System.out.println("Digite os 5 pesos correspondentes às notas:");
        for (int i = 0; i < 5; i++) {
            pesos[i] = leitor.nextDouble();
        }

        double somaNotasPesadas = 0;
        double somaPesos = 0;
        for (int i = 0; i < 5; i++) {
            somaNotasPesadas += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }

        double mediaPonderada;
        if (somaPesos != 0) {
            mediaPonderada = somaNotasPesadas / somaPesos;
            System.out.println("A média ponderada do aluno é: " + mediaPonderada);
        } else {
            System.out.println("Não é possível calcular a média ponderada pois a soma dos pesos é zero.");
        }

        

       
    }

}
