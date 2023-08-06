package comparators;

import model.Animal;

import java.util.Comparator;

public class CompareAnimalById implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        if(o1.getId()>o2.getId()){
            return -1;
        }else if(o1.getId()<o2.getId()){
            return 1;
        }else return 0;
    }
}
