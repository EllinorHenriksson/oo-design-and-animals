package assignment2;

/**
 * Represents a planet.
 */
public class Planet {
  private String name;
  private int position;
  private int noOfMoons;
  private int aphelion;
  private int perihelion;

  /**
   * Initializing constructor.
   *
   * @param name       - The name.
   * @param position   - The position.
   * @param noOfMoons  - The number of moons.
   * @param aphelion   - The aphelion.
   * @param perihelion - The perihelion.
   */
  public Planet(String name, int position, int noOfMoons, int aphelion, int perihelion) {
    setName(name);
    setPosition(position);
    setNoOfMoons(noOfMoons);
    setAphelion(aphelion);
    setPerihelion(perihelion);
  }

  /**
   * Gets the name of the planet.
   *
   * @return The name.
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the name of the planet.
   *
   * @param name - The name (must be at least 2 characters long, or 'name' will be set to 'Invalid').
   */
  public void setName(String name) {
    if (name == null || name.length() < 2) {
      System.out.println("Invalid planet name, will be set to 'Invalid'.");
      this.name = "Invalid";
    } else {
      this.name = name;
    }
  }

  /**
   * Gets the position of the planet.
   *
   * @return The position.
   */
  public int getPosition() {
    return this.position;
  }

  /**
   * Sets the position of the planet.
   *
   * @param position - The position (must be 1-9, or 'position' will keep its default value 0).
   */
  public void setPosition(int position) {
    if (position > 0 && position < 10) {
      this.position = position;
    } else {
      System.out.println("Invalid planet position, will be set to 0.");
    }
  }
}
