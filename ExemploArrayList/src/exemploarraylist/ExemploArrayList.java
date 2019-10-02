/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylist;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class ExemploArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <String> trap = new ArrayList<String>();
  
        
        trap.add("Rafael");
        trap.add("Zack");
        trap.add("Tiago");
        trap.add("Bianca");
        
        //LISTAR
        for(int i=0; i < trap.size(); i++){
            System.out.println(trap.get(i));
        }
        
        //REMOVER
        trap.remove(1); //indice
        trap.remove("Tiago"); //elemento
        
        System.out.println("");
       
        //LISTAR
        for(int i=0; i < trap.size(); i++){
            System.out.println(trap.get(i));
        }
        
        //SUBSTUIR
        int idx = trap.indexOf("Bianca");
        trap.set(idx, "NOTHING");
        
        System.out.println("");
        
        //LISTAR
        for(int i=0; i < trap.size(); i++){
            System.out.println(trap.get(i));
        }
    }
    
}
