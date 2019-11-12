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
public class Atendente extends Pessoa {

    /*
    protected String nome;
    protected String ultimo_nome;
    protected String cpf;
    protected int idade;
    protected String sexo ;
     */
    private double salario;
    private String turno;

    public Atendente(double salario, String turno, String nome, String ultimo_nome, String cpf, Endereco endereco, int idade, String sexo) {
        super(nome, ultimo_nome, cpf, endereco, idade, sexo);
        this.salario = salario;
        this.turno = turno;
    }

    public Atendente(double salario, String turno) {
        this.salario = salario;
        this.turno = turno;
    }

    public Atendente() {
        super("", "", "", null, 0, "");
        this.salario = 0.0;
        this.turno = "";
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
