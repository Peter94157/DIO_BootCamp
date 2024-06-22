package edu.Pedro.tema.SmartTV;
public class Usuario {

    public static void main(String[] args)throws Exception{
        SmartTV smartTV = new SmartTV();

        System.out.println("TV ligada ? " +smartTV.Ligada);
        System.out.println("Canal atual ? "+smartTV.canal);
        System.out.println("Volume atual ? "+ smartTV.volume);

        smartTV.ligar();
        System.out.println("novo status -> "+smartTV.Ligada);
        smartTV.desligar();
        System.out.println("novo status -> "+smartTV.Ligada);

        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();

        System.out.println("Volume atual -> "+smartTV.volume);

        smartTV.aumetarCanal();
        smartTV.aumetarCanal();
        smartTV.aumetarCanal();
        smartTV.aumetarCanal();
        smartTV.diminuirCanal();
        smartTV.diminuirCanal();
        smartTV.diminuirCanal();
        smartTV.diminuirCanal();

        smartTV.mudarCanal(24);

        System.out.println("Canal atual -> "+smartTV.canal);


    }
}
