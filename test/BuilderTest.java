import model.*;
import org.junit.Test;

public class BuilderTest {

    @Test
    public void AnimalBuilder(){
        Animal animal= AnimalBuilder.build()
                .tipAnimal("tip animal-test")
                .id(1)
                .nume("nume animal-test");

        System.out.println(animal);
    }

    @Test
    public void LiceuBuilder(){
        Liceu liceu=LiceuBuilder.build()
                .numeLiceu("nume liceu-test")
                .oras("oras-test")
                .nrStudenti(100);

        System.out.println(liceu);
    }
    @Test
    public void MasinaBuilder(){

        Masina masina= MasinaBuilder.build()
                .km(12)
                .culoare("test")
                .model("test-model");


        System.out.println(masina);
    }

    @Test
    public void PersoanaBuilder(){
        Persoana persoana=PersoanaBuilder.build()
                .adresa("adresa-test")
                .nume("nume-test")
                .varsta(20);
        System.out.println(persoana);
    }

}
