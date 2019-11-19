/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umlexemple;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Automovel implements Tipo {

    //Atributos (todo)
    protected String placa;
    protected String marca;
    protected String modelo;
    protected int ano;

//Associacao entre instrutor/automovel
    protected Instrutor instrutor;

    ArrayList<String> carro = new ArrayList<String>();
    ArrayList<String> moto = new ArrayList<String>();
    ArrayList<String> onibus = new ArrayList<String>();

    //Construtor
    public Automovel(String placa, String marca, String modelo, int ano) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Automovel() {
        this("", "", "", 0);
    }

    //Interface
    @Override
    public int numPneus() {
        return 1;
    }

    @Override
    public int numCavalos() {
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

    public void addMoto(String bike) {
        moto.add(bike);
    }

    public void addOnibus(String bus) {
        onibus.add(bus);
    }

    //METODOS DA COLLECTION ----------------------
    public void dadosCarro(String marca, String modelo, String placa, int ano) {
        carro.add("Marca: " + (this.marca = marca));
        carro.add("Modelo: " + (this.modelo = modelo));
        carro.add("PLaca: " + (this.placa = placa));
        carro.add("Ano: " + String.valueOf(this.ano = ano));
    }

    public void dadosMoto(String marca, String modelo, String placa, int ano) {
        moto.add("Marca: " + (this.marca = marca));
        moto.add("Modelo: " + (this.modelo = modelo));
        moto.add("PLaca: " + (this.placa = placa));
        moto.add("Ano: " + String.valueOf(this.ano = ano));

    }
    
     public void dadosBus(String marca, String modelo, String placa, int ano) {
        onibus.add("Marca: " + (this.marca = marca));
        onibus.add("Modelo: " + (this.modelo = modelo));
        onibus.add("PLaca: " + (this.placa = placa));
        onibus.add("Ano: " + String.valueOf(this.ano = ano));

    }

    //---------------------- 
    //LISTAR
    public void listarMoto() {
        for (int i = 0; i < moto.size(); i++) {
            System.out.println(moto.get(i));
        }
    }

    //LISTAR
    public void listarOnibus() {
        for (int i = 0; i < onibus.size(); i++) {
            System.out.println(onibus.get(i));
        }
    }

}
