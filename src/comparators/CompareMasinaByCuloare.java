package comparators;

import model.Masina;

import java.util.Comparator;

public class CompareMasinaByCuloare implements Comparator<Masina> {
    @Override
    public int compare(Masina o1, Masina o2) {
        if(o1.getCuloare().compareTo(o2.getCuloare())>0){
            return 1;
        }else if(o1.getCuloare().compareTo(o2.getCuloare())<0){
            return -1;
        }else return 0;
    }
}
