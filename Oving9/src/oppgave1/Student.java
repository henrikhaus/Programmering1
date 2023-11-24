package oppgave1;

public class Student {
  private final String navn;
  private int antOppg;

  public Student(String navn) {
    this.navn = navn;
    this.antOppg = 0;
  }

  public String getNavn() {
    return navn;
  }

  public int getAntOppg() {
    return antOppg;
  }

  public void okAntallOppg(int antall) {
    antOppg += antall;
  }

  public String toString() {
    return navn + ": " + antOppg;
  }
}
