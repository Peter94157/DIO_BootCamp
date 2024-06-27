package edu.Pedro.tema.ContaBanco;

public class InfoCliente {

    int numero = 1021;
    String agencia = "067-8";
    String nome = "Mario";
    double saldo = 237.48;




    public void acrescentarSaldo(double valor){
        saldo=+valor;
    }
    public void retirarSaldo(double valor){
        saldo-=valor;
    }

    public void mudarNome(String novoNome){
        nome = novoNome;
    }


}
