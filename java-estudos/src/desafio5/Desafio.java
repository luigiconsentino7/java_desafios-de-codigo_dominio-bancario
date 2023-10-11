package desafio5;

import java.util.Scanner;

public class Desafio {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String entrada = scanner.nextLine();
            String[] partes = entrada.split(",");

            if (partes.length == 4) {
                String data = partes[0];
                String hora = partes[1];
                String descricao = partes[2];
                double valor = Double.parseDouble(partes[3]);

                Transacao transacao = new Transacao(data, hora, descricao, valor);
                transacao.imprimir();
            } else {
                System.out.println("Entrada inválida. Certifique-se de fornecer os dados no formato correto: data,hora,descricao,valor");
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class Transacao {
    private String data;
    private String hora;
    private String descricao;
    private double valor;

    public Transacao(String data, String hora, String descricao, double valor) {
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
        this.valor = valor;
    }
  
    public void imprimir() {
        System.out.println(this.descricao);
        System.out.println(this.data);
        System.out.println(this.hora);
        System.out.printf("%.2f%n", this.valor);
    }
}
