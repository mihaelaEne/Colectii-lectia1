package controller;

import model.Animal;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AnimalController {
    private List<Animal> animale;
    public AnimalController(List<Animal> animale){
        this.animale=animale;
    }

    public AnimalController(){
        this.animale=new ArrayList<>();
        this.load();
    }

    public void load(){
        try {
            File file=new File("C:\\mycode\\OOP\\Colectii-lectia1\\src\\data\\animal.txt");
            Scanner scanner=new Scanner(file) ;
            while (scanner.hasNextLine()){
                Animal animal=new Animal(scanner.nextLine());
                this.animale.add(animal);
            }
        }catch (Exception e ){
            e.printStackTrace();
        }
    }

    public void afisareAnimal(){
        Iterator<Animal> iterator=animale.iterator();
        while(iterator.hasNext()){
            Animal a=iterator.next();
            System.out.println(a.toString());
        }
    }

    public void addAnimal(Animal animal){
        animale.add(animal);
    }

    public void stergereAnimal(int id){
        Iterator<Animal> iterator=animale.iterator();
        while(iterator.hasNext()){
            Animal a=iterator.next();
            if(a.getId()==id){
                iterator.remove();
            }
        }

    }


    public Animal findBuId(int id){
        Iterator<Animal> iterator=animale.iterator();
        while(iterator.hasNext()){
            Animal animal=iterator.next();
            if (animal.getId()==id){
                return animal;
            }
        }
        return null;
    }
    public void editareAnimal(String nume, String numeNou){
        Iterator<Animal> iterator=animale.iterator();
        while(iterator.hasNext()){
            Animal a=iterator.next();
            if(a.getNume().equals(nume)){
                a.setNume(numeNou);
            }
        }

    }

}
