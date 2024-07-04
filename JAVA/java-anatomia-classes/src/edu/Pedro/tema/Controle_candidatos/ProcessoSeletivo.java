package edu.Pedro.tema.Controle_candidatos;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[]args){
        System.out.println("Processo Seletivo");
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }


    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando=true;
        boolean atendeu=false;
        
        do{
            atendeu = atender();
            continuarTentando=!atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }
        }while(continuarTentando && tentativasRealizadas<3);
        if(atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM "+candidato+" NA TENTATIVA "+tentativasRealizadas);
        }else{
            System.out.println("NÃO CONSEGUIMOS ENTRAR EM CONTATO COM O CANDIDATO "+candidato+" NÚMEROS DE TENTATIVAS "+tentativasRealizadas);
        }
        
        
    }

     static boolean atender() {
        return new Random().nextInt(3)==1;
    }


    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};
        int candidatoAtual = 0;
        int candidatoSelecionado = 0;
        double salarioBase = 2000.0;
        while(candidatoSelecionado<5 && candidatoAtual<candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPredentido();

            System.out.println("O candidato "+candidato+" Solicitou este valor de salário "+ salarioPretendido);
            if (salarioBase>=salarioPretendido){
                System.out.println("O candidato "+candidato+" foi selecionado para vaga");
                candidatoSelecionado++;
            }
            candidatoAtual++;
        }

    }

    private static double valorPredentido() {
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidatos(double salarioPretendido){
        double  salarioBase = 2000.0;
        if (salarioBase>salarioPretendido){
            System.out.println("LIGAR PARA CANDIDATO");
        }else if(salarioBase==salarioPretendido){
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO RESULTADO DE OUTROS CANDIDATOS");
        }
    }

}
