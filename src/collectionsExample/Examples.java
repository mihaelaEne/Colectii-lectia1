package collectionsExample;

import model.Animal;
import model.Liceu;
import model.Masina;
import model.Persoana;

import java.util.*;

public abstract class Examples {


    public static void explAfisareList() {

        List<Persoana> persoane = new ArrayList<>();


        Persoana p1 = new Persoana("Maria", 20, "Bucuresti");
        persoane.add(p1);
        Persoana p2 = new Persoana("Ion", 15, "Arad");
        persoane.add(p2);
        Persoana p3 = new Persoana("Ana", 21, "Sibiu");
        persoane.add(p3);
        Persoana p4 = new Persoana("Denisa", 22, "Cluj");
        persoane.add(p4);

        Iterator<Persoana> iterator1 = persoane.iterator();
        while (iterator1.hasNext()) {
            Persoana p = iterator1.next();
            System.out.println(p.toString());
        }
        System.out.println("-----------------------------------------------------------");

        List<Masina> masini = new ArrayList<>();
        Masina m1 = new Masina("Ford", "alb", 100);
        masini.add(m1);
        Masina m2 = new Masina("Opel", "albastru", 200);
        masini.add(m2);
        Masina m3 = new Masina("Logan", "galben", 300);
        masini.add(m3);
        Masina m4 = new Masina("BMW", "rosu", 400);
        masini.add(m4);

        Iterator<Masina> iterator = masini.iterator();


        while (iterator.hasNext()) {

            Masina m = iterator.next();

            System.out.println(m.toString());
        }

        System.out.println("----------------------------------------------");


        List<Liceu> lic = new ArrayList<>();
        Liceu l1 = new Liceu("CEVM", "Bucuresti", 200);
        lic.add(l1);
        Liceu l2 = new Liceu("ICHB", "Bucuresti", 300);
        lic.add(l2);
        Liceu l3 = new Liceu("Vianu", "Bucuresti", 500);
        lic.add(l3);

        Iterator<Liceu> iterator2 = lic.iterator();
        while (iterator2.hasNext()) {
            Liceu l = iterator2.next();
            System.out.println(l.toString());
        }

        System.out.println("---------------------------------------------------------");

        List<Animal> animals = new ArrayList<>();
        Animal a1 = new Animal(1, "maimuta", "nume1");
        animals.add(a1);
        Animal a2 = new Animal(2, "caine", "Ares");
        animals.add(a2);
        Animal a3 = new Animal(3, "pisica", "rose");
        animals.add(a3);

        Iterator<Animal> iterator3 = animals.iterator();
        while (iterator3.hasNext()) {
            Animal a = iterator3.next();
            System.out.println(a.toString());
        }

//        int index=2;
//        if (index>=0 &&index< animals.size()){
//            animals.remove(index);
//        }
//        System.out.println(animals);

    }

    public static void stergereList() {
        List<Persoana> persoane = new ArrayList<>();

        Persoana p1 = new Persoana("Maria", 20, "Bucuresti");
        persoane.add(p1);
        Persoana p2 = new Persoana("Ion", 15, "Arad");
        persoane.add(p2);
        Persoana p3 = new Persoana("Ana", 21, "Sibiu");
        persoane.add(p3);
        Persoana p4 = new Persoana("Denisa", 22, "Cluj");
        persoane.add(p4);

        Iterator<Persoana> iterator1 = persoane.iterator();

        String name = "Maria";
        while (iterator1.hasNext()) {
            Persoana p = iterator1.next();

            if (p.getNume().equals(name)) {

                iterator1.remove();

            }
        }

        System.out.println(persoane);

        System.out.println("-----------------------------------------------------------");

        List<Masina> masini = new ArrayList<>();
        Masina m1 = new Masina("Ford", "alb", 100);
        masini.add(m1);
        Masina m2 = new Masina("Opel", "albastru", 200);
        masini.add(m2);
        Masina m3 = new Masina("Logan", "galben", 300);
        masini.add(m3);
        Masina m4 = new Masina("BMW", "rosu", 400);
        masini.add(m4);

        Iterator<Masina> iterator2 = masini.iterator();


        String model = "Logan";
        while (iterator2.hasNext()) {
            Masina m = iterator2.next();

            if (m.getModel().equals(model)) {

                iterator2.remove();

            }
        }
        System.out.println(masini);
        System.out.println("----------------------------------------------");


        List<Liceu> lic = new ArrayList<>();
        Liceu l1 = new Liceu("CEVM", "Bucuresti", 200);
        lic.add(l1);
        Liceu l2 = new Liceu("ICHB", "Bucuresti", 300);
        lic.add(l2);
        Liceu l3 = new Liceu("Vianu", "Bucuresti", 500);
        lic.add(l3);

        Iterator<Liceu> iterator3 = lic.iterator();
        String numeLiceu = "ICHB";
        while (iterator3.hasNext()) {
            Liceu l = iterator3.next();

            if (l.getNumeLiceu().equals(numeLiceu)) {

                iterator3.remove();

            }
        }

        System.out.println(lic);
        System.out.println("---------------------------------------------------------");

        List<Animal> animals = new ArrayList<>();
        Animal a1 = new Animal(1, "maimuta", "nume1");
        animals.add(a1);
        Animal a2 = new Animal(2, "caine", "Ares");
        animals.add(a2);
        Animal a3 = new Animal(3, "pisica", "rose");
        animals.add(a3);

        Iterator<Animal> iterator4 = animals.iterator();
        int id = 2;
        while (iterator4.hasNext()) {
            Animal a = iterator4.next();

            if (a.getId() == id) {

                iterator4.remove();

            }
        }

        System.out.println(animals);
    }

    public static  void exCoadaPersoane(){
        Queue<Persoana> persoane=new ArrayDeque<>();
        Persoana p1 = new Persoana("Maria", 20, "Bucuresti");
        persoane.add(p1);
        Persoana p2 = new Persoana("Ion", 15, "Arad");
        persoane.add(p2);
        Persoana p3 = new Persoana("Ana", 21, "Sibiu");
        persoane.add(p3);
        Persoana p4 = new Persoana("Denisa", 22, "Cluj");
        persoane.add(p4);

        System.out.println(persoane.element());
        persoane.remove();
        System.out.println(persoane.element());

    }

    public static void exMasini(){
        Queue<Masina> masini=new ArrayDeque<>();
        Masina m1=new Masina("Civic","rosu",100);
        masini.add(m1);
        Masina m2=new Masina("Clio","negru",200);
        masini.add(m2);
        Masina m3=new Masina("Tucson","albastru",300);
        masini.add(m3);

//        System.out.println(masini.element());
//        masini.remove();
//        System.out.println(masini.element());
//        masini.remove();
//        System.out.println(masini.element());


        while(!masini.isEmpty()){
            System.out.println(masini.remove());
        }

    }

    public static void sirInversatCoada() {
        Queue<Character> sirCaractere = new ArrayDeque<>();

        String text = "ana are mere";

        for (int i = text.length()-1; i >= 0; i--) {
            sirCaractere.add(text.charAt(i));
        }

        String aux="";

        while (!sirCaractere.isEmpty()){

            aux+=sirCaractere.element();
            sirCaractere.remove();
        }


        System.out.println(aux);



    }


    

}