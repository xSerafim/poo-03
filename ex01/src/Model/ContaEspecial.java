package Model;

public class ContaEspecial extends ContaBancaria {
  float limite;

  public float getLimite() {
    return limite;
  }

  public void setLimite(float limite) {
    this.limite = limite;
  }

  @Override
  public void sacar(float valor) {
    if (this.saldo + this.limite >= valor) {
      this.saldo -= valor;
    } else {
      throw new RuntimeException("Saldo insuficiente");
    }
  }
}
