package model;

import java.util.Objects;

public class Persoana {
    private String nume;
    private int varsta;
    private String adresa;


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
    public String toString() {
        String text="";
        text+="Sunt o persoana cu urmatoarele caracteristici:"+"\n";
        text+="nume: "+this.nume+"\n";
        text+="varsta: "+this.varsta+"\n";
        text+="adresa: "+this.adresa;


        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persoana)) return false;
        Persoana persoana = (Persoana) o;
        return varsta == persoana.varsta && nume.equals(persoana.nume) && adresa.equals(persoana.adresa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, varsta, adresa);
    }
}
