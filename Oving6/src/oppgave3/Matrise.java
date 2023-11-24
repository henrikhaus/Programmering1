package oppgave3;

public class Matrise {
  public double matrise[][];
  public int rekker = 0;
  public int kolonner = 0;

  public Matrise(double[][] verdier) {
    this.matrise = verdier.clone();
    rekker = verdier.length;
    kolonner = verdier[0].length;
  }

  public Matrise adderMatrise(Matrise matrise) {
    try {
      if (this.rekker == matrise.rekker && this.kolonner == matrise.kolonner) {
        Matrise sumMatrise = new Matrise(new double[rekker][kolonner]);

        for (int i = 0; i < rekker; i++) {
          for (int j = 0; j < kolonner; j++) {
            sumMatrise.matrise[i][j] = this.matrise[i][j] + matrise.matrise[i][j];
          }
        }
        return sumMatrise;
      }
      return null;
    } catch (Exception e) {
      return null;
    }
  }

  public Matrise multipliserMatrise(Matrise matrise) {
    try {
      if (this.rekker == matrise.kolonner && matrise.kolonner == this.rekker) {
        Matrise produktMatrise = new Matrise(new double[rekker][kolonner]);

        for (int i = 0; i < rekker; i++) {
          for (int j = 0; j < kolonner; j++) {
            for (int k = 0; k < kolonner; k++) {
              produktMatrise.matrise[i][j] += this.matrise[i][k] * matrise.matrise[k][j];
            }
          }
        }
        return produktMatrise;
      }
      return null;
    } catch (Exception e) {
      return null;
    }
  }

  public Matrise transponerMatrise() {
    try {
      Matrise transponertMatrise = new Matrise(new double[kolonner][rekker]);

      for (int i = 0; i < this.kolonner; i++) {
        for (int j = 0; j < this.rekker; j++) {
          transponertMatrise.matrise[i][j] = matrise[j][i];
        }
      }

      return transponertMatrise;
    } catch (Exception e) {
      return null;
    }
  }
}
