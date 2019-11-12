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
public class Moto extends Automovel {
     /*
    Atributos herdados
    protected String placa;
    protected String marca;
    protected String modelo;
    protected int ano;
    */
    
    private double peso;

    public Moto(double peso, String placa, String marca, String modelo, int ano) {
        super(placa, marca, modelo, ano);
        this.peso = peso;
    }

    public Moto(double peso) {
        this.peso = peso;
    }

    public Moto(){
       super("", "", "", 0); 
       this.peso = 0.0;
    }
    
}
