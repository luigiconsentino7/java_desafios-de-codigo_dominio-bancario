package desafio3;

import java.util.Scanner;

public class Cofre {
  protected String tipo;
  protected String metodoAbertura;

  public Cofre() {
    tipo = "Indefinido";
    metodoAbertura = "Indefinido";
  }

  public void imprimirInformacoesCofre() {
    System.out.println("Tipo: " + tipo);
    System.out.println("Metodo de abertura: " + metodoAbertura);
  }

  public static void main(String[] args) {
    Cofre cofre = new Cofre();
    CofreDigital cofreDigital = new CofreDigital();
    CofreFisico cofreFisico = new CofreFisico();
    try (// Lê o tipo de cofre (primeira linha da entrada)
    Scanner scanner = new Scanner(System.in)) {
      String tipoCofre = scanner.nextLine();
      
       cofre.tipo = tipoCofre;
    
      if (cofre.tipo.equalsIgnoreCase("digital")) {
       cofreDigital.imprimirInformacoesCofreDigital();
        int definirSenha = scanner.nextInt();
      cofreDigital.senha = definirSenha;
       int pedirSenha = scanner.nextInt();
       if(pedirSenha != cofreDigital.senha){
        System.out.println("Senha incorreta!");
       }else{
        System.out.println("Cofre aberto!");
       }
    }else{
      cofreFisico.imprimirInformacoesCofreFisico();
 }
    }
}
}

class CofreDigital extends Cofre {

  protected int senha;

  public CofreDigital() {
   this.senha = 0;
  }

  public boolean validarSenha(int confirmacaoSenha) {
    return confirmacaoSenha == this.senha;
  }

  public void imprimirInformacoesCofreDigital() {
    System.out.println("Tipo: Cofre Digital");
    System.out.println("Metodo de abertura: Senha");
  }
}

class CofreFisico extends Cofre {
  private String tipoFisico;
  private String aberturaFisico;


  public CofreFisico() {
    this.tipoFisico = "Cofre Fisico";
    this.aberturaFisico = "Chave";
  }

  public void imprimirInformacoesCofreFisico() {
    System.out.println("Tipo: " + tipoFisico);
    System.out.println("Metodo de abertura: " + aberturaFisico);
  }

}
  
