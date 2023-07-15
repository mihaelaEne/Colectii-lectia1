package model;

import java.util.Objects;

public class Masina {

    private String model;
    private String culoare;
    private  int km;

    public Masina(String model, String culoare, int km) {
        this.model = model;
        this.culoare = culoare;
        this.km = km;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    @Override
    public String toString() {
       String text="";
       text+="Sunt o masina cu urm caracteristici: "+"\n";
       text+="model: "+this.model+"\n";
       text+="culoare: "+this.culoare+"\n";
       text+="km: "+this.km;
       return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Masina)) return false;
        Masina masina = (Masina) o;
        return km == masina.km && model.equals(masina.model) && culoare.equals(masina.culoare);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, culoare, km);
    }
}
