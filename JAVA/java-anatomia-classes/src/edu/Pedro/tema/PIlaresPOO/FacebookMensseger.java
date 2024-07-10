package edu.Pedro.tema.PIlaresPOO;

public class FacebookMensseger extends ServicoMensagemInstantanea{
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviar mensagem pelo Facebook");
        salvarHistorico();
    }



    private void salvarHistorico() {
        System.out.println("Historico salvo do Facebook");
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem do Facebook");
    }
}
