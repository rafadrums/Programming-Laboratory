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
    
    //Construtor
    public Automovel(String placa, String marca, String modelo, int ano) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public Automovel(){
        this("", "", "", 0);
    }
    
    //Interface
    @Override
    public int numPneus(){
        return 1;
    }
    
    @Override
    public int numCavalos(){
        return 1;
    }
    
    //Getters & Setters
    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
    
}
