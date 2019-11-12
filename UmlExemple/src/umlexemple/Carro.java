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

    @Override
    public Instrutor getInstrutor() {
        return instrutor;
    }

    @Override
    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public int getAno() {
        return ano;
    }

    @Override
    public void setAno(int ano) {
        this.ano = ano;
    }

    //METODOS DA COLLECTION ----------------------
    //LISTAR
    public void addCarro(String car) {
        carro.add(car);
    }

    public void inserirDados(String marca, String modelo, String placa, int ano) {
        carro.add("Marca: " + (this.marca = marca));
        carro.add("Modelo: " + (this.modelo = modelo));
        carro.add("PLaca: " + (this.placa = placa));
        carro.add("Ano: " + String.valueOf(this.ano = ano));

    }

    public void listarCarro() {
        for (int i = 0; i < carro.size(); i++) {
            System.out.println(carro.get(i));
        }
    }

}
