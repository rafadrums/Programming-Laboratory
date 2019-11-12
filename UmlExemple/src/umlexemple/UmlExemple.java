package umlexemple;

public class UmlExemple {

    public static void main(String[] args) {
        // TODO code application logic here

        Pessoa p1 = new Pessoa();

        Instrutor i1 = new Instrutor();

        //Carros
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        
        
        carro1.inserirDados("VW","Gol","IGM-1544",2019);
        carro2.inserirDados("Chevrolet", "Onix", "IXC-5462", 2019);
        carro1.listarCarro();
        System.out.println("");
        carro2.listarCarro();

    }
}
