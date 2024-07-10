package edu.Pedro.tema.PIlaresPOO;

public class MSNmensseger extends ServicoMensagemInstantanea{


    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviar mensagem pelo MSN");
        salvarHistorico();
    }



    private void salvarHistorico() {
        System.out.println("Historico salvo no MSN");
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem no MSN");
    }

}
