package edu.Pedro.tema.Metodos;

import java.sql.SQLOutput;

public class Metodos {


    public static void main (String[] args){

    }


    public String imprimir (){
        String nome = "Pedro";
        System.out.println("Óla");
        return nome ;
    }

    public void Impimir(){
        System.out.println("Sem retorno");
    }

    public double dividir(int divisor, int dividendo)throws Exception{
        System.out.println("Metodos com uma exceção");
        double numero = 1.2;
        return numero;
    }


}
