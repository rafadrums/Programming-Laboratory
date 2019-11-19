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
public class Aluno extends Pessoa {

    /*
  protected String nome;
    protected String ultimo_nome;
    protected String cpf;
    protected int idade;
    protected String sexo ;
     */
    private String tipoAutomovel;

    //contrutor
    public Aluno(String tipoAutomovel, String nome, String ultimo_nome, String cpf, Endereco endereco, int idade, String sexo) {
        super(nome, ultimo_nome, cpf, endereco, idade, sexo);
        this.tipoAutomovel = tipoAutomovel;
    }
    public Aluno(String tipoAutomovel) {
        this.tipoAutomovel = tipoAutomovel;
    }

    public Aluno() {
        super("", "", "", null, 0, "");
        this.tipoAutomovel = "";
    }

    public void setTipoAutomovel(String tipoAutomovel) {
        this.tipoAutomovel = tipoAutomovel;
    }

    
    public void inserirDadosAluno(String name, String last_name, String cpF, int age, String genero, String automovelTipo) {
        super.dadosAluno(name, last_name, cpF, age, genero);
        aluno.add("Tipo de Automovel: " + (this.tipoAutomovel = automovelTipo));
    }
    
    public void listarAluno() {
        for (int i = 0; i < aluno.size(); i++) {
            System.out.println(aluno.get(i));
        }
        System.out.println("Endereço: ");
        System.out.println(this.getEndereco().toString());
    }
    
}
