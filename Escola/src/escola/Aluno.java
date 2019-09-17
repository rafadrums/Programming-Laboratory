/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

import java.time.LocalDate;

/**
 *
 * @author usuario
 */
public class Aluno {
    
    private String nome;
    private String cpf;
    private int matricula;
    private LocalDate dataNascimento;
    private int idade;
    private double notas[];
    
    
    //construtor
    
    public Aluno(){
        this.nome = "";
        this.cpf = "00.000.000-00";
        this.matricula = 0;
        this.idade = 0;
        this.notas = new double[4];
    }
    
    public void alteraNome (String nome){
        this.nome = nome;
    }
    
    public double media(){
        double soma = 0.0;
        
        for(double nota : this.notas){
            soma += nota;
        }
    double media = soma / this.notas.length;
    return media;
}
}


