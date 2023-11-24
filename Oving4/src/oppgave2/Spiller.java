package oppgave2;

public class Spiller {
  public String navn;
  public int poeng;

  public Spiller(String navn, int poeng) {
    this.navn = navn;
    this.poeng = poeng;
  }

  public static int kastTerning() {
    java.util.Random terning = new java.util.Random();

    return terning.nextInt(1, 6);
  }
}
