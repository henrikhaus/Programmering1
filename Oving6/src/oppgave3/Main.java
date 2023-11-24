package oppgave3;

public class Main {
  public static void main(String[] args) {

    Matrise matrise1 = new Matrise(new double[][] { { 1, 2 }, { 3, 4 }, { 5, 6 } });
    Matrise matrise2 = new Matrise(new double[][] { { 2, 2, 2 }, { 2, 2, 2 } });

    printMatrise(matrise1.multipliserMatrise(matrise2));
  }

  static void printMatrise(Matrise matrise) {
    String output = "";
    for (int i = 0; i < matrise.rekker; i++) {
      for (int j = 0; j < matrise.kolonner; j++)
        output += matrise.matrise[i][j] + " ";
      output += "\n";
    }
    System.out.println(output);
  }
}
