package com.company;

import java.util.ArrayList;
import java.util.List;



public class Main {



    public static void main(String[] args) {


        Player Player1 = new Player("Daniel", 1000, "rotes_Auto");
        List<ImmoTest> ImmobilienListe = new ArrayList<>();

        ImmobilienListe.add(new StraßeTest(0,"Los",0));
        ImmobilienListe.add(new StraßeTest(1,"Schlossstraße",100));
        ImmobilienListe.add(new StraßeTest(2,"Grantham-Allee",1100));
        ImmobilienListe.add(new WerkTest(3,"Wasserwerk",100));
        ImmobilienListe.add(new StraßeTest(4,"Hauptstraße",100));
        ImmobilienListe.add(new StraßeTest(5,"B56",100));




        Player1.kaufen(0, ImmobilienListe);
        Player1.kaufen(1, ImmobilienListe);
        Player1.kaufen(2, ImmobilienListe);
        Player1.kaufen(6, ImmobilienListe);

        System.out.println();
        Player1.kaufen(1, ImmobilienListe);


        //Die Die0 = new Die(1, 6);

        //for(int i=0; i<9; i++){
        //    System.out.println (Die0.roll());
        //}
    }
}
