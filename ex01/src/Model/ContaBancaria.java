package Model;

public class ContaBancaria {
  String cliente;
  int numConta;
  float saldo;

  public String getCliente() {
    return cliente;
  }

  public void setCliente(String cliente) {
    this.cliente = cliente;
  }

  public int getNumConta() {
    return numConta;
  }

  public void setNumConta(int numConta) {
    this.numConta = numConta;
  }

  public float getSaldo() {
    return saldo;
  }

  public void setSaldo(float saldo) {
    this.saldo = saldo;
  }

  public void depositar(float valor) {
    this.saldo += valor;
  }

  public void sacar(float valor) {
    if (this.saldo >= valor) {
      this.saldo -= valor;
    } else {
      throw new RuntimeException("Saldo insuficiente");
    }
  }
}
