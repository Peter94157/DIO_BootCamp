package edu.Pedro.tema.ColletionsJavaApi2023.list.OperacoesBasicas;

public class Tarefa {
    private String descricao;

    public Tarefa(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
