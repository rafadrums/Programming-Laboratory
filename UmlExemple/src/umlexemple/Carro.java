/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umlexemple;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Carro extends Automovel {

    /*
    Atributos herdados
    protected String placa;
    protected String marca;
    protected String modelo;
    protected int ano;
     */
    private int numPortas;

    //Contrutor (atributos da mãe e da classe filha)
    public Carro(int numPortas, String placa, String marca, String modelo, int ano) {
        super(placa, marca, modelo, ano);
        this.numPortas = numPortas;
    }

    public Carro(int numPortas) {
        this.numPortas = numPortas;
    }

    public Carro() {
        super("", "", "", 0);
        this.numPortas = 0;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
    
    //METODOS DA COLLECTION ----------------------
    //LISTAR
    public void addCarro(String car) {
        carro.add(car);
    }

    public void inserirDados(String marca, String modelo, String placa, int ano, int portas) {
        carro.add("Marca: " + (this.marca = marca));
        carro.add("Modelo: " + (this.modelo = modelo));
        carro.add("PLaca: " + (this.placa = placa));
        carro.add("Ano: " + String.valueOf(this.ano = ano));
        carro.add("N° portas: "+ String.valueOf(this.numPortas = portas));
    }

    public void listarCarro() {
        for (int i = 0; i < carro.size(); i++) {
            System.out.println(carro.get(i));
        }
    }
    
    public void removerCarro(String rmv){
        carro.remove(rmv);
    }
   
    
    

}
