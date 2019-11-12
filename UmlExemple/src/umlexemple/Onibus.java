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
public class Onibus extends Automovel {
    
    /*
    Atributos herdados
    protected String placa;
    protected String marca;
    protected String modelo;
    protected int ano;
    */
    
    private int numPAssageiros;
    private int numEmbratur;
    
    //Construtor

    public Onibus(int numPAssageiros, int numEmbratur, String placa, String marca, String modelo, int ano) {
        super(placa, marca, modelo, ano);
        this.numPAssageiros = numPAssageiros;
        this.numEmbratur = numEmbratur;
    }

    public Onibus(int numPAssageiros, int numEmbratur) {
        this.numPAssageiros = numPAssageiros;
        this.numEmbratur = numEmbratur;
    }

    public Onibus(){
       super("", "", "", 0); 
       this.numPAssageiros = 0;
       this.numEmbratur = 0;
    }
 

    public int getNumPAssageiros() {
        return numPAssageiros;
    }

    public void setNumPAssageiros(int numPAssageiros) {
        this.numPAssageiros = numPAssageiros;
    }

    public int getNumEmbratur() {
        return numEmbratur;
    }

    public void setNumEmbratur(int numEmbratur) {
        this.numEmbratur = numEmbratur;
    }
    
}
