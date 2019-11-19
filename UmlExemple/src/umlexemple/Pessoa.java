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
public class Pessoa {

    protected String nome;
    protected String ultimo_nome;
    protected String cpf;
    protected Endereco endereco;
    protected int idade;
    protected String sexo;
    
    ArrayList<String> aluno = new ArrayList<String>();
    ArrayList<String> instrutor = new ArrayList<String>();

    public Pessoa(String nome, String ultimo_nome, String cpf, Endereco endereco, int idade, String sexo) {
        this.nome = nome;
        this.ultimo_nome = ultimo_nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.idade = idade;
        this.sexo = sexo;
    }

    public Pessoa() {
        /*
       this.nome = "";
        this.ultimo_nome = "";
        this.cpf = "";
        this.endereco = null;
        this.idade = 0;
        this.sexo = "";
         */
        this("", "", "", null, 0, "");

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUltimo_nome() {
        return ultimo_nome;
    }

    public void setUltimo_nome(String ultimo_nome) {
        this.ultimo_nome = ultimo_nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
     public void dadosAluno(String name, String last_name, String cpF, int age, String genero){
        aluno.add("Nome: " + (this.nome = name));
        aluno.add("Ultimo nome: " + (this.ultimo_nome = last_name));
        aluno.add("CPF: " + (this.cpf = cpF));
        aluno.add("Idade: " + String.valueOf(this.idade = age));
     }
   
     
       public void dadosInstruor(String name, String last_name, String cpF, int age, String genero){
        instrutor.add("Nome: " + (this.nome = name));
        instrutor.add("Ultimo nome: " + (this.ultimo_nome = last_name));
        instrutor.add("CPF: " + (this.cpf = cpF));
        instrutor.add("Idade: " + String.valueOf(this.idade = age));
     }
     
     
   
}
