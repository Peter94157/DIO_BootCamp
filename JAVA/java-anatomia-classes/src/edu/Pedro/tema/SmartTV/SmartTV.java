package edu.Pedro.tema.SmartTV;

public class SmartTV {
    boolean Ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        Ligada = true;
    }
    public void desligar(){
        Ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Volume aumentado para: "+volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Volume diminuido para: "+volume);
    }

    public void aumetarCanal(){
        canal++;
        System.out.println("Canal atual -> "+canal);
    }
    public void diminuirCanal(){
        canal--;
        System.out.println("Canal atual -> "+canal);
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
