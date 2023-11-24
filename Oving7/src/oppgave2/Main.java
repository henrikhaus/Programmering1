package oppgave2;

public class Main {
  public static void main(String[] args) {
    Tekstbehandling tekst = new Tekstbehandling("Hei på deg! Hvordan går det?");

    tekst.byttOrd("det", "livet");

    System.out.println("Antall ord: " + tekst.antallOrd());
    System.out.println("Gjennomsnittlig ordlengde: " + tekst.gjennomsnittligOrdlengde());
    System.out.println("Gjennomsnittlig antall ord per periode: " + tekst.gjennomsnittAntallOrdPerPeriode());
    System.out.println("Tekst: " + tekst.tekst());
    System.out.println("Tekst med store bokstaver: " + tekst.tekstStoreBokstaver());
  }
}
