import javax.swing.JOptionPane;

/**
 * The starting point of my program.
 */

public class Oppgave2 {

  /** Prompts the user to write a number and prints if it is prime or not. */
  public static void main(String[] args) {
    while (true) {
      String input = JOptionPane.showInputDialog("Write a number.");
      try {
        Integer.parseInt(input);

        int number = Integer.parseInt(input);
        String output = (isItPrime(number)) ? "Your number is prime" : "Your number is not prime";
        System.out.println(output);
      } catch (NumberFormatException e) {
        System.out.println("You should have written a number");
        break;
      }
    }
  }

  /** Returns the multiplication table of the number. */
  public static boolean isItPrime(int number) {
    if (number < 2) {
      return false;
    }
    for (int i = 2; i <= (int) Math.sqrt(number); i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }
}