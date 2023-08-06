import controller.AnimalController;
import controller.MasinaController;
import model.Animal;
import model.Masina;
import org.junit.Test;

import java.sql.SQLOutput;
import java.util.*;

import static org.junit.Assert.*;

public class AnimalControllerTest {

    @Test

    public void testFindById(){
        ArrayList<Animal> animals=new ArrayList<>();
        Animal a1 = new Animal(1, "maimuta", "nume1");
        animals.add(a1);
        Animal a2 = new Animal(2, "caine", "Ares");
        animals.add(a2);
        Animal a3 = new Animal(3, "pisica", "rose");
        animals.add(a3);

        AnimalController animalController=new AnimalController(animals);

        assertEquals("caine",animalController.findBuId(2).getTipAnimal());
    }

    @Test
    public void teestFindNull(){
        ArrayList<Animal> animals=new ArrayList<>();
        Animal a1 = new Animal(1, "maimuta", "nume1");
        animals.add(a1);
        Animal a2 = new Animal(2, "caine", "Ares");
        animals.add(a2);
        Animal a3 = new Animal(3, "pisica", "rose");
        animals.add(a3);

        AnimalController animalController=new AnimalController(animals);
        assertNull(animalController.findBuId(500));
    }

    @Test
    public void testAdd(){
        ArrayList<Animal> animals=new ArrayList<>();
        Animal a1 = new Animal(1, "maimuta", "nume1");
        animals.add(a1);
        Animal a2 = new Animal(2, "caine", "Ares");
        animals.add(a2);
        Animal a3 = new Animal(3, "pisica", "rose");
        animals.add(a3);

        AnimalController animalController=new AnimalController(animals);
        assertNotNull(animalController.findBuId(1));
    }

    @Test
    public void stergereMasian(){

        ArrayList<Animal> animals=new ArrayList<>();
        Animal a1 = new Animal(1, "maimuta", "nume1");
        animals.add(a1);
        Animal a2 = new Animal(2, "caine", "Ares");
        animals.add(a2);
        Animal a3 = new Animal(3, "pisica", "rose");
        animals.add(a3);

        AnimalController animalController=new AnimalController(animals);

        animalController.stergereAnimal(1);
        assertEquals(null, animalController.findBuId(1));

    }

    @Test
    public void testEdit(){
        ArrayList<Animal> animals=new ArrayList<>();
        Animal a1 = new Animal(1, "maimuta", "nume1");
        animals.add(a1);
        Animal a2 = new Animal(2, "caine", "Ares");
        animals.add(a2);
        Animal a3 = new Animal(3, "pisica", "rose");
        animals.add(a3);

        a3.setNume("numeNou");

        AnimalController animalController=new AnimalController(animals);

        assertEquals("numeNou", animalController.findBuId(3).getNume());


    }



}
