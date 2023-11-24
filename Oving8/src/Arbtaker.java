public class Arbtaker {
  private final Person personalia;
  private final int arbtakernr;
  private final int ansettelsesar;
  private double manedslonn;
  private double skatteprosent;
  java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
  int aar = kalender.get(java.util.Calendar.YEAR);

  public Arbtaker(Person personalia, int arbtakernr, int ansettelsesar, double manedslonn, double skatteprosent) {
    this.personalia = personalia;
    this.arbtakernr = arbtakernr;
    this.ansettelsesar = ansettelsesar;
    this.manedslonn = manedslonn;
    this.skatteprosent = skatteprosent;
  }

  public String getNavn() {
    return personalia.getEtternavn() + ", " + personalia.getFornavn();
  }

  public int getArbtakerNr() {
    return arbtakernr;
  }

  public int getAnsettelsesAar() {
    return ansettelsesar;
  }

  public double getManedslonn() {
    return manedslonn;
  }

  public double getSkatteprosent() {
    return skatteprosent;
  }

  public void setManedslonn(double manedslonn) {
    this.manedslonn = manedslonn;
  }

  public void setSkatteprosent(double skatteprosent) {
    this.skatteprosent = skatteprosent;
  }

  public double getSkattPerManed() {
    return manedslonn * skatteprosent / 100;
  }

  public double getBruttolonnPerAar() {
    return manedslonn * 12;
  }

  public double getSkattPerAar() {
    return getSkattPerManed() * 10.5;
  }

  public int getAlder() {
    return aar - personalia.getFodselsaar();
  }

  public int getAarAnsatt() {
    return aar - ansettelsesar;
  }

  public boolean ansattLengreEnn(int testAar) {
    return getAarAnsatt() > testAar;
  }
}