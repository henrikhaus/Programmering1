import javax.swing.JOptionPane;

/**
 * The starting point of my program.
 */

public class Oppgave1 {

  /**
   * Prompts the user to write a number and which part of the multiplication table
   * to print.
   */
  public static void main(String[] args) {
    int first = Integer.parseInt(JOptionPane.showInputDialog("First number to multiply"));
    int last = Integer.parseInt(JOptionPane.showInputDialog("Last number to multiply"));
    System.out.println(multiplicationTable(first, last));
  }

  /** Returns the multiplication table of the number. */
  public static String multiplicationTable(int first, int last) {
    String text = "";
    for (int i = first; i <= last; i++) {
      for (int j = 1; j <= 10; j++) {
        text += j + " x " + (i) + " = " + j * (i) + "\n";
      }
    }
    return text;
  }
}
