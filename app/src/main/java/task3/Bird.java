package task3;

/**
 * Represents a bird.
 */
public class Bird extends Animal {
  private boolean isMigrant;
  private boolean canFly;
  private String nestType;

  /**
   * Initializing constructor.
   *
   * @param name The name of the bird.
   * @param latinName The latin name of the bird.
   * @param weight The weight of the bird.
   * @param sound The sound of the bird.
   * @param isMigrant True if the bird is migrant.
   * @param canFly True if the bird can fly.
   * @param nestType The nest type of the bird.
   */
  public Bird(String name, String latinName, double weight, String sound, boolean isMigrant, boolean canFly, String nestType) {
    super(name, latinName, weight, sound);
    this.isMigrant = isMigrant;
    this.canFly = canFly;
    setNestType(nestType);
  }

  /**
   * Checks if the bird is migrant.
   *
   * @return True if it is.
   */
  public boolean isMigrant() {
    return isMigrant;
  }

  /**
   * Checks if the bird can fly.
   *
   * @return True if it can.
   */
  public boolean canFly() {
    return canFly;
  }

  /**
   * Gets the nest type of the bird.
   *
   * @return The nest type.
   */
  public String getNestType() {
    return nestType;
  }

  /**
   * Sets the nest type of the bird.
   *
   * @param nestType The nest type (must not be null or shorter than 2 characters, or it will be set to 'Invalid').
   */
  public void setNestType(String nestType) {
    if (nestType == null || nestType.length() < 2) {
      System.out.println("Invalid nest type, will be set to 'Invalid'.");
      this.nestType = "Invalid";
    } else {
      this.nestType = nestType;
    }
  }

  /**
   * Returns a string representing the sound the bird makes.
   * 
   * @return A string of the sound.
   */
  @Override
  public String makeSound() {
    return "A " + super.getName() + " tweets: " + sound; 
  }

  /**
   * Returns a string representing the bird.
   *
   * @return A string representation.
   */
  @Override
  public String toString() {
      return super.toString() 
          + "\nIs migrant: " + isMigrant
          + "\nCan fly: " + canFly
          + "\nNest type: " + nestType;
  }
}
