package br.com.cofre.main;

import br.com.cofre.Cofrinho;
import br.com.cofre.moedas.Dolar;
import br.com.cofre.moedas.Euro;
import br.com.cofre.moedas.Real;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("@Daniela Gross 4157116\n");

        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("[1] Adicionar Dólar");
            System.out.println("[2] Adicionar Euro");
            System.out.println("[3] Adicionar Real");
            System.out.println("[4] Remover Dólar");
            System.out.println("[5] Remover Euro");
            System.out.println("[6] Remover Real");
            System.out.println("[7] Listar Moedas");
            System.out.println("[8] Total Convertido para Real");
            System.out.println("[0] Sair");
            System.out.print("Digite o número da opção escolhida -> ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o valor do Dólar a ser adicionado: ");
                    cofrinho.adicionar(new Dolar(scanner.nextDouble()));
                    break;
                case 2:
                    System.out.print("Informe o valor do Euro a ser adicionado: ");
                    cofrinho.adicionar(new Euro(scanner.nextDouble()));
                    break;
                case 3:
                    System.out.print("Informe o valor do Real a ser adicionado: ");
                    cofrinho.adicionar(new Real(scanner.nextDouble()));
                    break;
                case 4:
                case 5:
                case 6:
                    removerMoeda(cofrinho, opcao, scanner);
                    break;
                case 7:
                    System.out.println("Listagem de Moedas: \n##########");
                    cofrinho.listagemMoedas();
                    System.out.println("##########");
                    break;
                case 8:
                    System.out.println("\nTotal Convertido para Real: R$ " + String.format("%.2f", cofrinho.totalConvertido()));
                    break;
                case 0:
                    System.out.println("Obrigado por utilizar o programa @4157116");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    private static void removerMoeda(Cofrinho cofrinho, int tipo, Scanner scanner) {
        System.out.print("Valor a ser removido -> ");
        double valor = scanner.nextDouble();

        switch (tipo) {
            case 4:
                cofrinho.remover(new Dolar(valor));
                break;
            case 5:
                cofrinho.remover(new Euro(valor));
                break;
            case 6:
                cofrinho.remover(new Real(valor));
                break;
        }
    }
}