public class Main {
  public static void main(String[] args) {
    Arbtaker arbtaker = new Arbtaker(new Person("Henrik", "Hausberg", 2001), 176351, 2021, 40000, 30);

    System.out.println("Navn: " + arbtaker.getNavn() + "\n" +
        "Alder: " + arbtaker.getAlder() + "\n" +
        "Ansattnummer: " + arbtaker.getArbtakerNr() + "\n" +
        "Ansatt i: " + arbtaker.getAarAnsatt() + " år" + "\n" +
        "Ansatt lengre enn 1 år: " + arbtaker.ansattLengreEnn(1) + "\n" +
        "Ansatt lengre enn 5 år: " + arbtaker.ansattLengreEnn(5) + "\n" +
        "Ansatt siden: " + arbtaker.getAnsettelsesAar() + "\n" +
        "Månedslønn: " + arbtaker.getManedslonn() + "\n" +
        "Bruttolønn per år: " + arbtaker.getBruttolonnPerAar() + "\n" +
        "Skatteprosent: " + arbtaker.getSkatteprosent() + "\n" +
        "Skatt per år: " + arbtaker.getSkattPerAar() + "\n" +
        "Skatt per måned: " + arbtaker.getSkattPerManed());
    Brukerprogram.kjorProgram(arbtaker);
  }
}