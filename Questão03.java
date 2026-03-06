
package questão03;

import java.util.Scanner;


public class Questão03 {

   
    public static void main(String[] args) {
        
        Scanner entrada  = new Scanner(System.in); 

        int qntAlunosPm, qntAlunosModelagem, simuntaneas = 0; 
        
        System.out.println("Informe a quantidade de alunos matriculados em Programação Modular");
        qntAlunosPm = entrada.nextInt();
        
        System.out.println("Informe a quantidade de alunos matriculados em Modulagem");
        qntAlunosModelagem = entrada.nextInt();
         
        int[] matriculasPm = new int[qntAlunosPm]; 
        
        int[] matriculasM = new int[qntAlunosModelagem]; 
        
        for(int i = 0; i < qntAlunosPm; i++){
            System.out.println("Informe a matricula do " + (i+1 )+ "° aluno matriculado em Programação Modular: ");
            matriculasPm[i] = entrada.nextInt();
        }
        
        
        for(int j = 0; j < qntAlunosModelagem; j++){
            System.out.println("Informe a matricula do " + (j+1) + "° aluno matriculado em Modelagem: ");
            matriculasM[j] = entrada.nextInt();
        }

        
        for(int i = 0; i < qntAlunosPm; i++){
            for(int j = 0; j < qntAlunosModelagem; j++){
                if (matriculasM[j] == matriculasPm[i]){
                    simuntaneas++; 
                }
            }
        }
        
        System.out.println("Numero de matriculas nas duas materias: " + simuntaneas); 
        
    }
    
}
