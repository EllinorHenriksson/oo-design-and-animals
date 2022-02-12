package task2;

/**
 * Represents an application for task 2: Planets with Moons.
 */
public class App {
  /**
   * Instantiates two Planet objects and respective Moon objects, adds moons and prints information.
   */
  public static void main(String[] args) {
    Planet earth = new Planet("Earth", 3, 1, 152097701, 147098074);
    earth.addMoon(new Moon("The moon", 3474));

    Planet mars = new Planet("Mars", 4, 2, 249209300, 206669000);
    mars.addMoon(new Moon("Phobos", 22));
    mars.addMoon(new Moon("Deimos", 12));

    Planet[] planets = {earth, mars};

    for (Planet p : planets) {
      System.out.println("The planet is called " + p.getName() + " and has the following moons:");
      Moon[] moons = p.getMoons();
      for (int i = 0; i < moons.length; i++) {
        System.out.println("  Moon " + (i + 1) + " is called " + moons[i].getName()
            + " (" + moons[i].getSizeInKm() + "km)");
      }
      System.out.println("\n");
    }
  }
}
