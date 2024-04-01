package Model;

public class Animal {
  String nome;
  int comprimento;
  int patas;
  String cor;
  String ambiente;
  float velocidade;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getComprimento() {
    return comprimento;
  }

  public void setComprimento(int comprimento) {
    this.comprimento = comprimento;
  }

  public int getPatas() {
    return patas;
  }

  public void setPatas(int patas) {
    this.patas = patas;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public String getAmbiente() {
    return ambiente;
  }

  public void setAmbiente(String ambiente) {
    this.ambiente = ambiente;
  }

  public float getVelocidade() {
    return velocidade;
  }

  public void setVelocidade(float velocidade) {
    this.velocidade = velocidade;
  }

  public String dados() {
    return "Animal: " + getNome()
        + "\nComprimento: " + getComprimento() + " cm"
        + "\nPatas: " + getPatas()
        + "\nCor: " + getCor()
        + "\nAmbiente: " + getAmbiente()
        + "\nVelocidade: " + getVelocidade() + " m/s";
  }
}
