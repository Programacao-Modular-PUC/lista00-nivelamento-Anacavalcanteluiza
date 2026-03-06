
package questao08;

import java.util.Scanner;


public class Questao08 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("\nQuantidade de objetos: ");
        int n = entrada.nextInt();
        entrada.nextLine(); // limpa o buffer

        String[] obj = new String[n];
        Float[] valor = new Float[n];
        int[] qtd = new int[n];

        float total = 0;
        int m = 0;
        int t = 0;

        for (int i = 0; i < n; i++) {

            System.out.print("\nNome do objeto " + (i + 1) + ": ");
            obj[i] = entrada.nextLine();

            System.out.print("Valor de " + obj[i] + ": ");
            valor[i] = entrada.nextFloat();

            System.out.print("Quantidade de " + obj[i] + " vendidos: ");
            qtd[i] = entrada.nextInt();

            entrada.nextLine(); // limpar buffer

            total += (qtd[i] * valor[i]);

            if (qtd[i] > m) {
                m = qtd[i];
                t = i;
            }
        }

        System.out.print("===================================");
        System.out.print("\nObjeto:\tQuantidade:\tValor unitario:\tValor total:");

        for (int i = 0; i < n; i++) {
            System.out.print("\n" + obj[i] + "\t" + qtd[i] + "\t" + valor[i] + "\t" + (qtd[i] * valor[i]));
        }

        System.out.print("\n===================================\n");

        System.out.println("\nValor total das vendas: " + total);
        System.out.println("Objeto mais vendido: " + obj[t]);
        System.out.println("Posição: " + (t + 1));

        System.out.print("\n===================================\n");

        float comissao = total * 0.05f;
        float salario = 545 + comissao;

        System.out.println("Comissão: " + comissao);
        System.out.println("Salário final: " + salario);

        System.out.print("\n===================================\n");

    }
    
}
