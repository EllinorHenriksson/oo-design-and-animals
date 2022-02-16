package task1;

/**
 * Represents an application for task 1: A Single Planet.
 */
public class App {
  /**
   * Instantiates two Planet objects and prints their information.
   */
  public static void main(String[] args) {
    try {
      Planet[] planets = new Planet[2];
      planets[0] = new Planet("Earth", 3, 1, 152097701, 147098074);
      planets[1] = new Planet("Mars", 4, 2, 249209300, 206669000);
  
      for (Planet p : planets) {
        String representation = p.getName()
            + ":\n  Position: " + p.getPosition()
            + "\n  Moons: " + p.getNoOfMoons()
            + "\n  Aphelion: " + p.getAphelion() + " km"
            + "\n  Perihelion: " + p.getPerihelion() + " km";
        System.out.println(representation + "\n");
      }
    } catch (Exception e) {
      System.out.println(e);
      e.printStackTrace();
    }
  }
}