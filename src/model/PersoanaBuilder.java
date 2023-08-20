package model;

public interface PersoanaBuilder {
    Persoana nume(String nume);
    Persoana varsta(int varsta);
    Persoana adresa(String adresa);

    static Persoana build(){
        return new Persoana();
    }
}
