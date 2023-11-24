package oppgave1;

import java.util.Scanner;

/** The starting point of my program. */

public class Main {

  /** Brukeren velger valuta og konverterer et beløp fra/til norkse kroner. */
  public static void main(String[] args) {

    Valuta dollar = new Valuta("Dollar", 10.77);
    Valuta euro = new Valuta("Euro", 11.51);
    Valuta pund = new Valuta("Pund", 13.33);
    Valuta[] valutaer = new Valuta[3];

    valutaer[0] = dollar;
    valutaer[1] = euro;
    valutaer[2] = pund;

    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Velg valuta \n1: Dollar \n2: Euro \n3: Pund \n4: Avslutt");

      int valgtValuta = scanner.nextInt();

      if (valgtValuta == 4) {
        break;
      } else if (valgtValuta > 4 || valgtValuta < 1) {
        System.out.println("Velg et gyldig tall");
        continue;
      }

      int valgtMetode = 0;
      while (!(valgtMetode == 1 || valgtMetode == 2)) {
        System.out.println("1: Konverter til NOK \n2: Konverter fra NOK");
        valgtMetode = scanner.nextInt();
      }

      System.out.println("Skriv inn beløp");
      double valgtBelop = scanner.nextDouble();

      if (valgtMetode == 1) {
        double konvertertTall = Valuta.konverterTilNOK(valutaer[valgtValuta - 1].kurs, valgtBelop);
        System.out.println(valgtBelop + " " + valutaer[valgtValuta - 1].navn + " er det samme som "
            + konvertertTall + " norske kroner.");
      } else {
        double konvertertTall = Valuta.konverterFraNOK(valutaer[valgtValuta - 1].kurs, valgtBelop);
        System.out.println(valgtBelop + " norske kroner er det samme som " + konvertertTall + " "
            + valutaer[valgtValuta - 1].navn);
      }
    }
    scanner.close();
  }
}