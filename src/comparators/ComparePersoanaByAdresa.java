package comparators;

import model.Persoana;

import java.util.Comparator;

public class ComparePersoanaByAdresa implements Comparator<Persoana> {
    @Override
    public int compare(Persoana o1, Persoana o2) {
        if(o1.getAdresa().compareTo(o2.getAdresa())>0){
            return 1;
        }else if(o1.getAdresa().compareTo(o2.getAdresa())<0){
            return -1;
        }else return 0;
    }
}
