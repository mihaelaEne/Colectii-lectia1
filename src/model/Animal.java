package model;

import java.util.Objects;

public class Animal implements Comparable<Animal> {
    private int id;
    private String tipAnimal;
    private String nume;

    public Animal(int id, String tipAnimal, String nume) {
        this.id = id;
        this.tipAnimal = tipAnimal;
        this.nume = nume;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipAnimal() {
        return tipAnimal;
    }

    public void setTipAnimal(String tipAnimal) {
        this.tipAnimal = tipAnimal;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", tipAnimal='" + tipAnimal + '\'' +
                ", nume='" + nume + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return id == animal.id && tipAnimal.equals(animal.tipAnimal) && nume.equals(animal.nume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tipAnimal, nume);
    }


    @Override
    public int compareTo(Animal o) {
        if (this.tipAnimal.compareTo(o.tipAnimal) > 0) {
            return 1;
        } else if (this.tipAnimal.compareTo(o.tipAnimal) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
