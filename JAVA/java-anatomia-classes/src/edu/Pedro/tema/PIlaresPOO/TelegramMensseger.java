package edu.Pedro.tema.PIlaresPOO;

public class TelegramMensseger extends ServicoMensagemInstantanea{
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviar mensagem pelo Telegram");
        salvarHistorico();
    }



    private void salvarHistorico() {
        System.out.println("Historico salvo no Telegram");
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem no Telegram");
    }
}
