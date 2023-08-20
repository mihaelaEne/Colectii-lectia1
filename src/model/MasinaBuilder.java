package model;

public interface MasinaBuilder {
    Masina model(String model);
    Masina culoare(String culoare);
    Masina km(int km);


     static Masina build(){

        return  new Masina();
    }

}
