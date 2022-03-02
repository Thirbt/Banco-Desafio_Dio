package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variáveis e Inicialização
        Scanner ler = new Scanner(System.in);
        boolean erro = true;
        String cpf, senha;
        String cpfCerto = "123.456.789-00", senhaCerta = "01020304";
        int opcao = 0, finalizador = 2, retorno = 0, permissao = 1, voltar = 2;
        float saldoatual = 1000, deposito, Calculodeposito, saque, Calculosaque;

        // Apresentação do código
        System.out.println("|Atividade AC2 *Caixa Eletrônico*|");
        System.out.println();

        System.out.println("========================================");
        System.out.println("----------- Seja Bem vindo ------------ ");
        System.out.println("----------------- Ao ------------------ ");
        System.out.println("----------- Banco's Rocha ------------- ");
        System.out.println("========================================");
        System.out.println();

        // CPF proposto para o exercício = 123.456.789-00
        // Senha proposta para o exercício = 01020304
        while (voltar != 0) {

            cpf = "";
            senha = "0";
            opcao = 0;
            finalizador = 2;
            retorno = 0;
            permissao = 1;
            voltar = 2;
            saldoatual = 1000;
            deposito = 0;
            Calculodeposito = 0;
            saque = 0;
            Calculosaque = 0;

            System.out.println("|Primeiramente insira seu CPF para acessarmos seus dados|");
            System.out.println();
            System.out.print("CPF : ");
            cpf = ler.nextLine();
            System.out.println();

            if (cpf.equals(cpfCerto)) {
                for (int i = 0; i < 3; i++) {
                    System.out.print("Senha : ");
                    senha = ler.nextLine();
                    System.out.println();
                    i++;

                    if (senha.equals(senhaCerta)) {

                        System.out.println("=======================================");
                        System.out.println("| Você acessou sua conta com sucesso! |");
                        System.out.println("=======================================");
                        System.out.println();

                        if (i < 3) {

                            while (finalizador != 0) {
                                erro = true;
                                System.out.println("|Escolha Uma das seguintes opções|");
                                System.out.println();
                                System.out.println("====================");
                                System.out.println("|0 - Sair         |");
                                System.out.println("|1 - Saldo        |");
                                System.out.println("|2 - Depósito     |");
                                System.out.println("|3 - Saque        |");
                                System.out.println("|4 - Reiniciar    |");
                                System.out.println("====================");
                                System.out.println();
                                System.out.print("Opção : ");
                                opcao = ler.nextInt();
                                System.out.println();

                                switch (opcao) {

                                    case 0:

                                        System.out.println("|Finalizando o Sistemas...");
                                        System.out.println("|Aguarde...|");
                                        System.out.println();
                                        System.out.println("**********************");
                                        System.out.println("|*** Volte Sempre ***|");
                                        System.out.println("**********************");
                                        System.out.println();
                                        System.out.println("=========================");
                                        System.out.println("| - Systema Desligado - |");
                                        System.out.println("=========================");
                                        System.out.println();
                                        finalizador = 0;
                                        voltar = 0;
                                        i = 3;

                                        break;

                                    case 1:

                                        System.out.println("|Saldo Atual : R$ " + saldoatual + " |");
                                        System.out.println();
                                        break;
                                    case 2:

                                        System.out.println("|Digite o valor do depósito|");
                                        System.out.print("Depósito : ");
                                        deposito = ler.nextFloat();

                                        Calculodeposito = deposito + saldoatual;
                                        saldoatual = Calculodeposito;
                                        System.out.println();
                                        System.out.println("|Saldo Atual: R$ " + saldoatual + " |");
                                        System.out.println();
                                        break;
                                    case 3:
                                        System.out.println("|Digite o valor do saque|");
                                        System.out.print("Saque : ");
                                        saque = ler.nextFloat();

                                        Calculosaque = saldoatual - saque;
                                        saldoatual = Calculosaque;

                                        System.out.println();
                                        System.out.println("|Saldo Atual: R$ " + saldoatual + " |");
                                        break;
                                    case 4:
                                        System.out.println("|Você deseja voltar ao inicio|");
                                        System.out.println();
                                        System.out.println("====================");
                                        System.out.println("|0 - Não           |");
                                        System.out.println("|1 - Sim           |");
                                        System.out.println("====================");
                                        System.out.println();
                                        System.out.print("Opção : ");
                                        while (erro == true) {
                                            voltar = ler.nextInt();
                                            if (voltar < 0) {
                                                System.out.println("|Escolha a opção correta!!|");
                                                System.out.println("|Você deseja voltar ao inicio|");
                                                System.out.println();
                                                System.out.println("====================");
                                                System.out.println("|0 - Não           |");
                                                System.out.println("|1 - Sim           |");
                                                System.out.println("====================");
                                                System.out.println();
                                                System.out.print("Opção : ");
                                            } else if (voltar > 1) {
                                                System.out.println("|Escolha a opção correta!!|");
                                                System.out.println("|Você deseja voltar ao inicio|");
                                                System.out.println("");
                                                System.out.println("====================");
                                                System.out.println("|0 - Não           |");
                                                System.out.println("|1 - Sim           |");
                                                System.out.println("====================");
                                                System.out.println();
                                                System.out.print("Opção : ");
                                            }
                                            if (voltar == 1 || voltar == 0) {
                                                erro = false;
                                            }
                                        }
                                        if (voltar == 1) {
                                            finalizador = 0;
                                        }
                                        break;
                                    default:
                                        System.out.println("|Opção Inválida|");
                                        System.out.println("|Tente Novamente|");
                                        System.out.println();
                                        break;
                                }

                            }

                        }

                    } else if (i < 2) {

                        System.out.println("==================");
                        System.out.println("|Senha Inválida|");
                        System.out.println("|Tente Novamente|");
                        System.out.println("==================");
                        System.out.println();
                    } else {

                        System.out.println("=======================================");
                        System.out.println("|Número máximo de tentativas alcançada|");
                        System.out.println("|Conta Bloqueada|");
                        System.out.println("=======================================");
                        System.out.println();
                        i = 3;

                    }
                }

            } else {
                System.out.println("|CPF Inválido|");

            }
        }
    }
}
