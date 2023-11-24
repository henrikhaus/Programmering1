package oppgave1;

final class NyString {
  public final String string;

  public NyString(String nyString) {
    this.string = nyString;
  }

  public NyString forkort() {
    String forkortetString = "";
    String[] ord = this.string.split(" ");

    for (int i = 0; i < ord.length; i++) {
      forkortetString += ord[i].charAt(0);
    }

    return new NyString(forkortetString);
  }

  public NyString fjernTegn(String tegn) {
    String stringUtenTegn = this.string.replace(tegn, "");

    return new NyString(stringUtenTegn);
  }
}
