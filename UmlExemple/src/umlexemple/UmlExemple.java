package umlexemple;

import java.util.Vector;

public class UmlExemple {

    public static void main(String[] args) {
        // TODO code application logic here
      
        //CONJUNTO1 -------------------------------
        //.
        //Veículo
        //.
        Carro carro1 = new Carro();
        
        carro1.inserirDadosCarro("VW", "Gol", "IGM-1544", 2019, 4);
        //.
        //Aluno
        //
        Aluno aluno1 = new Aluno();
        Endereco endAluno1 = new Endereco();
        
        aluno1.inserirDadosAluno("Rafael ", "Bueno", "000.000.000-00", 20, "M", "Carro");
        endAluno1.inserirEnd("Bento Dias", "Camaqua", "RS", "101010-010");
        
        aluno1.setEndereco(endAluno1);

        //
        //Intrutor
        //.
        Instrutor teach1 = new Instrutor();
        Endereco endTeach1 = new Endereco();
        
        teach1.inserirDadosInstrutor("José", "Almeida", "000.000.000-00", 27, "Masculino", "B", 1320.05); 
        endTeach1.inserirEnd("Sete de Setembro", "Camaqua", "RS", "10101-010"); 
        
        teach1.setEndereco(endTeach1);
        teach1.setAutomovel(carro1);
        teach1.setStudent(aluno1);
        teach1.listarInstrutor();
        
       

    }
}
