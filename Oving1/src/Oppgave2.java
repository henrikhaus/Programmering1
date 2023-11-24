package src;

/**
 * The starting point of my program.
 */
public class Oppgave2 {
  /**
   * Converts the hours, minutes and seconds in the dataset to seconds and then prints the results.
   */
  public static void main(String[] args) {
    // Dataset with hours, minutes and seconds.
    int[][] dataset = { { 5, 2, 47 }, { 4, 10, 58 }, { 1, 42, 0 }, { 0, 20, 30 }, { 2, 10, 5 } };
    for (var i = 0; i < dataset.length; i++) {
      System.out.println(convertToSeconds(dataset[i][0], dataset[i][1], dataset[i][2]));
    }
  }

  public static int convertToSeconds(int hours, int minutes, int seconds) {
    int totalSeconds = hours * 3600 + minutes * 60 + seconds;
    return totalSeconds;
  }
}
