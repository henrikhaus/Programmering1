package oppgave2;

import java.util.ArrayList;
import java.util.List;

public class MenyRegister {
    private List<Rett> retter = new ArrayList<Rett>();
    private List<Meny> menyer = new ArrayList<Meny>();

    public void nyRett(String navn, String type, double pris, String oppskrift) {
        retter.add(new Rett(navn, type, pris, oppskrift));
    }

    public void nyMeny(String navn, Rett... retter) {
        menyer.add(new Meny(navn, retter));
    }

    public Rett getRett(String navn) {
        for (Rett rett : retter) {
            if (rett.getNavn().equals(navn)) {
                return rett;
            }
        }
        return null;
    }

    public List<Rett> getRetterAvType(String type) {
        List<Rett> retterAvType = new ArrayList<Rett>();
        for (Rett rett : retter) {
            if (rett.getType().equals(type)) {
                retterAvType.add(rett);
            }
        }
        return retterAvType;
    }

    public List<Meny> getMenyerMedPrisMellom(double min, double max) {
        List<Meny> menyerMedPrisMellom = new ArrayList<Meny>();
        for (Meny meny : menyer) {
            if (meny.getTotalPris() >= min && meny.getTotalPris() <= max) {
                menyerMedPrisMellom.add(meny);
            }
        }
        return menyerMedPrisMellom;
    }
}
