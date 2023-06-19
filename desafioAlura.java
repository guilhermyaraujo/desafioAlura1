import java.util.Scanner;

public class desafioAlura {
    public static void main(String[] args) {
/*Criação de classe e metodo, declaração de variaveis e
        concatenação de string */
        String nome = "Guilhermy Araujo";
        String tipoConta = "Corrente";
        double saldo = 1500;
        int opcao = 0;

        System.out.println("\n***********************************");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo autal: R$" + saldo);
        System.out.println("***********************************");

        // Criacao do menu opcao, loop com while
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

            if (opcao == 1) {
                System.out.println("O saldo atualizado é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual valor que deseja transerferir?");
                double valor = leitura.nextDouble();
                if (valor <= saldo) {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                } else {
                    System.out.println(" saldo insuficiente para transferencias");
                }
            } else if (opcao == 3) {
                System.out.println("Qual valor recebido? ");
                double valorRecebido = leitura.nextDouble();
                saldo = valorRecebido + saldo;
                System.out.println("O saldo atual é: R$" + saldo);


            } else if (opcao != 4) {
                System.out.println("Opção invalida. Tente novamente");
            }
        }
    }
}
