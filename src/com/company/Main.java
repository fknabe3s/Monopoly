package com.company;

import java.util.ArrayList;
import java.util.List;



public class Main {


    public static void main(String[] args) {

        List<ImmoTest> ImmobilienListe = new ArrayList<>();


        ImmobilienListe.add(new StraßeTest(0,"Los"));
        ImmobilienListe.add(new WerkTest(1,"sued"));
        ImmobilienListe.add(new WerkTest(2,"ost"));
        ImmobilienListe.add(new StraßeTest(3,"Str1"));
        ImmobilienListe.add(new StraßeTest(4,"Str2"));



        Player.kaufen(1, ImmobilienListe);
        Player.kaufen(2, ImmobilienListe);
        Player.kaufen(3, ImmobilienListe);


        //System.out.print(Wasserwerk.name);

        //Die Die0 = new Die(1, 6);

        //for(int i=0; i<9; i++){
        //    System.out.println (Die0.roll());
        //}
    }
}
