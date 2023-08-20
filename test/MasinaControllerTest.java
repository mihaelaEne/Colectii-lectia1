import controller.MasinaController;
import model.Masina;
import model.MasinaBuilder;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;


import static org.junit.Assert.*;

public class MasinaControllerTest {

//    MasinaController masinaController=new MasinaController(Arrays.asList(new Masina("Ford","albastru",100),
//            ("Opel", "alb",200),("Logan", "galben",300);


    @Test
    public void testFindByModel(){

        ArrayList<Masina> masini=new ArrayList<Masina>();
        Masina m1=new Masina("Ford","albastru",100);
        masini.add(m1);
        Masina m2=new Masina("Opel", "alb",200);
        masini.add(m2);
        Masina m3=new Masina("Logan", "galben",300);
        masini.add(m3);

        MasinaController masinaController=new MasinaController(masini);
        assertEquals("alb", masinaController.findMasinaByModel("Opel").getCuloare());
    }


    @Test
    public void teestFindNull(){
        ArrayList<Masina> masini=new ArrayList<Masina>();
        Masina m1=new Masina("Ford","albastru",100);
        masini.add(m1);
        Masina m2=new Masina("Opel", "alb",200);
        masini.add(m2);
        Masina m3=new Masina("Logan", "galben",300);
        masini.add(m3);


        MasinaController masinaController=new MasinaController(masini);
        assertNull(masinaController.findMasinaByModel("BMW"));
    }
    @Test
    public void testAdd(){
        ArrayList<Masina> masini=new ArrayList<Masina>();
        Masina m1=new Masina("Ford","albastru",100);
        masini.add(m1);
        Masina m2=new Masina("Opel", "alb",200);
        masini.add(m2);
        Masina m3=new Masina("Logan", "galben",300);
        masini.add(m3);

        MasinaController masinaController=new MasinaController(masini);
        assertNotNull(masinaController.findMasinaByModel("Ford"));
    }

    @Test
    public void stergereMasian(){

        ArrayList<Masina> masini=new ArrayList<Masina>();
        Masina m1=new Masina("Ford","albastru",100);
        masini.add(m1);
        Masina m2=new Masina("Opel", "alb",200);
        masini.add(m2);
        Masina m3=new Masina("Logan", "galben",300);
        masini.add(m3);

        MasinaController masinaController=new MasinaController(masini);

        masinaController.stergereMasian("Logan");
        assertEquals(null, masinaController.findMasinaByModel("Logan"));

    }

    @Test
    public void testEdit(){
        ArrayList<Masina> masini=new ArrayList<Masina>();
        Masina m1=new Masina("Ford","albastru",100);
        masini.add(m1);
        Masina m2=new Masina("Opel", "alb",200);
        masini.add(m2);
        Masina m3=new Masina("Logan", "galben",300);
        masini.add(m3);

        m3.setCuloare("rosu");

        MasinaController masinaController=new MasinaController(masini);
        assertEquals("rosu", masinaController.findMasinaByModel("Logan").getCuloare());


    }




}
