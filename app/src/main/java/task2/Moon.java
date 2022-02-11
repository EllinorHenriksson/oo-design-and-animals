package task2;

/**
 * Represents a moon.
 */
public class Moon {
  private String name;
  private int kmSize;

  /**
   * Initializing constructor.
   *
   * @param name - The name of the moon.
   * @param kmSize - The diameter of the moon (in km).
   */
  public Moon(String name, int kmSize) {
    this.name = name;
    this.kmSize = kmSize;
  }

  /**
   * Gets the name of the moon.
   *
   * @return The name.
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the diameter of the moon (in km).
   *
   * @return The diameter.
   */
  public int getSizeInKm() {
    return kmSize;
  }
}
