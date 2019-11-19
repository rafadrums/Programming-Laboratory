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
        teach1.listarInstrutorCarro();

        System.out.println("");
        System.out.println("");
        
        //CONJUNTO2 -------------------------------
        //.
        //Veículo
        //.
        Moto moto1 = new Moto();

        moto1.inserirDadosMoto("Honda", "Fan 125 KS", "SLK-5462", 2016, 107.5); //        
        //.
        //Aluno
        //
        Aluno aluno2 = new Aluno();
        Endereco endAluno2 = new Endereco();

        aluno2.inserirDadosAluno("Anderson", "Bueno", "020.050.000-00", 21, "M", "Moto");
        endAluno1.inserirEnd("Rua de trás", "Chuvisca", "RS", "96193-000");

        aluno2.setEndereco(endAluno2);
        //
        //Intrutor
        //.
        Instrutor teach2 = new Instrutor();
        Endereco endTeach2 = new Endereco();

        teach2.inserirDadosInstrutor("Carlos", "Santos", "000.000.000-00", 27, "Não informado", "A", 1420.05);
        endTeach2.inserirEnd("Lagoa azul", "Camaqua", "RS", "10101-010");

        teach2.setEndereco(endTeach2);
        teach2.setAutomovel(moto1);
        teach2.setStudent(aluno2);
        teach2.listarInstrutorMoto();

        System.out.println("");
        System.out.println("");
        //CONJUNTO2 -------------------------------
        //.
        //Veículo
        //.
        Onibus onibus1 = new Onibus();

        onibus1.inserirDadosOnibus("Scania", "K 310", "IKG-6541", 2014, 44, 000000);
        //.
        //Aluno
        //
        Aluno aluno3 = new Aluno();
        Endereco endAluno3 = new Endereco();

        aluno3.inserirDadosAluno("Alisson", "Lopes", "040.450.700-10", 25, "M", "Onibus");
        endAluno3.inserirEnd("Rua HH", "Chuvisca", "RS", "96193-000");

        aluno3.setEndereco(endAluno3);
        //
        //Intrutor
        //.
        Instrutor teach3 = new Instrutor();
        Endereco endTeach3 = new Endereco();

        teach3.inserirDadosInstrutor("José", "Ferreira", "000.000.000-00", 41, "M", "D", 1800.05);
        endTeach3.inserirEnd("Lagoa Amarela", "Camaqua", "RS", "10101-010");

        teach3.setEndereco(endTeach3);
        teach3.setAutomovel(onibus1);
        teach3.setStudent(aluno3);
        teach3.listarInstrutorOnibus();

        
        
    }
}
