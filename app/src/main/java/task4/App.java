package task4;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Represents an application for task 4: Order in the Animal Kingdom.
 */
public class App {
  /**
   * Creates an array list of Animal objects, sorts them in lexicographical order (latin name)
   * and prints their information in two different ways.
   */
  public static void main(String[] args) {
    try {
      ArrayList<Animal> animals = new ArrayList<>();
      animals.add(new Bird("canada goose", "Branta canadensis", 3.9, "Honk honk honk", true, true, "the ground"));
      animals.add(new Mammal("grizzly bear", "Ursus arctos horribilis", 270.0, "Roaaar!", "brown", true));
      animals.add(new Reptile("black mamba", "Dendroaspis polylepis", 1.03,
          "Zzzzzzzzz", "dry lowlands", true));
      animals.add(new Bird("southern brown kiwi", "Apteryx australis", 2.8, "Trrr trrr trrr",
          false, false, "the ground"));
      animals.add(new Mammal("lion", "Panthera leo", 160.0, "Roaaar!", "yellow", false));
      animals.add(new Reptile("komodo dragon", "Varanus komodoensis", 70.0, "Tsssssss", "dry lowlands", true));
  
      Collections.sort(animals);
  
      // Printing information using instanceof and downcasting
      System.out.println("--------------- instanceof/downcasting ---------------");
      for (Animal a : animals) {
        String text = a.getLatinName();
        if (a instanceof Bird) {
          Bird bird = (Bird) a;
          text += " lays its eggs on/in " + bird.getNestType();
        } else if (a instanceof Mammal) {
          Mammal mammal = (Mammal) a;
          text += " has a fur that is " + mammal.getFurColor();
        } else if (a instanceof Reptile) {
          Reptile reptile = (Reptile) a;
          text += " lives in " + reptile.getHabitat();
        }
        System.out.println(text);
      }

      // Printing information using toString()
      System.out.println("--------------- toString() ---------------");
      for (Animal a : animals) {
        System.out.println(a);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
