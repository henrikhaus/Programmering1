package oppgave2;

public class Main {
  public static void main(String[] args) {

    Spiller spillerA = new Spiller("Henrik", 0);
    Spiller spillerB = new Spiller("Adrian", 0);
    int tur = 0;

    while (spillerA.poeng < 100 && spillerB.poeng < 100) {
      int terningkast = Spiller.kastTerning();
      Spiller spiller = (tur % 2 == 0) ? spillerA : spillerB;
      if (terningkast != 1) {
        spiller.poeng += terningkast;
      } else {
        spiller.poeng = 0;
      }

      System.out.println("Terningkast " + terningkast + "! " + spiller.navn + " har nå "
          + spiller.poeng + " poeng.");

      tur++;
    }
    System.out
        .println((spillerA.poeng > spillerB.poeng) ? spillerA + " vant!" : spillerB + " vant!");
  }
}