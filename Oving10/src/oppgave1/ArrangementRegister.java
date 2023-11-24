package oppgave1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrangementRegister {
    private List<Arrangement> arrangementer = new ArrayList<>();

    public void nyttArrangement(String navn, String sted, String arrangor, String type, Long tidspunkt) {
        int id = arrangementer.size() + 1;
        Arrangement arrangement = new Arrangement(id, navn, sted, arrangor, type, tidspunkt);
        arrangementer.add(arrangement);
    }

    public List<Arrangement> arrangementerSted(String sted) {
        List<Arrangement> arrangementerSted = new ArrayList<>();
        for (int i = 0; i < arrangementer.size(); i++) {
            if (arrangementer.get(i).getSted().equals(sted)) {
                arrangementerSted.add(arrangementer.get(i));
            }
        }
        return arrangementerSted;
    }

    public List<Arrangement> arrangementerDato(int dato) {
        List<Arrangement> arrangementerDato = new ArrayList<>();
        for (int i = 0; i < arrangementer.size(); i++) {
            if (Math.floor(arrangementer.get(i).getTidspunkt() / 10000) == dato) {
                arrangementerDato.add(arrangementer.get(i));
            }
        }
        return arrangementerDato;
    }

    public List<Arrangement> arrangementerMellomDato(int dato1, int dato2) {
        List<Arrangement> arrangementerDato = new ArrayList<>();
        for (int i = 0; i < arrangementer.size(); i++) {
            if (Math.floor(arrangementer.get(i).getTidspunkt() / 10000) >= dato1
                    && Math.floor(arrangementer.get(i).getTidspunkt() / 10000) <= dato2) {
                arrangementerDato.add(arrangementer.get(i));
            }
        }
        return arrangementerDato;
    }

    public List<Arrangement> sorterArrangementer(Comparator<Arrangement> comparator) {
        List<Arrangement> arrangementerSortert = new ArrayList<>(arrangementer);
        arrangementerSortert.sort(comparator);
        return arrangementerSortert;
    }

    public List<Arrangement> sorterSted() {
        return sorterArrangementer(Comparator.comparing(Arrangement::getSted));
    }

    public List<Arrangement> sorterType() {
        return sorterArrangementer(Comparator.comparing(Arrangement::getType));
    }

    public List<Arrangement> sorterTidspunt() {
        return sorterArrangementer(Comparator.comparing(Arrangement::getTidspunkt));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrangementer.size(); i++) {
            sb.append(arrangementer.get(i).toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
