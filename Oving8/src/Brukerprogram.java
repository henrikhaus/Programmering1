import java.util.Scanner;

public class Brukerprogram {
  public static void kjorProgram(Arbtaker arbtaker) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ønsker du å endre lønn eller skatteprosent? (j/n)");
    while (true) {
      String input = scanner.nextLine();
      switch (input) {
        case "j":
          while (true) {
            System.out.println("Endre lønn eller skatteprosent? (l/s)");
            String input2 = scanner.nextLine();
            switch (input2) {
              case "l":
                oppdaterMaanedsLonn(arbtaker, scanner);
                break;
              case "s":
                oppdaterSkatteprosent(arbtaker, scanner);
                break;
              default:
                System.out.println("Ugyldig input. Prøv igjen.");
                continue;
            }
            System.out.println("Ny skatt per år: " + arbtaker.getSkattPerAar() + "\n" +
                "Ny skatt per måned: " + arbtaker.getSkattPerManed() + "\n" +
                "Vil du å endre noe mer? (j/n)");
            break;
          }
          break;
        case "n":
          System.out.println("Takk for nå!");
          System.exit(0);
        default:
          System.out.println("Ugyldig input. Prøv igjen.");
      }
    }
  }

  private static void oppdaterMaanedsLonn(Arbtaker arbtaker, Scanner scanner) {
    System.out.println("Skriv inn ny månedslønn:");
    double nyMaanedslonn = gyldigDoubleInput(scanner);
    arbtaker.setManedslonn(nyMaanedslonn);
    System.out.println("Ny månedslønn: " + arbtaker.getManedslonn() + "\n" +
        "Ny bruttolønn per år: " + arbtaker.getBruttolonnPerAar());
  }

  private static void oppdaterSkatteprosent(Arbtaker arbtaker, Scanner scanner) {
    System.out.println("Skriv inn ny skatteprosent:");
    double nySkatteprosent = gyldigDoubleInput(scanner);
    arbtaker.setSkatteprosent(nySkatteprosent);
    System.out.println("Ny skatteprosent: " + arbtaker.getSkatteprosent());
  }

  private static double gyldigDoubleInput(Scanner scanner) {
    while (true) {
      try {
        return Double.valueOf(scanner.nextLine());
      } catch (Exception e) {
        System.out.println("Ugyldig input. Prøv igjen.");
        scanner.nextLine();
      }
    }
  }
}
