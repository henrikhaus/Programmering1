package oppgave2;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		// Testkode
		MenyRegister register = new MenyRegister();
		register.nyRett("Kjøttkaker", "Hovedrett", 120, "Kjøttkaker, poteter, brun saus");
		register.nyRett("Pizza Margharita", "Hovedrett", 140, "Pizza, ost, tomatsaus");
		register.nyRett("Spaghetti Bolognese", "Hovedrett", 99.99, "Spaghetti, kjøttsaus");
		register.nyRett("Pannekaker", "Dessert", 59.49, "Pannekaker, syltetøy, rømme");
		register.nyRett("Vafler og is", "Dessert", 80, "Vafler, is, syltetøy");

		register.nyMeny("Dagens", register.getRett("Kjøttkaker"), register.getRett("Pannekaker"));
		register.nyMeny("Lørdagsmeny", register.getRett("Pizza Margharita"), register.getRett("Pannekaker"),
				register.getRett("Vafler og is"));
		register.nyMeny("Italiensk", register.getRett("Pizza Margharita"), register.getRett("Spaghetti Bolognese"));

		System.out.println("\nAlle hovedretter: ");
		List<Rett> hovedretter = register.getRetterAvType("Hovedrett");
		for (Rett rett : hovedretter) {
			System.out.println(rett.getNavn());
		}

		System.out.println("\nAlle menyer med totalpris mellom 200 og 250 kroner: ");
		List<Meny> menyer = register.getMenyerMedPrisMellom(200, 280);
		for (Meny meny : menyer) {
			System.out.println(meny.getNavn());
		}
	}
}
