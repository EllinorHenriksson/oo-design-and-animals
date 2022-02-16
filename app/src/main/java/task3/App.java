package task3;

/**
 * Represents an application for task 3: The Animal Kingdom.
 */
public class App {
  /**
   * Instantiates one Bird, one Mammal and one Reptile object and prints their information in three different ways.
   */
  public static void main(String[] args) {
    try {
      Bird canadaGoose = new Bird("Canada goose", "Branta canadensis", 3.9, "Honk honk honk", true, true, "On ground");
      Mammal grizzlyBear = new Mammal("Grizzly bear", "Ursus arctos horribilis", 270.0, "Roaaar!", "Brown", true);
      Reptile blackMamba = new Reptile("Black mamba", "Dendroaspis polylepis", 1.03, "Zzzzzzzzz", "Dry lowlands", true);

      Animal[] animals = {canadaGoose, grizzlyBear, blackMamba};

      // Printing information using toString().
      System.out.println("--------------- toString() ---------------");
      for (Animal a : animals) {
        System.out.println(a + "\n");
      }

      // Printing information using getters.
      System.out.println("--------------- getters ---------------");
      System.out.println(getGeneralInfo(canadaGoose) + getSpecificInfo(canadaGoose) + "\n");
      System.out.println(getGeneralInfo(grizzlyBear) + getSpecificInfo(grizzlyBear) + "\n");
      System.out.println(getGeneralInfo(blackMamba) + getSpecificInfo(blackMamba) + "\n");
      
      // Using method makeSound().
      System.out.println("--------------- makeSound() ---------------");
      for (Animal a : animals) {
        System.out.println(a.makeSound());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * Returns a string representing an Animal object.
   *
   * @param a The Animal object.
   * @return A string representation.
   */
  private static String getGeneralInfo(Animal a) {
    return a.getName() + " (" + a.getLatinName() 
      + "):\n  Weight: " + a.getWeight() + "kg"
      + "\n  Sound: " + a.getSound();
  }

  /**
   * Returns a string representing a Bird object's specific attributes.
   *
   * @param b The Bird object.
   * @return A string representation.
   */
  private static String getSpecificInfo(Bird b) {
    return "\n  Is migrant: " + b.isMigrant()
        + "\n  Can fly: " + b.canFly()
        + "\n  Nest type: " + b.getNestType();
  }

  /**
   * Returns a string representing a Mammal object's specific attributes.
   *
   * @param m The Mammal object.
   * @return A string representation.
   */
  private static String getSpecificInfo(Mammal m) {
    return "\n  Fur color: " + m.getFurColor()
        + "\n  Has winter fur: " + m.hasWinterFur();
  }

  /**
   * Returns a string representing a Reptile object's specific attributes.
   *
   * @param r The Reptile object.
   * @return A string representation.
   */
  private static String getSpecificInfo(Reptile r) {
    return "\n  Habitat: " + r.getHabitat()
        + "\n  Is poisonous: " + r.isPoisonous();
  }
}
