/**
 * The starting point of my program.
 */
public class Oppgave2 {
  /**
   * Sjekker hvilken kjøttdeig som er billigst per gram.
   */
  public static void main(String[] args) {
    double kjottdeigA = 35.90 / 450;
    double kjottdeigB = 39.50 / 500;

    String billigstKjottdeig = kjottdeigA < kjottdeigB ? "Kjøttdeig A" : "Kjøttdeig B";
    System.out.println(billigstKjottdeig + " er billigst.");
  }
}