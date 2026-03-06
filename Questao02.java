
package questao02;

import java.util.Scanner;


public class Questao02 {


    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in); 
       
        int maior = 0, menor = 1000000;
        int[] numeros = new int[3]; 
        int x, y, z; 
      
        
        System.out.println("Informe 1 valor inteiro:  ");
        x = entrada.nextInt();
        
        System.out.println("Informe 1 valor inteiro:  ");
        y = entrada.nextInt();
        
        System.out.println("Informe 1 valor inteiro:  ");
        z = entrada.nextInt();
        
        
        
        numeros[0] = x;
        
        numeros[1] = y; 
        
        numeros[2] = z;
        
        
        
  
        for(int i = 0; i <3; i++){
            if(numeros[i] > maior ){
            maior = numeros[i];
            }
            
            if(numeros[i] < menor){
            menor = numeros[i]; 
            }
            
        }
        
        if( (y < x && z > x) || (z < x && y > x) ){
           System.out.println("O numero " + x + " esta dentro do intervalo de " + y + " e "+ z);

        }
        else{
            System.out.println("O numero" + x + " não dentro do intervalo de " + y + "e "+ z);
        }
        
        if(x % y == 0 && x % z == 0){
            System.out.println(x + " É divisivel por" + y +" e por "+ z); 
        }
        
        
        System.out.println("Maior numero: " + maior);
        System.out.println("Menor numero informado: " + menor);
    
            
    }
    
}
