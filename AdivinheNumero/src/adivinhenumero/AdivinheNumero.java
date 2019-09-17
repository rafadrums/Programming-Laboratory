/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinhenumero;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class AdivinheNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("BEM VINDO | ESCOLHA");
            System.out.println("1 - Jogar adivinhe o numero");
            System.out.println("2 - Imprimir de 0 a 100, só impares");
            System.out.println("3 - Imprimir de 0 a 100, só os pares");
            System.out.println("4 - SAIR");
            System.out.print("Esolha a opção -> ");
            opcao = tec.nextInt();
            System.out.println("");

            switch (opcao) {
                case 1:
                    Random rand = new Random();
                    int value = rand.nextInt(50);
                    System.out.print("Adivinhe qual valor foi gerado de 1 a 50 -> ");
                    int valor = tec.nextInt();
                    if(value == valor){
                        System.out.println("Acertou mizeravi");
                    }else{
                        System.out.println("Errrouuuuu! O valor era: " + value);
                    }
                    System.out.println("");
                    break;
                case 2:
                    for(int i = 0; i <= 100; i++ ){
                        if(i%2 == 0){
                            continue;                           
                        }
                        System.out.print(i+", ");     
                    }
                    System.out.println("");                    
                    break;
                case 3:
                    for(int i = 0; i <= 100; i++ ){
                        if(i%2 != 0){
                            continue;                           
                        }
                        System.out.print(i+", ");     
                    }
                    System.out.println(""); 
                    break;
            }

        } while (opcao != 4);
        System.out.println("");
        System.out.println("GOOD BYE!");

    }

}
