package oppgave2;

public class Tekstbehandling {
  private String tekst = "";
  private String tekstUtenSkilleTegn = "";
  private String[] ord;
  private String skilleTegn = ".!:?";

  public Tekstbehandling(String tekst) {
    this.tekst = tekst;
    this.tekstUtenSkilleTegn = tekst.replaceAll(skilleTegn, "");
    this.ord = tekstUtenSkilleTegn.split(" ");
  }

  public int antallOrd() {
    int antallOrd = ord.length;
    return antallOrd;
  }

  public double gjennomsnittligOrdlengde() {
    double gjennomsnitt = 0;

    for (int i = 0; i < ord.length; i++) {
      gjennomsnitt += ord[i].length();
    }

    gjennomsnitt /= this.antallOrd();
    gjennomsnitt = Math.round(gjennomsnitt * 100.0) / 100.0;

    return gjennomsnitt;
  }

  public double gjennomsnittAntallOrdPerPeriode() {
    String[] deler = tekst.split(skilleTegn);
    double gjennomsnitt = 0;

    for (int i = 0; i < deler.length; i++) {
      String[] ordDeler = deler[i].split(" ");
      for (int j = 0; j < ordDeler.length; j++) {
        if (!ordDeler[j].isEmpty())
          gjennomsnitt++;
      }
    }

    gjennomsnitt /= deler.length;
    gjennomsnitt = Math.round(gjennomsnitt * 100.0) / 100.0;

    return gjennomsnitt;
  }

  public void byttOrd(String gammeltOrd, String nyttOrd) {
    this.tekst = tekst.replaceAll("(?i)(?<=\\s|\\.|:|!|\\?)(" + gammeltOrd + ")(?=\\s|\\.|:|!|\\?)", nyttOrd);
    this.tekstUtenSkilleTegn = tekst.replaceAll(skilleTegn, "");
    this.ord = tekstUtenSkilleTegn.split(" ");
  }

  public String tekst() {
    return this.tekst;
  }

  public String tekstStoreBokstaver() {
    return this.tekst.toUpperCase();
  }
}
