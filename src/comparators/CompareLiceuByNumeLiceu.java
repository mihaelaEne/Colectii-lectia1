package comparators;

import model.Liceu;

import java.util.Comparator;

public class CompareLiceuByNumeLiceu implements Comparator<Liceu> {
    @Override
    public int compare(Liceu o1, Liceu o2) {
        if(o1.getNumeLiceu().compareTo(o2.getNumeLiceu())>0){
            return 1;
        }else if(o1.getNumeLiceu().compareTo(o2.getNumeLiceu())<0){
            return -1;
        }else return 0;
    }
}
