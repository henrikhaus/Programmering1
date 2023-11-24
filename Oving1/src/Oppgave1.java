package src;

/**
 * The starting point of my program.
 */
public class Oppgave1 {
  /**
   * Runs the dataset through the inchToCm method and prints the results.
   */
  public static void main(String[] args) {
    // Dataset with inches.
    double[] dataset = { 1, 0.4f, 3, 4.4f, 5, 6.1f };

    for (var i = 0; i < dataset.length; i++) {
      System.out.println(inchToCm(dataset[i]));
    }
  }

  public static double inchToCm(double inches) {
    return inches * 2.54;
  }
}