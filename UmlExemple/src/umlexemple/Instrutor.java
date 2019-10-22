/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umlexemple;

/**
 *
 * @author usuario
 */
public class Instrutor extends Pessoa {
    
      /*
    Atributos herdados
    protected String nome;
    protected int idade;
    protected String sexo ;
    */ 
    //Associacao entre instrutor/automovel
    private String categoriaAulas;
    protected Automovel automovel;
}
