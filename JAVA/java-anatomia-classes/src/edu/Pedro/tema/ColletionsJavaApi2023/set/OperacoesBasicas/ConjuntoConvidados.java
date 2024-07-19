package edu.Pedro.tema.ColletionsJavaApi2023.set.OperacoesBasicas;
import java.util.HashSet;
import java.util.Set;
public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome,codigoConvite));
    }
    public void removerConvidado(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c:convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }
    public int contarConvidados(){
        return convidadoSet.size();
    }
    public void exibirConvidado(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem "+conjuntoConvidados.contarConvidados()+" convidados dentro do Set de convidados");


        conjuntoConvidados.adicionarConvidado("Convidado 1",1234);
        conjuntoConvidados.adicionarConvidado("Convidado 1",1233);
        conjuntoConvidados.adicionarConvidado("Convidado 1",1234);
        conjuntoConvidados.adicionarConvidado("Convidado 1",1235);
        conjuntoConvidados.adicionarConvidado("Convidado 1",1235);

        System.out.println("Existem "+conjuntoConvidados.contarConvidados()+" convidados dentro do Set de convidados");

        conjuntoConvidados.removerConvidado(1234);
        System.out.println("Existem "+conjuntoConvidados.contarConvidados()+" convidados dentro do Set de convidados");

        conjuntoConvidados.exibirConvidado();
    }
}


