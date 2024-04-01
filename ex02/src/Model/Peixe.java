package Model;

public class Peixe extends Animal {
  String caracteristica;

  public String getCaracteristica() {
    return caracteristica;
  }

  public void setCaracteristica(String caracteristica) {
    this.caracteristica = caracteristica;
  }

  @Override
  public String dados() {
    String dados = super.dados();
    return dados + "\nCaracteristica: " + getCaracteristica();
  }
}
