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
   * @param name The name of the animal.
   * @param latinName The latin name of the animal.
   * @param weight The weight of the animal.
   * @param sound The sound of the animal.
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
   * @param name The name (must not be null or shorter than 2 characters, or it will be set to 'Invalid').
   */
  public void setName(String name) {
    if (name == null || name.length() < 2) {
      System.out.println("Invalid name, will be set to 'Invalid'.");
      this.name = "Invalid";
    } else {
      this.name = name;
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
   * @param latinName The latin name (must not be null or shorter than 2 characters, or it will be set to 'Invalid').
   */
  public void setLatinName(String latinName) {
    if (latinName == null || latinName.length() < 2) {
      System.out.println("Invalid latin name, will be set to 'Invalid'.");
      this.latinName = "Invalid";
    } else {
      this.latinName = latinName;
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
   * @param weight The weight (must be larger than 0, or it will be set to 0.0).
   */
  public void setWeight(double weight) {
    if (weight > 0.0) {
      this.weight = weight;
    } else {
      System.out.println("Weight must be larger than zero, will be set to 0.0.");
      this.weight = 0.0;
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
   * @param sound The sound (if null, 'sound' will be set to '*silent*').
   */
  public void setSound(String sound) {
    if (sound == null) {
      System.out.println("No sound was given, will be set to '*silent*'.");
      this.sound = "*silent*";
    } else {
      this.sound = sound;
    }
  }

  public abstract String makeSound();

  /**
   * Returns a string representing the animal.
   *
   * @return A string representation.
   */
  @Override
  public String toString() {
    return name + " (" + latinName 
        + "):\n  Weight: " + weight + "kg"
        + "\n  Sound: " + sound;
  }
}
