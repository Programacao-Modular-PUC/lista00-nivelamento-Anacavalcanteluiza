
package questao06;
        
import java.util.Scanner;

public class Questao06 {


    public static void main(String[] args) {
 

        Scanner entrada  = new Scanner(System.in); 
       
        char[] gabarito = new char[8];
        char[][] alunos = new char[10][8];

        int[] nota = new int[10];
        int aprovados = 0;

        for (int i = 0; i < 8; i++) {
            System.out.print("Informe o gabarito da " + (i + 1) + "° questão: ");
            gabarito[i] = entrada.next().charAt(0);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("\nAluno " + (i + 1));

            for (int j = 0; j < 8; j++) {
                System.out.print("Resposta da " + (j + 1) + "° questão: ");
                alunos[i][j] = entrada.next().charAt(0);
            }
        }

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 8; j++) {
                if (alunos[i][j] == gabarito[j]) {
                    nota[i]++;
                }
            }

            if (nota[i] >= 6) {
                aprovados++;
            }
        }

        System.out.println("\nRESULTADO:");

        for (int i = 0; i < 10; i++) {
            System.out.println("Aluno " + (i + 1) + " - Nota: " + nota[i]);
        }

        double porcentagem = (aprovados / 10.0) * 100;

        System.out.println("Porcentagem de aprovação: " + porcentagem + "%");

        entrada.close();
        
    }
    
}
