import javax.swing.JOptionPane;

/**
 * The starting point of my program.
 */
public class Oppgave1 {
  /**
   * Prompts the user to write a year, then runs the isLeapYear method and prints the result.
   */
  public static void main(String[] args) {
    int inputYear = Integer.parseInt(JOptionPane.showInputDialog("Write a year"));
    String output = (isLeapYear(inputYear)) ? " is a leap year" : " is not a leap year";
    System.out.println(inputYear + output);
  }

  /**
   * Check if the year is a leap year.
   */
  public static boolean isLeapYear(int year) {
    final boolean isDivBy4 = year % 4 == 0;
    final boolean isDivBy100 = year % 100 == 0;
    final boolean isDivBy400 = year % 400 == 0;
    return (isDivBy4 && (!isDivBy100 || isDivBy400));
  }
}
