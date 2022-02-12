package task3;

/**
 * Represents an animal.
 */
public abstract class Animal {
  private String name;
  private String latinName;
  private double weight;
  protected String sound;

  /**
   * Initializing constructor.
   *
   * @param name - The name of the animal.
   * @param latinName - The latin name of the animal.
   * @param weight - The weight of the animal.
   * @param sound - The sound of the animal.
   */
  Animal(String name, String latinName, double weight, String sound) {
    setName(name);
    setLatinName(latinName);
    setWeight(weight);
    setSound(sound);
  }

  /**
   * Gets the name of the animal.
   *
   * @return The name.
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the name of the animal.
   *
   * @param newName - The name (must not be null or shorter than 2 characters, or 'name' will be set to 'Invalid').
   */
  public void setName(String newName) {
    if (newName == null || newName.length() < 2) {
      System.out.println("Invalid name, will be set to 'Invalid'.");
      name = "Invalid";
    } else {
      name = newName;
    }
  }


  /**
   * Gets the latin name of the animal.
   *
   * @return The latin name.
   */
  public String getLatinName() {
    return latinName;
  }

  /**
   * Sets the latin name of the animal. 
   *
   * @param newLatinName - The latin name (must not be null or shorter than 2 characters, or 'latinName' will be set to 'Invalid').
   */
  public void setLatinName(String newLatinName) {
    if (newLatinName == null || newLatinName.length() < 2) {
      System.out.println("Invalid latin name, will be set to 'Invalid'.");
      latinName = "Invalid";
    } else {
      latinName = newLatinName;
    }
  }

  /**
   * Gets the weight of the animal.
   *
   * @return The weight.
   */
  public double getWeight() {
    return weight;
  }

/**
 * Sets the weight of the animal.
 *
 * @param newWeight - The weight (must be larger than 0, or 'weight' will be set to 0.0).
 */
  public void setWeight(double newWeight) {
    if (newWeight > 0.0) {
      weight = newWeight;
    } else {
      System.out.println("Weight must be larger than zero, will be set to 0.0.");
      weight = 0.0;
    }
  }

  /**
   * Gets the sound of the animal.
   *
   * @return The sound.
   */
  public String getSound() {
    return sound;
  }

  /**
   * Sets the sound of the animal.
   *
   * @param newSound - The sound (if null, 'sound' will be set to '*silent*').
   */
  public void setSound(String newSound) {
    if (newSound == null) {
      System.out.println("No sound was given, will be set to '*silent*'.");
      sound = "*silent*";
    } else {
      sound = newSound;
    }
  }

  public abstract String makeSound();
}
