package oppgave1;

/** Øving6 - oppgave 1. */

public class Main {

  /** Generates 1000 random numbers and prints the frequencies. */
  public static void main(String[] args) {
    java.util.Random random = new java.util.Random();
    int[] amount = new int[10];

    for (int i = 0; i < 1000; i++) {
      amount[random.nextInt(10)]++;
    }

    for (int i = 0; i < amount.length; i++) {
      System.out.println(i + ": " + amount[i]);
    }
  }
}
