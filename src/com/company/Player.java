package com.company;

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

    int getMoney() {
        return credit;
    }

    void setMoney(int ammount){
        credit = ammount;
    }

    void kaufen(int position){

    }


}