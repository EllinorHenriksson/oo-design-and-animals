package task3;

/**
 * Represents a mammal.
 */
public class Mammal extends Animal {
  private String furColor;
  private boolean hasWinterFur;

  /**
   * Initializing constructor.
   *
   * @param name The name of the mammal.
   * @param latinName The latin name of the mammal.
   * @param weight The weight of the mammal.
   * @param sound The sound of the mammal.
   * @param furColor The fur color of the mammal.
   * @param hasWinterFur True if the mammal has winter fur.
   */
  public Mammal(String name, String latinName, double weight, String sound, String furColor, boolean hasWinterFur) {
    super(name, latinName, weight, sound);
    setFurColor(furColor);
    this.hasWinterFur = hasWinterFur;
  }

  /**
   * Gets the fur color of the mammal.
   *
   * @return The fur color.
   */
  public String getFurColor() {
    return furColor;
  }

  /**
   * Sets the fur color of the mammal.
   *
   * @param furColor The fur color (must not be null or shorter than 2 characters, or it will be set to 'Invalid').
   */
  public void setFurColor(String furColor) {
    if (furColor == null || furColor.length() < 2) {
      System.out.println("Invalid fur color, will be set to 'Invalid'.");
      this.furColor = "Invalid";
    } else {
      this.furColor = furColor;
    }
  }

  /**
   * Checks if the mammal has winter fur.
   *
   * @return True if it does.
   */
  public boolean hasWinterFur() {
    return hasWinterFur;
  }

  /**
   * Returns a string representing the sound the mammal makes.
   *
   * @return A string of the sound.
   */
  @Override
  public String makeSound() {
    return "A " + super.getName() + " says: " + sound;
  }

  /**
   * Returns a string representing the mammal.
   *
   * @return A string representation.
   */
  @Override
  public String toString() {
    return super.toString()
        + "\n  Fur color: " + furColor
        + "\n  Has winter fur: " + hasWinterFur;
  }
}
