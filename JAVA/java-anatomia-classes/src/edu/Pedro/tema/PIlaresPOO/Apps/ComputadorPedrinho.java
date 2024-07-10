package edu.Pedro.tema.PIlaresPOO.Apps;

import edu.Pedro.tema.PIlaresPOO.FacebookMensseger;
import edu.Pedro.tema.PIlaresPOO.MSNmensseger;
import edu.Pedro.tema.PIlaresPOO.ServicoMensagemInstantanea;
import edu.Pedro.tema.PIlaresPOO.TelegramMensseger;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea service = null;

        String appEscolhido = "face";

        if(appEscolhido.equals("msn")){
            service = new MSNmensseger();
        } else if (appEscolhido.equals("face")) {
            service = new FacebookMensseger();
        } else if (appEscolhido.equals("tele")) {
            service = new TelegramMensseger();
        }

        service.receberMensagem();
        service.enviarMensagem();


    }
}
