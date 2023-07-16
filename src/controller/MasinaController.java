package controller;

import model.Masina;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MasinaController {

    private List<Masina>masini;

    public MasinaController(List<Masina> masini){
        this.masini=masini;
    }

    public MasinaController(){
        this.masini=new ArrayList<>();
        this.load();

    }

    public void load(){
        try{
            File file=new File("C:\\mycode\\OOP\\Colectii-lectia1\\src\\data\\masina.txt");
            Scanner scanner=new Scanner(file);
            while (scanner.hasNextLine()){
                Masina masina=new Masina(scanner.nextLine());
                this.masini.add(masina);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public  void afisareMasina(){
        Iterator<Masina> iterator=masini.iterator();
        while (iterator.hasNext()) {

            Masina m = iterator.next();

            System.out.println(m.toString());
        }

    }


    public void addMasina(Masina masina){
        masini.add(masina);
    }

    //dif: am model --> masina
    public void stergereMasian(String model){
        Iterator<Masina> iterator= masini.iterator();
        while(iterator.hasNext()){
            Masina masina=iterator.next();
            if(masina.getModel().equals(model)){
                iterator.remove();
            }
        }

    }


    //todo: editare

    public void editareMasina(String culoare, String culoareNoua){
        Iterator<Masina> iterator= masini.iterator();
        while(iterator.hasNext()){
            Masina masina=iterator.next();
            if(masina.getCuloare().equals(culoare)){
                masina.setCuloare(culoareNoua);
            }
        }



    }
    public Masina findMasinaByModel(String model){
      Iterator<Masina> iterator= masini.iterator();
      while (iterator.hasNext()){
          Masina masina=iterator.next();
          if(masina.getModel().equals(model)){
              return masina;
          }
      }
      return null;
    }

}
