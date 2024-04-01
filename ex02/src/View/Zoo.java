package View;

import java.util.ArrayList;
import java.util.List;

import Model.Animal;
import Model.Mamifero;
import Model.Peixe;

public class Zoo {
  public static void main(String[] args) {
    List<Animal> animais = new ArrayList<>();

    Animal camelo = new Animal();
    camelo.setNome("Camelo");
    camelo.setComprimento(150);
    camelo.setPatas(4);
    camelo.setCor("Amarelo");
    camelo.setAmbiente("Terra");
    camelo.setVelocidade(2.0f);

    Mamifero ursoCanada = new Mamifero();
    ursoCanada.setNome("Urso-do-canadá");
    ursoCanada.setComprimento(180);
    ursoCanada.setPatas(4);
    ursoCanada.setCor("Vermelho");
    ursoCanada.setAmbiente("Terra");
    ursoCanada.setVelocidade(0.5f);
    ursoCanada.setAlimento("Mel");

    Peixe tubarao = new Peixe();
    tubarao.setNome("Tubarão");
    tubarao.setComprimento(300);
    tubarao.setPatas(0);
    tubarao.setCor("Cinzento");
    tubarao.setAmbiente("Mar");
    tubarao.setVelocidade(1.5f);
    tubarao.setCaracteristica("Barbatanas e cauda");

    animais.add(camelo);
    animais.add(tubarao);
    animais.add(ursoCanada);

    for (Animal animal : animais) {
      System.out.println(animal.dados());
      System.out.println("--------------------");
    }
  }
}
