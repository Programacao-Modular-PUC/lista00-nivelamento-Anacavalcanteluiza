
package questao05;

import java.util.Scanner;

public class Questao05 {

    
    public static void main(String[] args) {
         Scanner entrada  = new Scanner(System.in); 
       
        int pessoas, idade, maior = 1, menor = 1000, qnts=0;
        
        char sexo, olhos, cabelo; 
        
        System.out.println("Informe quantos habitantes tem na cidade:");
        pessoas = entrada.nextInt();
        

        
        for(int i = 0; i < pessoas; i++){
            
            System.out.println("Informe a idade: ");
            idade = entrada.nextInt(); 
            if(idade > maior){
                maior = idade;
            }
            if(idade < menor){
                menor = idade; 
            }
            
            System.out.println("Informe o sexo, [F - Feminino] [M - Masculino] ");
            sexo = entrada.next().charAt(0);
            
            System.out.println("Informe a cor dos cabelos [L - Louros] [C- Castanho] [P -Pretos]");
            cabelo = entrada.next().charAt(0);
            
            System.out.println("Informe a cor dos olhos [A - Azul] [V - Verdes] [C- Castanho] ");
            olhos = entrada.next().charAt(0);
            
            if( (sexo == 'F' || sexo == 'f') && (idade >= 18 && idade <= 35) && (olhos == 'v' ||olhos == 'V' ) &&  (olhos == 'l' ||olhos == 'L' ) ){
                qnts ++; 
            }
        }
        
        System.out.println("Maior idade: " + maior);
        System.out.println("Menor idade: " + menor);
        System.out.println("Mulheres com a idade entre 18 e 35 anos que tenham olhos verdes e cabelos louros" + qnts); 
    }
    
}
