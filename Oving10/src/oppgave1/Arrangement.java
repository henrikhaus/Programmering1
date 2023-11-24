package oppgave1;

public class Arrangement {
	private int id;
	private String navn;
	private String sted;
	private String arrangor;
	private String type;
	private Long tidspunkt;

	public Arrangement(int id, String navn, String sted, String arrangor, String type, Long tidspunkt) {
		this.id = id;
		this.navn = navn;
		this.sted = sted;
		this.arrangor = arrangor;
		this.type = type;
		this.tidspunkt = tidspunkt;
	}

	public int getId() {
		return id;
	}

	public String getNavn() {
		return navn;
	}

	public String getSted() {
		return sted;
	}

	public String getArrangor() {
		return arrangor;
	}

	public String getType() {
		return type;
	}

	public Long getTidspunkt() {
		return tidspunkt;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public void setSted(String sted) {
		this.sted = sted;
	}

	public void setArrangor(String arrangor) {
		this.arrangor = arrangor;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setTidspunkt(Long tidspunkt) {
		this.tidspunkt = tidspunkt;
	}

	public String toString() {
		return "(" + id + ") " + navn + ", " + sted + ", " + arrangor + ", " + type + ", " + tidspunkt;
	}
}