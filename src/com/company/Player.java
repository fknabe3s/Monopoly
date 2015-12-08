package com.company;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private int credit;
    private String symbol;
    int position;

    //Konstruktor
    Player (String name_konstr, int money_konstr, String symbol_konstr) {  //Name festlegen und Symbol/Spielfigur (kann später nicht mehr geändert werden), Startkapital festlegen
        this.name = name_konstr;
        this.credit = money_konstr;
        this.symbol = symbol_konstr;
    }

    String getName(){
        return name;
    }

    public int getMoney() {
        return credit;
    }

    void setMoney(int ammount){
        credit = ammount;
    }

    public void kaufen(int position, List<ImmoTest> ImmobilienListe){
        if(position==0){
            System.out.println("Los kann nicht gekauft werden!");
            return;
        }


        for(ImmoTest i : ImmobilienListe) {  // gewünschtes Element suchen
            if (i.position == position){
                System.out.println("Player möchte " + i.name + " kaufen");
                if (i.wert <= getMoney()) {
                    System.out.println("Player hat genug Geld!");
                    if(i.kaufen(name)) {                //kaufen war erfolgreich
                        credit -= i.wert;
                        System.out.println("Spieler " + name + " hat jetzt noch " + credit + " Dollar");
                    }                     // kaufen wird beauftragt, dabei wird geprüft, ob das Objekt noch frei ist
                }
                else{
                    System.out.println("Player hat nicht genug Geld!");         // es wird nicht versucht das Objekt zu kaufen und die Methode verlassen
                }
                return;
            }
        }

        System.out.println("An der Position " + position + " existiert keine Straße");
    }


}
