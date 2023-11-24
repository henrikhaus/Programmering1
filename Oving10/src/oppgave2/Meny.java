package oppgave2;

public class Meny {
    private String navn;
    private Rett[] retter;

    public Meny(String navn, Rett... retter) {
        this.navn = navn;
        this.retter = new Rett[retter.length];
        for (int i = 0; i < retter.length; i++) {
            this.retter[i] = retter[i];
        }
    }

    public String getNavn() {
        return navn;
    }

    public double getTotalPris() {
        double totalPris = 0;
        for (Rett rett : retter) {
            totalPris += rett.getPris();
        }
        return totalPris;
    }
}
