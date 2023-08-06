package comparators;

import model.Liceu;

import java.util.Comparator;

public class CompareLiceuByOras implements Comparator<Liceu> {
    @Override
    public int compare(Liceu o1, Liceu o2) {
        if(o1.getOras().compareTo(o2.getOras())>0){
            return 1;
        }else if(o1.getOras().compareTo(o2.getOras())<0){
            return -1;
        }else return 0;
    }
}
