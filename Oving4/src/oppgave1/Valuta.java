package oppgave1;

/** Valuta object og konverteringsmetoder. */
public class Valuta {
  public String navn;
  public double kurs;

  public Valuta(String navn, double kurs) {
    this.navn = navn;
    this.kurs = kurs;
  }

  public static double konverterTilNOK(double kurs, double belop) {
    return belop * kurs;
  }

  public static double konverterFraNOK(double kurs, double belop) {
    return belop / kurs;
  }
}
