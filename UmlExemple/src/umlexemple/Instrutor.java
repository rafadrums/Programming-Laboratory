/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umlexemple;

import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class Instrutor extends Pessoa {

    private String categoriaAulas;
    private double salario;

    //Associacao entre instrutor/automovel   
    private Automovel automovel;
    
    //-----------------------------
    //-----------------------------
    
    //atributo tipo Automovel
    protected Automovel vehicle;
    
    public Instrutor(Automovel vehicle) {
        this.vehicle = vehicle;
    }

    public Automovel getVehicle() {
        return vehicle;
    }

    public void setVehicle(Automovel vehicle) {
        this.vehicle = vehicle;
    }
    
   //Atributo tipo Aluno -----------------
   protected Aluno student;

    public Instrutor(Aluno student) {
        this.student = student;
    }

    public Aluno getStudent() {
        return student;
    }

    public void setStudent(Aluno student) {
        this.student = student;
    }
    
    //contrutor (classe) ------------------
    public Instrutor(String categoriaAulas, Automovel automovel, double salario, String nome, String ultimo_nome, String cpf, Endereco endereco, int idade, String sexo) {
        super(nome, ultimo_nome, cpf, endereco, idade, sexo);
        this.categoriaAulas = categoriaAulas;
        this.automovel = automovel;
        this.salario = salario;
    }
    
    public Instrutor(String categoriaAulas, Automovel automovel, double salario){
        this.categoriaAulas = categoriaAulas;
        this.automovel = automovel;
        this.salario = salario;
    }
    
    public Instrutor() {
        super("", "", "", null, 0, "");
        this.categoriaAulas = "";
        this.automovel = null;
        this.salario = 0.0;
    }
    
    

    public String getCategoriaAulas() {
        return categoriaAulas;
    }

    public void setCategoriaAulas(String categoriaAulas) {
        this.categoriaAulas = categoriaAulas;
    }

    public Automovel getAutomovel() {
        return automovel;
    }

    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public void inserirDadosInstrutor(String name, String last_name, String cpF, int age, String genero, String categoriaAula, double salary) {
        super.dadosInstrutor(name, last_name, cpF, age, genero);
        instrutor.add("Categoria: " + (this.categoriaAulas = categoriaAula));
        instrutor.add("Salário: R$" + String.valueOf(this.salario = salary));   
    }
    
    public void listarInstrutorCarro(){
        this.listarInstrutor();
        System.out.println("Endereço: ");
        System.out.println(this.getEndereco().toString());
        System.out.println("Responsável Pelo Veículo: ");
        System.out.println(this.getAutomovel().carro);
        System.out.println("Responsável Pelo Aluno: ");
        System.out.println(this.getStudent().aluno);
    }
    
    public void listarInstrutorMoto(){
        this.listarInstrutor();
        System.out.println("Endereço: ");
        System.out.println(this.getEndereco().toString());
        System.out.println("Responsável Pelo Veículo: ");
        System.out.println(this.getAutomovel().moto);
        System.out.println("Responsável Pelo Aluno: ");
        System.out.println(this.getStudent().aluno);
    }
    
     public void listarInstrutorOnibus(){
        this.listarInstrutor();
        System.out.println("Endereço: ");
        System.out.println(this.getEndereco().toString());
        System.out.println("Responsável Pelo Veículo: ");
        System.out.println(this.getAutomovel().onibus);
        System.out.println("Responsável Pelo Aluno: ");
        System.out.println(this.getStudent().aluno);
    }
    
}
