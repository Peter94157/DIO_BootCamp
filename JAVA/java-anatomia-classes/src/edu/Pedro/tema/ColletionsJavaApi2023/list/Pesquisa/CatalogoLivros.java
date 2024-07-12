package edu.Pedro.tema.ColletionsJavaApi2023.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {this.livroList = new ArrayList<>();}

    public void adicionarLivro(String livro, String autor,int anoPublicacao){
        livroList.add(new Livro(livro,autor,anoPublicacao));
    }
    public List<Livro> pequisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }
    public List<Livro> pesquisaPorIntervaloAno(int anoIncial, int anoFinal){
        List<Livro> livroPorIntervaloDeAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAnoPublicacao()>= anoIncial && l.getAnoPublicacao()<= anoFinal){
                    livroPorIntervaloDeAnos.add(l);
                }
            }
        }
        return livroPorIntervaloDeAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l ;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }


    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2024);
        catalogoLivros.adicionarLivro("Livro 5", "Autor 5", 2001);

        System.out.println("-----------------------------");
        System.out.println(catalogoLivros.pequisarPorAutor("Autor 2"));
        System.out.println("-----------------------------");
        System.out.println(catalogoLivros.pesquisaPorIntervaloAno(2020,2023));
        System.out.println("-----------------------------");
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
        System.out.println("-----------------------------");






    }
}
