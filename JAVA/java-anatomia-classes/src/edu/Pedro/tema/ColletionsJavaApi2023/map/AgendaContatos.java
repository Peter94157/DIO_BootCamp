package edu.Pedro.tema.ColletionsJavaApi2023.map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }
    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome,telefone);
    }

    public void removeContato(String nome){
        if(!agendaContatoMap.isEmpty())
            agendaContatoMap.remove(nome);
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisaPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Pedro", 11231234);
        agendaContatos.adicionarContato("Pedro", 342432);
        agendaContatos.adicionarContato("Pedro Leonardo", 34235325);
        agendaContatos.adicionarContato("Pedro DIO", 12343);
        agendaContatos.adicionarContato("Giulia", 23423);
        agendaContatos.adicionarContato("Pedro", 9987);

        agendaContatos.exibirContatos();

        agendaContatos.removeContato("Pedro DIO");
        agendaContatos.exibirContatos();

        System.out.println("o Numero é "+agendaContatos.pesquisaPorNome("Pedro Leonardo"));
    }


}
