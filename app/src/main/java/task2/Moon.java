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
   * @param name The name of the moon.
   * @param kmSize The diameter of the moon (in km).
   */
  public Moon(String name, int kmSize) {
    setName(name);
    setSizeInKm(kmSize);
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
   * Sets the name of the moon.
   *
   * @param newName The name (must not be null or shorter than 2 characters, or an exception will be thrown).
   */
  public void setName(String newName) {
    if (newName == null || newName.length() < 2) {
      throw new IllegalArgumentException("Invalid moon name, must not be null or shorter than 2 characters.");
    } else {
      name = newName;
    }
  }

  /**
   * Gets the diameter of the moon (in km).
   *
   * @return The diameter.
   */
  public int getSizeInKm() {
    return kmSize;
  }

  /**
   * Sets the diameter of the moon (in km).
   *
   * @param newKmSize The diameter (must be larger than 0, or an exception will be thrown).
   */
  public void setSizeInKm(int newKmSize) {
    if (newKmSize > 0) {
      kmSize = newKmSize;
    } else {
      throw new IllegalArgumentException("Invalid diameter, must be larger than 0.");
    }
  }
}
