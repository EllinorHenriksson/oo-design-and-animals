package aSinglePlanet;

/**
 * A program for the planet task.
 */
public class App {
  /**
   * Instantiates two Planet objects and prints their information.
   */
  public static void main(String[] args) {
    Planet earth = new Planet("Earth", 3, 1, 152097701, 147098074);
    Planet mars = new Planet("Mars", 4, 2, 249209300, 206669000);

    System.out.println(earth);
    System.out.println(mars);
  }
}