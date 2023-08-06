import model.Animal;
import model.Liceu;
import model.Masina;
import model.Persoana;
import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MAP {
    @Test
    public void testMapAnimal() {
        Map<String, Animal> animalMap = new HashMap<>();
        Animal a1 = new Animal("caine", "ares");
        animalMap.put("andrei", a1);
        Animal a2 = new Animal("pisica", "roze");
        animalMap.put("alex", a2);
        Animal a3 = new Animal("maimuta", "maimuta");
        animalMap.put("ciprian", a3);

        System.out.println(animalMap.get("andrei"));

        assertEquals(a1, animalMap.get("andrei"));


        Set<String> keys = animalMap.keySet();

        System.out.println("==============CHEI===========");
        for (String key : keys) {

            System.out.println(key);

        }

        Collection<Animal> values = animalMap.values();
        System.out.println("==============VALORI==========");
        for (Animal val : values) {

            System.out.println(val);

        }

        Set<Map.Entry<String, Animal>> perechi = animalMap.entrySet();

        System.out.println("==============PERECHI===========");
        for (Map.Entry<String, Animal> pereche : perechi) {

            System.out.println(pereche.getKey() + " :  " + pereche.getValue());
        }


        System.out.println("--------------------------------------------------------");
        System.out.println("Size-ul map-ului:");
        System.out.println(animalMap.size());
    }


    @Test
    public void LiceuMap() {
        Map<String, Liceu> liceuMap = new HashMap<>();
        Liceu l1 = new Liceu("CEVM", "Bucuresti", 500);
        liceuMap.put("Maria", l1);
        Liceu l2 = new Liceu("Sava", "Bucuresri", 350);
        liceuMap.put("Ioana", l2);
        Liceu l3 = new Liceu("ICHB", "Bucuresti", 200);
        liceuMap.put("Marian", l3);

        System.out.println("------------CHEI-----------------");
        Set<String> keys = liceuMap.keySet();
        for (String key : keys) {
            System.out.println("Cheia este : " + key);
        }


        System.out.println("-----------------VALORI-------------------");
        Collection<Liceu> values = liceuMap.values();
        for (Liceu val : values) {
            System.out.println("Valorile sunt -> " + val);
        }


        System.out.println("-------------------PERECHI-----------------");
        Set<Map.Entry<String, Liceu>> perechi = liceuMap.entrySet();
        for (Map.Entry<String, Liceu> pereche : perechi) {
            System.out.println("detaliile corespondente elevului: " + pereche.getKey() + ", sunt: " + pereche.getValue());
        }

    }

    @Test
    public void MasinaMap() {
        Map<Integer, Masina> masinaMap = new HashMap<>();
        Masina m1 = new Masina("seria 3", "rosu", 2000);
        masinaMap.put(1, m1);
        Masina m2 = new Masina("Q8", "alba", 600);
        masinaMap.put(2, m2);
        Masina m3 = new Masina("fiesta", "albastra", 510);
        masinaMap.put(3, m3);

        System.out.println("--------------Chei--------------------");
        Set<Integer> keys = masinaMap.keySet();
        for (Integer key : keys) {
            System.out.println("Id:ul masinii este : " + key);
        }


        System.out.println("-----------------Valori---------------");
        Collection<Masina> values = masinaMap.values();
        for (Masina val : values) {
            System.out.println("Valorile sunt -> " + val);
        }


        System.out.println("---------------------Perechi------------------");
        Set<Map.Entry<Integer, Masina>> perechi = masinaMap.entrySet();
        for (Map.Entry<Integer, Masina> pereche : perechi) {
            System.out.println("detaliile corespondente id-ului " + pereche.getKey() + ", sunt: " + pereche.getValue());
        }

    }


    @Test
    public void personaMap(){
        Map<Integer, Persoana>persoanaMap=new HashMap<>();
        Persoana p1=new Persoana("Maria",18,"Sibiu");
        persoanaMap.put(1234,p1);
        Persoana p2=new Persoana("Mihaela", 21, "Bucuresti");
        persoanaMap.put(9876,p2);
        Persoana p3=new Persoana("Denisa",22,"Cluj");
        persoanaMap.put(2587,p3);

        System.out.println("------------chei------------");
        Set<Integer> keys =persoanaMap.keySet();
        for(Integer key: keys){
            System.out.println("CNP-ul este: "+key);
        }

        System.out.println("---------------valori---------------");
        Collection<Persoana> values=persoanaMap.values();
        for(Persoana val: values){
            System.out.println("Valorile sunt -> "+val);
        }


        System.out.println("--------------perechi-----------------");
        Set<Map.Entry<Integer,Persoana>> perechi=persoanaMap.entrySet();
        for(Map.Entry<Integer,Persoana> pereche:perechi){
            System.out.println("info cores CNP-ului: "+pereche.getKey()+", sunt: "+pereche.getValue());
        }




    }


}
