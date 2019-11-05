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
public class Automovel implements Tipo {

    //Associacao entre instrutor/automovel
    protected Instrutor instrutor;

    //Atributos (todo)
    protected String placa;
    protected String marca;
    protected String modelo;
    protected int ano;
    
    @Override
    public int numPneus(){
        return 1;
    }
    
    @Override
    public int numCavalos(){
        return 1;
    }
    
    
}
