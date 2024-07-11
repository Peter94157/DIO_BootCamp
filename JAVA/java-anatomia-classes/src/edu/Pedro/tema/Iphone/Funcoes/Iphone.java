package edu.Pedro.tema.Iphone.Funcoes;

import edu.Pedro.tema.Iphone.FuncoesImpl.AparelhoTelefonicoImpl;
import edu.Pedro.tema.Iphone.FuncoesImpl.NavegadorInternetImpl;
import edu.Pedro.tema.Iphone.FuncoesImpl.ReprodutorMusicalImpl;

public class Iphone implements AparelhoTelefonicoImpl, NavegadorInternetImpl, ReprodutorMusicalImpl {
    public void ligar(String numeroCelular){
        System.out.println("Ligando para "+ numeroCelular+"...");
    }
    public void atender(){
        System.out.println("Atendendo ligação...");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Correio de voz sendo iniciado...");
    }


    public void exibirPagina(String url){
        System.out.println("Abrindo página "+url+"...");
    }
    public void adicionarNovaAba(){
        System.out.println("Abrindo nova aba...");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando página...");
    }


    public void tocar(){
        System.out.println("Tocando música...");
    }
    public void pausar(){
        System.out.println("Pausando musica...");
    }
    public void selecionarMusica(String musica){
        System.out.println("Selecioando musica "+musica);
    }

}
