package desafio1;
import java.util.Scanner;

public class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;

  public ContaBancaria() {
    numero = 0;
    titular = "";
    saldo = 0;
  }

  public static void main(String[] args) {
    ContaBancaria contaBancaria = new ContaBancaria();
    try (// Lendo os dados de Entrada:
    Scanner scanner = new Scanner(System.in)) {
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
        String nomeTitular = scanner.nextLine();
        double saldo = scanner.nextDouble();

        //TODO: Criar uma instância de "ContaBancaria" com os valores de Entrada.

        System.out.println("Informacoes:");
        //TODO: Imprimir as informações da conta usando o objeto criado no TODO acima.

        contaBancaria.numero = numeroConta;
        contaBancaria.titular = nomeTitular;
        contaBancaria.saldo = saldo;
    }
    System.out.println("Conta: "+contaBancaria.numero);
    System.out.println("Titular: "+contaBancaria.titular);
    System.out.println("Saldo: R$ "+contaBancaria.saldo);
  }
}
