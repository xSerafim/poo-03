package Model;

public class Mamifero extends Animal {
  String alimento;

  public String getAlimento() {
    return alimento;
  }

  public void setAlimento(String alimento) {
    this.alimento = alimento;
  }

  @Override
  public String dados() {
    String dados = super.dados();
    return dados + "\nAlimento: " + getAlimento();
  }
}
