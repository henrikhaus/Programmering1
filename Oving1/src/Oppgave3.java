package src;

/**
 * The starting point of my program.
 */
public class Oppgave3 {
  /**
   * Converts the seconds in the dataset to hours, minutes and seconds. hen prints the results.
   */
  public static void main(String[] args) {
    // Dataset with seconds.
    int[] dataset = { 4002, 2140, 15009, 35390, 51359, 12349, 424, 42895, 294 };
    for (var i = 0; i < dataset.length; i++) {
      int[] time = secondsToHoursMinutesSeconds(dataset[i]);
      System.out.println(time[0] + " hours, " + time[1] + " minutes and " + time[2] + " seconds.");
    }
  }

  /**
   * Converter method. Returns array of hours, minutes, seconds.
   */
  public static int[] secondsToHoursMinutesSeconds(int totalSeconds) {
    int hours = totalSeconds / 3600;
    int minutes = (totalSeconds % 3600) / 60;
    int seconds = totalSeconds % 60;
    return new int[] { hours, minutes, seconds };
  }
}