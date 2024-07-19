package edu.Pedro.tema.ColletionsJavaApi2023.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatosSet;

    public AgendaContatos(){
        this.contatosSet= new HashSet<>();
    }

    public void adicionarContado(String nome, int numero){
        contatosSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatosSet);
    }

    public Set<Contato> pesquisarContatoPorNome(String nome){
        Set<Contato> contatoNome = new HashSet<>();
        for(Contato c: contatosSet){
            if (c.getNome().startsWith(nome))
                contatoNome.add(c);
        }
        return contatoNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c: contatosSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContado("Camila", 123456);
        agendaContatos.adicionarContado("Camila", 0);
        agendaContatos.adicionarContado("Camila Cavalcantes", 11111111);
        agendaContatos.adicionarContado("Camila DIO", 648976);
        agendaContatos.adicionarContado("Maria Silva", 11111111);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarContatoPorNome("Camila"));

        agendaContatos.atualizarNumeroContato("Camila DIO",12345);

        System.out.println(agendaContatos.pesquisarContatoPorNome("Camila"));

    }
}
