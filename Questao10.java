
package questao10;

import java.util.Scanner;


public class Questao10 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float [][] valor = new float[12][4];
        float [] mensal = new float[12];

        String[] mes = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho", "Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};

        float total = 0;

        for(int i =0;i<12;i++){
            System.out.println("\nMês: " + mes[i]);

            for(int j =0;j<4;j++){
                System.out.print("Valor da semana "+(j+1)+": ");
                valor[i][j] = sc.nextFloat();

                mensal[i] += valor[i][j];
                total += valor[i][j];
            }
        }

        System.out.println("\nTotal por mês:");
        for(int i =0;i<12;i++){
            System.out.println(mes[i] + ": " + mensal[i]);
        }

        System.out.println("\nTotal por semana no ano:");
        for(int j =0;j<4;j++){
            float somaSemana = 0;

            for(int i =0;i<12;i++){
                somaSemana += valor[i][j];
            }

            System.out.println("Semana " + (j+1) + ": " + somaSemana);
        }

        System.out.println("\nTotal vendido no ano: " + total);

    }
    
}
