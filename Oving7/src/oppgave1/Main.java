package oppgave1;

public class Main {
  public static void main(String[] args) {
    NyString nyString = new NyString("hei på deg");
    System.out.println("Din string: " + nyString.string);

    NyString stringUtenTegn = nyString.fjernTegn("e");
    System.out.println("String uten tegn: " + stringUtenTegn.string);

    NyString forkortetString = nyString.forkort();
    System.out.println("Forkortet string " + forkortetString.string);
  }
}
