package oppgave1;

public class Main {
  public static void main(String[] args) {
    Oppgaveoversikt oppgaveoversikt = new Oppgaveoversikt();

    oppgaveoversikt.registrerNyStudent("Jon");
    oppgaveoversikt.registrerNyStudent("Emma");
    oppgaveoversikt.registrerNyStudent("Lars");
    oppgaveoversikt.registrerNyStudent("Jonas");
    oppgaveoversikt.registrerNyStudent("Hanna");
    oppgaveoversikt.registrerNyStudent("Ida");

    oppgaveoversikt.okAntallOppg("Jon", 3);
    oppgaveoversikt.okAntallOppg("Emma", 1);
    oppgaveoversikt.okAntallOppg("Hanna", 4);
    oppgaveoversikt.okAntallOppg("Ida", 5);

    System.out.println(oppgaveoversikt.toString());
    System.out.println("Antall studenter: " + oppgaveoversikt.antallStudenter());
    System.out.println(antallOppgaver("Emma", oppgaveoversikt));
  }

  static String antallOppgaver(String student, Oppgaveoversikt oppgaveoversikt) {
    int antOppg = oppgaveoversikt.oppgaverStudent(student);
    if (antOppg == -1) {
      return student + " finnes ikke.";
    }

    String flertallSuffiks = (antOppg == 1) ? "" : "r";
    return student + " har løst " + antOppg + " oppgave" + flertallSuffiks + ".";
  }
}