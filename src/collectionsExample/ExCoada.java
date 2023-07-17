package collectionsExample;

import model.Persoana;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public abstract class ExCoada  {


    public static  void ex(){
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


}
