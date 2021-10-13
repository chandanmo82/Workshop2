package com.company;

import java.util.Random;

public class DeckOfCards {
    int[][] cards = new int[4][13];    //	array of cards

    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();    //	class object

        //	allots cards for each player
        for (int playerNumber = 1; playerNumber <= 4; playerNumber++) {

            System.out.println("Player " + playerNumber + "'s cards:");

        }
    }
}