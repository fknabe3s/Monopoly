package com.company;

public class Main {

    public static void main(String[] args) {

        Die Die0 = new Die(1, 6);

        for(int i=0; i<9; i++){
            System.out.println (Die0.roll());
        }
    }
}
