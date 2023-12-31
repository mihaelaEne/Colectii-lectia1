package model;

import java.util.Objects;

public class Persoana implements Comparable<Persoana>, PersoanaBuilder {

    private String nume;
    private int varsta;
    private String adresa;


    public Persoana (){}
    public Persoana(String nume, int varsta, String adresa) {
        this.nume = nume;
        this.varsta = varsta;
        this.adresa = adresa;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }


    @Override
    public boolean equals(Object o) {
        return nume.equals(((Persoana) o).nume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume);
    }


    @Override
    public int compareTo(Persoana o) {

        if (this.nume.compareTo(o.nume) > 0) {
            return 1;
        } else if (this.nume.compareTo(o.nume) < 0) {
            return -1;
        } else {
            return 0;
        }
    }


    @Override
    public String toString() {
        return "Eu sunt " + this.nume + ", am " + this.varsta +" de ani "+ "si locuiesc in: " + this.adresa;

    }

    @Override
    public Persoana nume(String nume) {

        this.nume=nume;

        return this ;
    }

    @Override
    public Persoana varsta(int varsta) {
        this.varsta=varsta;
        return this;
    }

    @Override
    public Persoana adresa(String adresa) {

       this.adresa=adresa;
       return this;
    }


    public static Persoana build() {
        return new Persoana();
    }
}
