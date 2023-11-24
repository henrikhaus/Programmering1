package oppgave1;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		ArrangementRegister register = new ArrangementRegister();

		register.nyttArrangement("Sandnes ULF - Viking", "Stavanger", "Viking FK", "Fotballkamp", 202311191600L);
		register.nyttArrangement("Coldplay-konsert", "Oslo", "BillettService", "Konsert", 202312041500L);
		register.nyttArrangement("Foredrag med Lars Saabye Christensen", "Bergen",
				"Det Norske Akademi for Språk og Litteratur", "Foredrag", 202312041300L);
		register.nyttArrangement("Vålerenga - Rosenborg", "Oslo", "Komplett Arena", "Fotballkamp", 202312011630L);
		register.nyttArrangement("Konsert med Kygo", "Bergen", "BillettService", "Konsert", 202401041930L);

		System.out.println("Alle arrangementer: (id)" + "\n" + register.toString());
		System.out.println("Alle arrangementer: (sted)" + "\n" + arrangementToString(register.sorterSted()));
		System.out.println("Alle arrangementer: (type)" + "\n" + arrangementToString(register.sorterType()));
		System.out.println("Alle arrangementer: (tidspunkt)" + "\n" + arrangementToString(register.sorterTidspunt()));
		System.out.println("Arrangementer i Oslo: " + "\n" + arrangementToString(register.arrangementerSted("Oslo")));
		System.out.println("Arrangementer den 04.12.2023: " + "\n"
				+ arrangementToString(register.arrangementerDato(20231204)));
		System.out.println("Arrangementer mellom 01.12.2023 og 04.12.2023: " + "\n"
				+ arrangementToString(register.arrangementerMellomDato(20231201, 20231204)));

	}

	// Konverterer en liste med arrangementer til en String
	public static String arrangementToString(List<Arrangement> arrangementer) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arrangementer.size(); i++) {
			sb.append(arrangementer.get(i).toString());
			sb.append("\n");
		}
		return sb.toString();
	}
}