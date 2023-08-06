package collectionsExample;

import comparators.*;
import model.Animal;
import model.Liceu;
import model.Masina;
import model.Persoana;

import java.util.*;

public abstract class Examples {

    //LIST
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

    public static void exCoadaPersoane() {
        Queue<Persoana> persoane = new ArrayDeque<>();
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

    public static void exMasini() {
        Queue<Masina> masini = new ArrayDeque<>();
        Masina m1 = new Masina("Civic", "rosu", 100);
        masini.add(m1);
        Masina m2 = new Masina("Clio", "negru", 200);
        masini.add(m2);
        Masina m3 = new Masina("Tucson", "albastru", 300);
        masini.add(m3);

//        System.out.println(masini.element());
//        masini.remove();
//        System.out.println(masini.element());
//        masini.remove();
//        System.out.println(masini.element());


        while (!masini.isEmpty()) {
            System.out.println(masini.remove());
        }

    }

    public static void sirInversatCoada() {
        Queue<Character> sirCaractere = new ArrayDeque<>();

        String text = "ana are mere";

        for (int i = text.length() - 1; i >= 0; i--) {
            sirCaractere.add(text.charAt(i));
        }

        String aux = "";

        while (!sirCaractere.isEmpty()) {

            aux += sirCaractere.element();
            sirCaractere.remove();
        }


        System.out.println(aux);


    }


    public static void exStackPersoane() {
        Deque<Persoana> persoane = new ArrayDeque<>();

        Persoana p1 = new Persoana("Daniela", 15, "Iasi");
        persoane.push(p1);
        Persoana p2 = new Persoana("Maria", 20, "Sibiu");
        persoane.push(p2);
        Persoana p3 = new Persoana("Daniel", 30, "Bucuresti");
        persoane.push(p3);

//        System.out.println(persoane.element());
//        persoane.pop();
//        System.out.println(persoane.element());

        while (!persoane.isEmpty()) {
            System.out.println(persoane.pop());
        }
    }


    //todo:primim un text cu ()[]{} si trebuie sa verificam daca textul este corect balantat
    // todo:((ASdasdas))[()]][


    public static void exTextBalansatStack(String textDeVerificat) {
        Deque<Character> textBalansat = new ArrayDeque<>();


        for (char verificare : textDeVerificat.toCharArray()) {
            if (verificare == '(' || verificare == '[' || verificare == '{') {
                textBalansat.push(verificare);
            } else if (verificare == ')' || verificare == ']' || verificare == '}') {
                switch (verificare) {
                    case ')':
                        if (!textBalansat.isEmpty()) {


                        }
                    case ']':
                        if (!textBalansat.isEmpty()) {

                        }
                    case '}':
                        if (!textBalansat.isEmpty()) {

                        }

                }

            } else {
                System.out.println("Textul nu este balansat");
            }
        }

    }

//SET

    public static void exSetAfisare() {
        Set<Persoana> persoane = new TreeSet<>();
        Persoana p1 = new Persoana("Maria", 20, "Bucuresti");
        persoane.add(p1);
        Persoana p2 = new Persoana("Ion", 15, "Arad");
        persoane.add(p2);
        Persoana p3 = new Persoana("Ana", 21, "Sibiu");
        persoane.add(p3);
        Persoana p4 = new Persoana("Denisa", 22, "Cluj");
        persoane.add(p4);


        for (Persoana p : persoane) {
            System.out.println(p);
        }
    }

    public static void stergereSet() {
        Set<Persoana> persoane = new TreeSet<>(new ComparePersoanaByVarsta());
        Persoana p1 = new Persoana("Maria", 20, "Bucuresti");
        persoane.add(p1);
        Persoana p2 = new Persoana("Ion", 15, "Arad");
        persoane.add(p2);
        Persoana p3 = new Persoana("Ana", 21, "Sibiu");
        persoane.add(p3);
        Persoana p4 = new Persoana("Denisa", 22, "Cluj");
        persoane.add(p4);

        System.out.println("Lista inainte de stergere: ");
        for (Persoana p : persoane) {
            System.out.println(p);
        }

        persoane.remove(p2);

        System.out.println("\nLista dupa stergere");
        for (Persoana p : persoane) {
            System.out.println(p);
        }
    }


    public static void afisareAnimal() {
        Set<Animal> animals = new TreeSet<>(new CompareAnimalByNume());
        Animal a1 = new Animal(1, "maimujta", "numeMaimutica");
        animals.add(a1);
        Animal a2 = new Animal(2, "caine", "Ares");
        animals.add(a2);
        Animal a3 = new Animal(3, "pisica", "Roze");
        animals.add(a3);

        for (Animal a : animals) {
            System.out.println(a);
        }


    }


    public static void afisareLiceu() {
        Set<Liceu> liceuLista = new TreeSet<>(new CompareLiceuByNumeLiceu());
        Liceu l1 = new Liceu("CEVM", "Bucuresti", 200);
        liceuLista.add(l1);
        Liceu l2=new Liceu("ZCHB", "Otopeni",250);
        liceuLista.add(l2);
        Liceu l3=new Liceu("MihaiC", "Brasov",500);
        liceuLista.add(l3);

        for (Liceu l: liceuLista){
            System.out.println(l);
        }
    }


    public static void afisareMasina(){
        Set <Masina> listaMasina=new TreeSet<>(new CompareMasinaByModel());
        Masina m1=new Masina("seria3", "rosu",100);
        listaMasina.add(m1);
        Masina m2=new Masina("q8", "negru",250);
        listaMasina.add(m2);
        Masina m3=new Masina("fiesta","albastru",500);
        listaMasina.add(m3);

        for(Masina m: listaMasina){
            System.out.println(m);
        }
    }


    public void afisareAnimalMap(){
        Map<String, Animal> animalMap=new HashMap<>();
        Animal a1=new Animal("caine", "ares");
        animalMap.put("andrei",a1);
        Animal a2=new Animal("pisica","roze");
        animalMap.put("alex",a2);
        Animal a3=new Animal("maimuta", "maimuta");
        animalMap.put("ciprian",a3);

        System.out.println(animalMap.get("andrei"));


    }

    
}

