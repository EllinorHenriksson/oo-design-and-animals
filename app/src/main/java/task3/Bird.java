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
   * @param name - The name of the bird.
   * @param latinName - The latin name of the bird.
   * @param weight - The weight of the bird.
   * @param sound - The sound of the bird.
   * @param isMigrant - True if bird is migrant.
   * @param canFly - True if bird can fly.
   * @param nestType - The nest type of the bird.
   */
  public Bird(String name, String latinName, double weight, String sound, boolean isMigrant, boolean canFly, String nestType) {
    super(name, latinName, weight, sound);
    this.isMigrant = isMigrant;
    this.canFly = canFly;
    setNestType(nestType);
  }

  /**
   * Gets if the bird is migrant.
   *
   * @return True if migrant.
   */
  public boolean getIsMigrant() {
    return isMigrant;
  }

  /**
   * Gets if the bird can fly.
   *
   * @return True if able to fly.
   */
  public boolean getCanFly() {
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
   * @param newNestType - The nest type (must not be null or shorter than 2 characters, or 'nestType' will be set to 'Invalid').
   */
  public void setNestType(String newNestType) {
    if (newNestType == null || newNestType.length() < 2) {
      System.out.println("Invalid nest type, will be set to 'Invalid'.");
    } else {
      nestType = newNestType;
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
}
