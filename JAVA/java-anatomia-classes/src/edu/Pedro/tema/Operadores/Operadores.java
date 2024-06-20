package edu.Pedro.tema.Operadores;

public class Operadores {

    public static void main (String [] args){


        boolean condicao1 = true;
        boolean condicao2 = false;

        String condicao = condicao1 && condicao2 ? "as duas consições são verdadeiiras" : "erro";
        String condicaoOU = condicao1||condicao2 ? "Uma das duas condições é verdadeira":"Erros";
        System.out.println(condicao);
        System.out.println(condicaoOU);


    }

    void Logicos(){
        boolean condicao1 = true;
        boolean condicao2 = false;

        String condicao = condicao1 && condicao2 ? "as duas consições são verdadeiiras" : "erro";
        String condicaoOU = condicao1||condicao2 ? "Uma das duas condições é verdadeira":"Erros";
        System.out.println(condicao);
        System.out.println(condicaoOU);
    }

    void relacionais(){
        String nome1 = "Pedro";
        String nome2 = new String("Pedro");

        System.out.println(nome1 == nome2);


        nome1 = "Pedro";
        nome2 = new String("Pedro");

        System.out.println(nome1.equals(nome2));


        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1==numero2;

        System.out.println("NumeroUm é igual a numeroDois" + simNao);

        simNao = numero1 != numero2 ;

        System.out.println("Numero um é diferente de Numero dois "+ simNao);

        simNao = numero1 < numero2 ;

        System.out.println("Numero um é menor que Numero dois "+ simNao);


    }
    void terbario(){
        int a,b;

        a = 5;
        b = 6;

        String resultado2 = a==b ? "verdadeiro" : "falso";

        String resultado = "";
        if (a==b)
            resultado = "Verdadeiro";
        else
            resultado = "Falso";

        System.out.println(resultado);
    }

    void booleano(){

        boolean variavel = true;

        System.out.println(!variavel);

        variavel = !variavel;

        System.out.println(variavel);

    }
    void decrementoIncremento(){
        int numero = 5;

        numero++;

        System.out.println(++numero);
        System.out.println(numero++);
        System.out.println(--numero);
        System.out.println(numero--);

        System.out.println(numero);
    }
    void numeroAritmetico(){
        int numero = 5;

        System.out.println( - numero);

        System.out.println( + numero);

        numero = - numero;
        System.out.println(numero);

        numero = + numero;
        System.out.println(numero);

        numero = numero * -1;
        System.out.println(numero);

    }
    void concat(){
        String nomeCompleto = "Linguagem"+"JAVA";

        System.out.println(nomeCompleto);

        String conctenacao = "?";

        conctenacao = 1+1+1+"1";
        System.out.println(conctenacao);

        conctenacao = "1"+1+1+1+1;
        System.out.println(conctenacao);

        conctenacao = "1"+(1+1+1+1);
        System.out.println(conctenacao);

    }
}
