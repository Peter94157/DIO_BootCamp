package edu.Pedro.tema.Objetos_Construtores;

public class Escola {
    public static void main(String[]args){
        Pessoa aluno = new Pessoa("Pedro",23);

        aluno.setEndereco("Estrada do pequia, 286");

        System.out.println("Óla, meu nome é "+aluno.getNome()+" e tenho "+aluno.getIdade()+" anos de idade, e estou morando na "+aluno.getEndereco());

    }
}
