import model.Animal;
import model.Liceu;
import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MAP {
    @Test
    public void testMapAnimal(){
        Map<String, Animal> animalMap=new HashMap<>();
        Animal a1=new Animal("caine", "ares");
        animalMap.put("andrei",a1);
        Animal a2=new Animal("pisica","roze");
        animalMap.put("alex",a2);
        Animal a3=new Animal("maimuta", "maimuta");
        animalMap.put("ciprian",a3);

        System.out.println(animalMap.get("andrei"));

        assertEquals(a1,animalMap.get("andrei"));


        Set<String> keys = animalMap.keySet();

        System.out.println("==============CHEI===========");
        for (String key:keys){

            System.out.println(key);

        }

        Collection<Animal> values = animalMap.values();
        System.out.println("==============VALORI==========");
        for (Animal val: values){

            System.out.println(val);

        }

        Set<Map.Entry<String, Animal>> perechi = animalMap.entrySet();

        System.out.println("==============PERECHI===========");
        for(Map.Entry<String,Animal>pereche:perechi){

            System.out.println(pereche.getKey()+" :  "+pereche.getValue());
        }


        System.out.println("--------------------------------------------------------");
        System.out.println("Size-ul map-ului:");
        System.out.println(animalMap.size());
    }


    @Test
    public void LiceuMap(){
        Map<String, Liceu> liceuMap=new HashMap<>();
        Liceu l1=new Liceu("CEVM", "Bucuresti",500);
        liceuMap.put("Maria",l1);
        Liceu l2=new Liceu("Sava","Bucuresri",350);
        liceuMap.put("Ioana", l2);
        Liceu l3=new Liceu("ICHB", "Bucuresti", 200);
        liceuMap.put("Marian",l3);

        System.out.println("------------CHEI-----------------");
        Set<String > keys=liceuMap.keySet();
        for(String key:keys){
            System.out.println("Cheia este : "+key);
        }


        System.out.println("-----------------VALORI-------------------");
        Collection<Liceu> values=liceuMap.values();
        for(Liceu val:values){
            System.out.println("Valorile sunt -> "+val);
        }


        System.out.println("-------------------PERECHI-----------------");
        Set<Map.Entry<String , Liceu >>perechi=liceuMap.entrySet();
        for(Map.Entry<String,Liceu>pereche:perechi){
            System.out.println("detaliile corespondente elevului: "+pereche.getKey()+", sunt: "+pereche.getValue());
        }

    }

    @Test
    public void MasinaMap(){
        
    }


}
