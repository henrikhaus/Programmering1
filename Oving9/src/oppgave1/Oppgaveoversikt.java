package oppgave1;

import java.util.ArrayList;
import java.util.List;

public class Oppgaveoversikt {
  private List<Student> studenter;
  private int antStud = 0;

  public Oppgaveoversikt() {
    this.studenter = new ArrayList<>();
    this.antStud = 0;
  }

  public int antallStudenter() {
    return antStud;
  }

  public int oppgaverStudent(String navn) {
    for (int i = 0; i < antStud; i++) {
      if (studenter.get(i).getNavn() == navn) {
        return studenter.get(i).getAntOppg();
      }
    }
    return -1;
  }

  public void registrerNyStudent(String navn) {
    if (antStud >= studenter.size()) {
      System.out.println("Du har nådd max antall studenter.");
      return;
    }
    studenter.get(antStud).equals(new Student(navn));
    antStud++;
  }

  public void okAntallOppg(String navn, int antallOppgaver) {
    for (int i = 0; i < antStud; i++) {
      if (studenter.get(i).getNavn() == navn) {
        studenter.get(i).okAntallOppg(antallOppgaver);
        return;
      }
    }
    System.out.println("Studenten " + navn + " finnes ikke.");
  }

  public String toString() {
    String oversikt = "";
    for (int i = 0; i < antStud; i++) {
      oversikt += studenter.get(i).toString() + "\n";
    }
    return oversikt;
  }
}
