package model;

public interface AnimalBuilder {



    Animal  id(int id);
    Animal tipAnimal(String tipAnimal);

    Animal nume(String nume);

    static Animal build(){
        return new Animal();
    }
}
