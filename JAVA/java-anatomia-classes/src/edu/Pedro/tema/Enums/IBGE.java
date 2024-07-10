package edu.Pedro.tema.Enums;

public class IBGE {
    public static void main(String[] args) {
        for(EstadosBrasileiros e: EstadosBrasileiros.values()){
            System.out.println(e.getSiglas()+" - "+ e.getNome());
        }

        EstadosBrasileiros eb = EstadosBrasileiros.PARANA;

        System.out.println(eb.getNomeMaiusculo());
    }
}
