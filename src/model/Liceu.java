package model;

import java.util.List;
import java.util.Objects;

public class Liceu implements Comparable<Liceu>, LiceuBuilder {

    public Liceu(){}
    private String numeLiceu;
    private String oras;
    private int nrStudenti;

    public Liceu(String numeLiceu, String oras, int nrStudenti) {
        this.numeLiceu = numeLiceu;
        this.oras = oras;
        this.nrStudenti = nrStudenti;
    }

    public String getNumeLiceu() {
        return numeLiceu;
    }

    public void setNumeLiceu(String numeLiceu) {
        this.numeLiceu = numeLiceu;
    }

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
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
                ", Oras='" + oras + '\'' +
                ", nrStudenti=" + nrStudenti +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Liceu liceu=(Liceu) o;
        return  this.numeLiceu.equals(liceu.numeLiceu)&&this.oras.equals(liceu.oras);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeLiceu, oras, nrStudenti);
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

    @Override
    public Liceu numeLiceu(String numeLiceu) {
        this.numeLiceu=numeLiceu;
        return this;
    }

    @Override
    public Liceu oras(String numeOras) {
        this.oras=oras;
        return this;
    }

    @Override
    public Liceu nrStudenti(int nrStudenti) {
       this.nrStudenti=nrStudenti;
       return this;
    }


}
