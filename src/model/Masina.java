package model;

import java.util.Objects;

public class Masina implements  Comparable<Masina> ,MasinaBuilder {

    private String model;
    private String culoare;
    private  int km;

    public  Masina(){

    }
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
        return "Masina{" +
                "model='" + model + '\'' +
                ", culoare='" + culoare + '\'' +
                ", km=" + km +
                '}';
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

    public Masina(String prop){
        String [ ]split=prop.split(",");
        this.model=split[0];
        this.culoare=split[1];
        this.km=Integer.parseInt(split[2]);
    }

    @Override
    public int compareTo(Masina o) {

        if(o.km>this.km){
            return -1;
        }else if(o.km<this.km){
            return 1;
        }else{

            return 0;
        }

    }

    @Override
    public Masina model(String model) {

        this.model=model;
        return this;
    }

    @Override
    public Masina culoare(String culoare) {
        this.culoare=culoare;
        return this;
    }

    @Override
    public Masina km(int km) {
        this.km=km;
        return this;
    }



}
