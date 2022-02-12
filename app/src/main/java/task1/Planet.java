package task1;

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
   * @param name The name.
   * @param position The position.
   * @param noOfMoons The number of moons.
   * @param aphelion The aphelion.
   * @param perihelion The perihelion.
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
   * @param newName The name (must not be null or shorter than 2 characters, or it will be set to 'Invalid').
   */
  public void setName(String newName) {
    if (newName == null || newName.length() < 2) {
      System.out.println("Invalid planet name, will be set to 'Invalid'.");
      this.name = "Invalid";
    } else {
      name = newName;
    }
  }

  /**
   * Gets the position of the planet.
   *
   * @return The position.
   */
  public int getPosition() {
    return position;
  }

  /**
   * Sets the position of the planet.
   *
   * @param newPos The position (must be 1-9, or it will be set to 0).
   */
  public void setPosition(int newPos) {
    if (newPos > 0 && newPos < 10) {
      position = newPos;
    } else {
      System.out.println("Invalid planet position, will be set to 0.");
      position = 0;
    }
  }

  /**
   * Gets the number of moons of the planet.
   *
   * @return The number of moons.
   */
  public int getNoOfMoons() {
    return noOfMoons;
  }

  /**
   * Sets the number of moons of the planet.
   *
   * @param newCount The number of moons (must be 0 or more, or it will be set to 0).
   */
  public void setNoOfMoons(int newCount) {
    if (newCount < 0) {
      System.out.println("Invalid number of moons, will be set to 0.");
      noOfMoons = 0;
    } else {
      noOfMoons = newCount;
    }
  }

  /**
   * Gets the aphelion of the planet.
   *
   * @return The aphelion.
   */
  public int getAphelion() {
    return aphelion;
  }

  /**
   * Sets the aphelion of the planet.
   *
   * @param newAphelion The aphelion (must be larger than 0, or it will be set to 0).
   */
  public void setAphelion(int newAphelion) {
    if (newAphelion > 0) {
      aphelion = newAphelion;
    } else {
      System.out.println("Invalid aphelion, will be set to 0.");
      aphelion = 0;
    }
  }

  /**
   * Gets the perihelion of the planet.
   *
   * @return The perihelion.
   */
  public int getPerihelion() {
    return perihelion;
  }

  /**
   * Sets the perihelion of the planet.
   *
   * @param newPerihelion The perihelion (must be larger than 0, or it will be set to 0).
   */
  public void setPerihelion(int newPerihelion) {
    if (newPerihelion > 0) {
      perihelion = newPerihelion;
    } else {
      System.out.println("Invalid perihelion, will be set to 0.");
      perihelion = 0;
    }
  }
}
