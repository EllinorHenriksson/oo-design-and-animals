package task3;

public class App {
  public static void main(String[] args) {
    Bird canadaGoose = new Bird("Canada goose", "Branta canadensis", 3.9, "Honk honk honk", true, true, "On ground");
    Mammal grizzlyBear = new Mammal("Grizzly bear", "Ursus arctos horribilis", 270.0, "Roaaar!", "Brown", true);
    Reptile blackMamba = new Reptile("Black mamba", "Dendroaspis polylepis", 1.03, "Zzzzzzzzz", "Dry lowlands", true);

    Animal[] animals = {canadaGoose, grizzlyBear, blackMamba};
    for (Animal a : animals) {
      System.out.println(a.toString());
      System.out.println(a.makeSound());
    }
  }
}
