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
   protected String nome;
    protected String ultimo_nome;
    protected String cpf;
    protected int idade;
    protected String sexo ;
    */ 
    //Associacao entre instrutor/automovel
    
    private String categoriaAulas;
    private Automovel automovel;
    private double salario;
    
    //contrutor

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
    
    
    
}
