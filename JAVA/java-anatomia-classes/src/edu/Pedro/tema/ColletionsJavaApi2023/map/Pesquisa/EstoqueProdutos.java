package edu.Pedro.tema.ColletionsJavaApi2023.map.Pesquisa;

import javax.sound.sampled.Port;
import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long,Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>() {
        };
    }

    public void adicionarProduto(long cod,String nome,int quantidade,double preco){
        estoqueProdutosMap.put(cod,new Produto(nome,quantidade,preco));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public void removerProduto(String nome){
        if (!estoqueProdutosMap.isEmpty())
            estoqueProdutosMap.remove(nome);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p:estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }
    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p: estoqueProdutosMap.values()){
                if(p.getPreco()>maiorPreco){
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }
    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p: estoqueProdutosMap.values()){
                if(p.getPreco() < menorPreco){
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.exibirProdutos();

        estoqueProdutos.adicionarProduto(1L, "Produto A",10,4.0);
        estoqueProdutos.adicionarProduto(2L, "Produto B",5,10.0);
        estoqueProdutos.adicionarProduto(2L, "Produto B",5,20.0);
        estoqueProdutos.adicionarProduto(3L, "Produto C",2,15.0);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total do estoque: R$ "+estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: R$ "+estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: R$ "+estoqueProdutos.obterProdutoMaisBarato());

    }
}


