import java.util.Scanner;

public class RefatorandoSwitchCase {
    public static void main(String[] args) {
        String nome = "Guilhermy Araujo";
        String tipoConta = "Corrente";
        double saldo = 1500;
        int opcao = 0;

        System.out.println("\n***********************************");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo atual: R$" + saldo);
        System.out.println("***********************************");

        String menu = """
             **Digite sua opção **
                            1 - Consultar saldo
                            2 - Transferir valor
                            3 - Receber valor
                            4 - Sair
            """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("O saldo atualizado é: " + saldo);
                    break;
                case 2:
                    System.out.println("Qual valor que deseja transferir?");
                    double valor = leitura.nextDouble();
                    if (valor <= saldo) {
                        saldo -= valor;
                        System.out.println("Novo saldo: " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente para transferências");
                    }
                    break;
                case 3:
                    System.out.println("Qual valor recebido? ");
                    double valorRecebido = leitura.nextDouble();
                    saldo += valorRecebido;
                    System.out.println("O saldo atual é: R$" + saldo);
                    break;
                case 4:
                    System.out.println("Saldo atual: R$" + saldo);
                    System.out.println("O JavaBanking agradece.");
                    System.out.println("Logout efetuado com sucesso.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente");
                    break;
            }
        }
    }
}
