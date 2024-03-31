package Model;

public class ContaPoupanca extends ContaBancaria {
  int diaRendimento;

  public int getDiaRendimento() {
    return diaRendimento;
  }

  public void setDiaRendimento(int diaRendimento) {
    this.diaRendimento = diaRendimento;
  }

  public void calcularNovoSaldo(float taxa) {
    this.saldo += this.saldo * taxa;
  }

  public float calcularRendimento(float taxa) {
    return this.saldo * (1 + (taxa / 100));
  }
}
