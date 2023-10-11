package desafio2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaBancaria {
    protected int numero;
    protected String titular;
    protected double saldo;

  public ContaBancaria() {
    numero = 0;
    titular = "";
    saldo = 0; 
  }

  public void exibirInformacoes() {
    DecimalFormat decimalFormat = new DecimalFormat("#.0");
    System.out.println(titular);
    System.out.println(numero);
    System.out.println("Saldo: R$ " + decimalFormat.format(saldo));
  }

  public static void main(String[] args) {
    ContaBancaria contaBancaria = new ContaBancaria();
    ContaPoupanca contaPoupanca = new ContaPoupanca();

    try (// Lendo os dados de Entrada:
    Scanner scanner = new Scanner(System.in)) {
        String nomeTitular = scanner.nextLine();
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
        double saldo = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();

        System.out.println("Conta Poupanca:");
        //TODO: Imprimir as informações da conta usando o objeto criado no TODO acima.

        contaBancaria.titular = nomeTitular;
        contaBancaria.numero = numeroConta;
        contaBancaria.saldo = saldo;
         contaPoupanca.taxaJuros = taxaJuros;

        contaBancaria.exibirInformacoes();
        contaPoupanca.exibirInformacoesJuros();
  }
 }
}

class ContaPoupanca extends ContaBancaria {
  protected double taxaJuros;

  public ContaPoupanca() {
    taxaJuros = 0;
    //TODO: Implementar adequadamente esta sobrecarga de construtores.
  }

  public void exibirInformacoesJuros() {
    //TODO: Complementar as informações com a taxa de juros.
    DecimalFormat decimalFormat = new DecimalFormat("#.0");
    System.out.println("Taxa de juros: " + decimalFormat.format(taxaJuros) + "%");
  }

}
