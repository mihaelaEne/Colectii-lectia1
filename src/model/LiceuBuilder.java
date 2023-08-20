package model;

public interface LiceuBuilder {

    Liceu numeLiceu(String numeLiceu);
    Liceu oras(String numeOras);
    Liceu nrStudenti(int nrStudenti);

    static Liceu build(){

        return new Liceu();
    }
}
