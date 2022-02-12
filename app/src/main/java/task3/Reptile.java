package task3;

/**
 * Represents a reptile.
 */
public class Reptile extends Animal {
  private String habitat;
  private boolean isPoisonous;

  /**
   * Initializing constructor.
   *
   * @param name The name of the reptile.
   * @param latinName The latin name of the reptile.
   * @param weight The weight of the reptile.
   * @param sound The sound of the reptile.
   * @param habitat The habitat of the reptile.
   * @param isPoisonous True if the reptile is poisonous.
   */
  public Reptile(String name, String latinName, double weight, String sound, String habitat, boolean isPoisonous) {
    super(name, latinName, weight, sound);
    setHabitat(habitat);
    this.isPoisonous = isPoisonous;
  }

  /**
   * Gets the habitat of the reptile.
   *
   * @return The habitat.
   */
  public String getHabitat() {
    return habitat;
  }

  /**
   * Sets the habitat of the reptile.
   *
   * @param habitat The habitat (if null or shorter than 2 characters, it will be set to 'Invalid').
   */
  public void setHabitat(String habitat) {
    if (habitat == null || habitat.length() < 2) {
      System.out.println("Invalid habitat, will be set to 'Invalid'.");
      this.habitat = habitat;
    } else {
      this.habitat = habitat;
    }     
  }

  /**
   * Checks if the reptile is poisonous.
   *
   * @return True if it is.
   */
  public boolean isPoisonous() {
    return isPoisonous;
  }

  /**
   * Returns a string representing the sound the reptile makes.
   *
   * @return A string of the sound.
   */
  @Override
  public String makeSound() {
    return "A " + super.getName() + " hizzes: " + sound;
  }

  /**
   * Returns a string representing the mammal.
   *
   * @return A string representation.
   */
  @Override
  public String toString() {
    return super.toString()
        + "\n  Habitat: " + habitat
        + "\n  Is poisonous: " + isPoisonous;
  }
}
