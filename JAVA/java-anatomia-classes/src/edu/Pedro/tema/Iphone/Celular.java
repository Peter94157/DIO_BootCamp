package edu.Pedro.tema.Iphone;

import edu.Pedro.tema.Iphone.Funcoes.Iphone;

public class Celular {
    public static void main(String[] args) {
        Iphone ios = new Iphone();

        System.out.println("Funções Ipod:");
        System.out.println("--------------------------------------");
        ios.tocar();
        ios.pausar();
        ios.selecionarMusica("Estrada da vida");
        System.out.println(" ");

        System.out.println("Funções de ligação:");
        System.out.println("--------------------------------------");
        ios.ligar("11944327268");
        ios.atender();
        ios.iniciarCorreioVoz();
        System.out.println(" ");

        System.out.println("Funções de Navegação:");
        System.out.println("--------------------------------------");
        ios.exibirPagina("Facebook.com");
        ios.adicionarNovaAba();
        ios.atualizarPagina();

        System.out.println("--------------------------------------");

    }
}
