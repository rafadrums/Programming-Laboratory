package umlexemple;

import java.util.Vector;

public class UmlExemple {

    public static void main(String[] args) {
        // TODO code application logic here

        Vector <Pessoa> vetAluno = new Vector();
     
        //Carros
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        
        
        carro1.inserirDados("VW","Gol","IGM-1544",2019, 4);
        carro2.inserirDados("Chevrolet", "Onix", "IXC-5462", 2019, 4);
        carro1.listarCarro();
        System.out.println("");
       // carro2.listarCarro();

       //Instrutor
       Instrutor teach1 = new Instrutor();
       Instrutor teach2 = new Instrutor();
       
       //Aluno
       Aluno aluno1 = new Aluno();
       Endereco endAluno1 = new Endereco("Bento Dias", "Camaqua", "RS", "000000-000");
       aluno1.inserirDados("Rafael ", "Bueno", "000.000.000-00", 20, "M", "Carro");
       aluno1.setEndereco(endAluno1);

       
    }
}
