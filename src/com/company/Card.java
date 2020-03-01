package com.company;

import java.util.ArrayList;

public class Card {
    private ArrayList<Square> squares;

    Card() {
        squares = new ArrayList<Square>(49);
        for (int i = 0; i < 49; i++) {
            Square newSquare = new Square();
            squares.add(newSquare);
        }
    }



}