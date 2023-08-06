package comparators;

import model.Persoana;

import java.util.Comparator;

public class ComparePersoanaByVarsta implements Comparator<Persoana> {


    @Override
    public int compare(Persoana o1, Persoana o2) {

         if(o1.getVarsta()>o2.getVarsta()){
             return 1;
         }else if(o1.getVarsta()<o2.getVarsta()){
             return -1;
         }else return 0;
    }


}
