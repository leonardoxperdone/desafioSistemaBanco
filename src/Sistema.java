import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int menu = 0;
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("1 - Conta Corrente \n2 - Conta Poupança");
        int conta = sc.nextInt();
        String tipoConta = "";

        if (conta == 1) {
            tipoConta = "Conta Corrente";
            System.out.println("Conta Corrente selecionada");
        } else if (conta == 2) {
            tipoConta = "Conta Poupança";
            System.out.println("Conta Poupança selecionada");
        } else {
            System.out.println("Verifique o número digitado.");
        }

        double saldo = 2500.0;
        System.out.println("**************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome: " + nome);
        System.out.println("Conta: " + tipoConta);
        System.out.println("Saldo inicial: R$ " + saldo);
        System.out.println("**************************\n");

        String opc = """
                Operações:
                 1 - Consultar saldo
                 2 - Depositar valor
                 3 - Sacar valor
                 4 - Sair
                """;
        while (menu != 4) {
            System.out.print(opc);

            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Saldo atual: R$ " + saldo);
                    break;

                case 2:
                    System.out.print("Digite o valor a ser depositado: ");
                    double deposito = sc.nextDouble();
                    saldo += deposito;
                    System.out.println("Saldo atualizado: R$ " + saldo);
                    break;

                case 3:
                    System.out.print("Digite o valor a ser sacado: ");
                    double saque = sc.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Saldo indisponível\nSeu saldo: " + saldo);
                    } else {
                        saldo -= saque;
                        System.out.println("Saldo atualizado: R$ " + saldo);
                    }
                    break;

                case 4:
                    System.out.println("Sistema sendo encerrado.");
                    break;

                default:
                    System.out.println("Digite uma opção válida.");
            }
        }


        sc.close();
    }
}

