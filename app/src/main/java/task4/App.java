package task4;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Represents an application for task 4: Order in the Animal Kingdom.
 */
public class App {
  /**
   * Creates an array list of Animal objects, sorts them in 
   * lexicographical order (latin name) and prints their information.
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
  
      for (Animal a : animals) {
        System.out.println(a.toString());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
