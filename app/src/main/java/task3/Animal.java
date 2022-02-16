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
   * @param name The name (must not be null or shorter than 2 characters, or an exception will be thrown).
   */
  public void setName(String name) {
    if (name == null || name.length() < 2) {
      throw new IllegalArgumentException("Invalid name, must not be null or shorter than 2 characters.");
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
   * @param latinName The latin name (must not be null or shorter than 2 characters, or an exception will be thrown).
   */
  public void setLatinName(String latinName) {
    if (latinName == null || latinName.length() < 2) {
      throw new IllegalArgumentException("Invalid latin name, must not be null or shorter than 2 characters.");
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
   * @param weight The weight (must be larger than 0, or an exception will be thrown).
   */
  public void setWeight(double weight) {
    if (weight > 0.0) {
      this.weight = weight;
    } else {
      throw new IllegalArgumentException("Weight must be larger than 0.0.");
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
   * @param sound The sound (must not be null, or an exception will be thrown).
   */
  public void setSound(String sound) {
    if (sound == null) {
      throw new IllegalArgumentException("Sound must not be null.");
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
