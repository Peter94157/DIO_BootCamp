package edu.Pedro.tema.ColletionsJavaApi2023.map.Ordenacao;

import edu.Pedro.tema.ColletionsJavaApi2023.set.Pesquisa.AgendaContatos;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate,Eventos> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        //Eventos evento = new Eventos(nome,atracao);
        eventosMap.put(data, new Eventos(nome,atracao));

    }

    public void exibirAgenda(){
        Map<LocalDate,Eventos> eventoTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventoTreeMap);
    }

    public void obterProximoEvento(){
        /*Set<LocalDate> dataSet = eventosMap.keySet();
        Collection<Eventos> values = eventosMap.values();*/

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximoData = null;
        Eventos proximoEvento = null;
        Map<LocalDate, Eventos> eventosTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate,Eventos> entry : eventosTreeMap.entrySet()){
            proximoEvento = entry.getValue();
            proximoData=entry.getKey();
            if(proximoData.isEqual(dataAtual)|| proximoData.isAfter(dataAtual)){
                System.out.println("O próximo evento "+proximoEvento+" acontecerá "+proximoData);
                break;
            }
        }
    }

    public static void main(String[] args) {

        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JULY,29), "Evento 1","Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.APRIL,10), "Evento 2","Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.DECEMBER,25), "Evento 3","Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.DECEMBER,29), "Evento 3","Atração 3");


        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();



    }
}
