package edu.Pedro.tema.ContaBanco;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[]args)throws Exception{
        InfoCliente infoCliente = new InfoCliente();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência!");
        int numeroAgencia = scanner.nextInt();

        if(numeroAgencia==infoCliente.numero){
            System.out.println("Olá "+infoCliente.nome+", obrigado por criar uma conta em nosso banco, sua agência é "+infoCliente.agencia+", conta número "+infoCliente.numero+" e o seu saldo R$"+infoCliente.saldo+" já está disponível para saque");
        }else{
            System.out.println("acesso negado");
        }

    }
}
