package com.company;

import java.util.ArrayList;
import java.util.List;



public class Main {


    public static void main(String[] args) {

        List<ImmoTest> ImmobilienListe = new ArrayList<>();


        ImmobilienListe.add(new StraßeTest(0,"Los"));
        ImmobilienListe.add(new StraßeTest(1,"Schlossstraße"));
        ImmobilienListe.add(new StraßeTest(2,"Grantham-Allee"));
        ImmobilienListe.add(new WerkTest(3,"Wasserwerk"));
        ImmobilienListe.add(new StraßeTest(4,"Hauptstraße"));
        ImmobilienListe.add(new StraßeTest(5,"B56"));



        Player.kaufen(0, ImmobilienListe);
        Player.kaufen(1, ImmobilienListe);
        Player.kaufen(2, ImmobilienListe);
        Player.kaufen(6, ImmobilienListe);


        //System.out.print(Wasserwerk.name);

        //Die Die0 = new Die(1, 6);

        //for(int i=0; i<9; i++){
        //    System.out.println (Die0.roll());
        //}
    }
}
