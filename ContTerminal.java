import java.sql.SQLOutput;
import java.util.Scanner;

public class ContTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar o nome do Usuario
        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();

        // Solicitar o numero da conta
        System.out.println("Digite o numero da conta: ");
        int numConta = sc.nextInt();

        // Solicita o saldo inicial
        System.out.println("Digite o saldo inicial: ");
        double saldo = sc.nextDouble();

        //Exibir a mensagem de confirmação da criação da conta

        System.out.println("Conta Criada com sucesso! ");
        System.out.println("Nome do titular: " + nome);
        System.out.println("Numero da conta: +NunConta");
        System.out.printf("Saldo inicial: R$ %.2f\n", saldo);

        int opcao;
        do{
            //Exibe o menu de opcoes

            System.out.println(" ");
            System.out.println("---------BANCO NACIONAL---------");
            System.out.println("\nEscolha uma Opção: ");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Visualizar Saldo");
            System.out.println("4 - Sair");
            System.out.println("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    // Deposito
                    System.out.print("Digite o valor que deseja Depositar: ");
                    double valorDeposito = sc.nextDouble();
                    if(valorDeposito > 0){
                        saldo += valorDeposito;
                        System.out.printf("Deposito de R$ %.2f realizado com sucesso!\n", valorDeposito);
                    }else {
                        System.out.println("Valor invalido para deposito.");
                    }
                    break;
                case 2:
                    // Saque
                    System.out.print("Digite o valor para sacar: ");
                    double valorSaque = sc.nextDouble();
                    if(valorSaque > 0 && valorSaque <= saldo){
                        saldo -= valorSaque;
                        System.out.printf("Saque de R$ %.2f realizado com sucesso!", valorSaque);
                    }else {
                        System.out.println("Saldo insuficente ou valor inválido.");
                    }
                    break;
                case 3:
                    //Visualizar saldo
                    System.out.printf("Saldo atual R$ %.2f\n", saldo);
                    break;
                case 4:
                //Sair
                    System.out.print("Saindo... Obrigado e volte Sempre!");
                    break;
                default:
                    System.out.print("Opção invalida! Tente Novamente...");
            }
        } while (opcao != 4);
        sc.close();
    }
}
