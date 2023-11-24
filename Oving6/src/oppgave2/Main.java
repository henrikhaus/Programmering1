package oppgave2;

import java.util.Scanner;

public class Main {

  static String alfabet = "abcdefghijklmnopqrstuvwxyzæøå";

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    while (true) {
      int antallTegn[] = new int[30];
      String output = "";
      int antallUlikeBokstaver = 0;
      int totaltAntallBokstaver = 0;
      int prosentIkkeBokstaver = 0;
      int mestBrukteBokstavIndex = 0;
      String mestBrukteBokstav = "";

      System.out.println("Skriv et ord");
      String input = scanner.nextLine().toLowerCase();

      if (input.isEmpty())
        break;

      // Sett verdier i antallTegn
      for (int i = 0; i < input.length(); i++) {
        char tegn = input.charAt(i);
        int tegnIndex = alfabet.indexOf(tegn);
        if (tegnIndex < 0)
          tegnIndex = 29;
        antallTegn[tegnIndex]++;
      }

      // Gjør operasjoner med antallTegn
      for (int i = 0; i < antallTegn.length - 1; i++) {
        if (antallTegn[i] > 0) {
          antallUlikeBokstaver++;
          totaltAntallBokstaver += antallTegn[i];

          // Finn mest brukte bokstav
          if (antallTegn[i] > antallTegn[mestBrukteBokstavIndex] || (i == 0 && antallTegn[0] > 0)) {
            mestBrukteBokstavIndex = i;
            mestBrukteBokstav = String.valueOf(alfabet.charAt(i));
          } else if (antallTegn[i] == antallTegn[mestBrukteBokstavIndex]
              && alfabet.charAt(i) != alfabet.charAt(mestBrukteBokstavIndex)) {
            mestBrukteBokstav += " og " + alfabet.charAt(i);
          }
        }
      }
      prosentIkkeBokstaver = (int) Math.round((antallTegn[29] / (float) input.length()) * 100);

      output = "Antall forskjellige bokstaver: " + antallUlikeBokstaver + "\n" +
          "Totalt antall bokstaver: " + totaltAntallBokstaver + "\n" +
          "Prosent som ikke er bokstaver: " + prosentIkkeBokstaver + "%\n" +
          "Mest brukte bokstaver: " + mestBrukteBokstav + "\n" +
          "Skriv en bokstav for å se antall forekomster";
      System.out.println(output);

      // Forekomster av bokstav
      int forekomster = -1;
      String bokstavInput = "";
      while (forekomster < 0) {
        bokstavInput = scanner.nextLine();
        forekomster = forekomsterAvBokstav(bokstavInput, antallTegn);
        if (forekomster < 0)
          System.out.println("Skriv en gyldig bokstav");
      }
      System.out.println(bokstavInput + " forekommer " + forekomster + " ganger");
    }

    scanner.close();
  }

  static int forekomsterAvBokstav(String bokstav, int[] antallTegn) {
    if (bokstav.length() > 1 || bokstav.length() == 0)
      return -1;
    try {
      return antallTegn[alfabet.indexOf(bokstav)];
    } catch (Exception e) {
      return -1;
    }
  }
}
