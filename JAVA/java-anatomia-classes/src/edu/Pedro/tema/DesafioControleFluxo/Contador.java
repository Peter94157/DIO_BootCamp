package edu.Pedro.tema.DesafioControleFluxo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Contador {

    public static void main (String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro paràmetro: ");
        int parametroUM = scan.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDOIS = scan.nextInt();

        try{
            contar(parametroUM,parametroDOIS);
        }catch(ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUM, int parametroDOIS)throws ParametrosInvalidosException  {
        if(parametroUM>parametroDOIS)
            throw new ParametrosInvalidosException();

        for (int i = parametroUM; i < parametroDOIS; i++)
            System.out.println("Imprimindo numero "+i);
    }

}
