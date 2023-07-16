package model;

import java.util.Objects;

public class Liceu implements Comparable<Liceu> {

    private String numeLiceu;
    private String Oras;
    private int nrStudenti;

    public Liceu(String numeLiceu, String oras, int nrStudenti) {
        this.numeLiceu = numeLiceu;
        Oras = oras;
        this.nrStudenti = nrStudenti;
    }

    public String getNumeLiceu() {
        return numeLiceu;
    }

    public void setNumeLiceu(String numeLiceu) {
        this.numeLiceu = numeLiceu;
    }

    public String getOras() {
        return Oras;
    }

    public void setOras(String oras) {
        Oras = oras;
    }

    public int getNrStudenti() {
        return nrStudenti;
    }

    public void setNrStudenti(int nrStudenti) {
        this.nrStudenti = nrStudenti;
    }

    @Override
    public String toString() {
        return "Liceu{" +
                "numeLiceu='" + numeLiceu + '\'' +
                ", Oras='" + Oras + '\'' +
                ", nrStudenti=" + nrStudenti +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Liceu)) return false;
        Liceu liceu = (Liceu) o;
        return nrStudenti == liceu.nrStudenti && numeLiceu.equals(liceu.numeLiceu) && Oras.equals(liceu.Oras);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeLiceu, Oras, nrStudenti);
    }

    @Override
    public int compareTo(Liceu o) {
        if(o.nrStudenti>this.nrStudenti){
            return -1;
        }else if(o.nrStudenti<this.nrStudenti){
            return 1;
        }else {
            return 0;
        }
    }
}
