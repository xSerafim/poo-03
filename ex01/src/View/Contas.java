package View;

import javax.swing.JOptionPane;

import Model.ContaEspecial;
import Model.ContaPoupanca;

public class Contas {
  public static void main(String[] args) {
    int option = 0;
    while (option != 3) {
      option = Integer
          .parseInt(JOptionPane.showInputDialog("Escolha uma opção\n1 - Conta Especial\n2 - Conta Poupança\n3 - Sair"));
      switch (option) {
        case 1:
          contaEspecial();
          break;
        case 2:
          contaPoupanca();
          break;
        case 3:
          break;
        default:
          JOptionPane.showMessageDialog(null, "Opção inválida");
          break;
      }
    }
  }

  public static void contaEspecial() {
    ContaEspecial conta = new ContaEspecial();
    conta.setCliente(JOptionPane.showInputDialog("Digite o nome do cliente"));
    conta.setNumConta(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta")));
    conta.setSaldo(Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo inicial")));
    conta.setLimite(Float.parseFloat(JOptionPane.showInputDialog("Digite o limite")));

    int option = 0;
    while (option != 4) {
      option = Integer.parseInt(
          JOptionPane.showInputDialog("Escolha uma opção\n1 - Depositar\n2 - Sacar\n3 - Ver saldo\n4 - Sair"));
      switch (option) {
        case 1:
          conta.depositar(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor a ser depositado")));
          break;
        case 2:
          try {
            conta.sacar(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor a ser sacado")));
          } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
          }
          break;
        case 3:
          JOptionPane.showMessageDialog(null, "Saldo: " + conta.getSaldo());
          break;
        case 4:
          break;
        default:
          JOptionPane.showMessageDialog(null, "Opção inválida");
          break;
      }
    }
  }

  public static void contaPoupanca() {
    ContaPoupanca conta = new ContaPoupanca();
    conta.setCliente(JOptionPane.showInputDialog("Digite o nome do cliente"));
    conta.setNumConta(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta")));
    conta.setSaldo(Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo inicial")));
    conta.setDiaRendimento(Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do rendimento")));

    int option = 0;
    while (option != 5) {
      option = Integer.parseInt(
          JOptionPane.showInputDialog(
              "Escolha uma opção\n1 - Depositar\n2 - Sacar\n3 - Ver saldo\n4 - Ver rendimento\n5 - Sair"));
      switch (option) {
        case 1:
          conta.depositar(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor a ser depositado")));
          break;
        case 2:
          try {
            conta.sacar(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor a ser sacado")));
          } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
          }
          break;
        case 3:
          JOptionPane.showMessageDialog(null, "Saldo: " + conta.getSaldo());
          break;
        case 4:
          float rendimento = conta.calcularRendimento(
              Float.parseFloat(JOptionPane.showInputDialog("Digite a taxa de rendimento em %")));
          JOptionPane.showMessageDialog(null, "Rendimento: " + rendimento);
          break;
        default:
          JOptionPane.showMessageDialog(null, "Opção inválida");
          break;
      }
    }
  }
}
