package com.bridgeit.cards;

import java.util.Arrays;

public class DeckOfCards {

	String player1[][] = new String[1][9];
	String player2[][] = new String[1][9];
	String player3[][] = new String[1][9];
	String player4[][] = new String[1][9];

	public void destributeCards(String[] deck) {

		int j = 0, k = 0, l = 0, m = 0;
		for (int i = 0; i < deck.length; i++) {
			if (j < 9 || k < 9 || l < 9 || m < 9) {
				if (i % 4 == 0) {
					player1[0][j] = deck[i];
					j++;
				} else if (i % 4 == 1) {
					player2[0][k] = deck[i];
					k++;
				} else if (i % 4 == 2) {
					player3[0][l] = deck[i];
					l++;
				} else if (i % 4 == 3) {
					player4[0][m] = deck[i];
					m++;
				}
			}
		}

		System.out.println("player 1 cards : ");
		for (int i = 0; i < player1[0].length; i++) {
			System.out.print(player1[0][i] + " ");
		}
		System.out.println();

		System.out.println("player 2 cards : ");
		for (int i = 0; i < player2[0].length; i++) {
			System.out.print(player2[0][i] + " ");
		}
		System.out.println();

		System.out.println("player 3 cards : ");
		for (int i = 0; i < player3[0].length; i++) {
			System.out.print(player3[0][i] + " ");
		}
		System.out.println();

		System.out.println("player 4 cards : ");
		for (int i = 0; i < player4[0].length; i++) {
			System.out.print(player4[0][i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		String[] deck = new String[52];
		String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
		String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		int count = 0;
		// Initialize the deck
		for (int i = 0; i < suits.length; i++) {

			for (int j = 0; j < ranks.length; j++) {

				deck[count] = suits[i] + "-" + ranks[j];
				count++;
			}
		}

		// shuffle the cards
		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < deck.length; i++) {

				int randomIndex = (int) Math.floor(Math.random() * 52);
				String temp = deck[i];
				deck[i] = deck[randomIndex];
				deck[randomIndex] = temp;
			}
		}

		for (int i = 0; i < deck.length; i++) {
			System.out.println(deck[i]);
		}
		DeckOfCards deckOfCards = new DeckOfCards();
		deckOfCards.destributeCards(deck);
	}
}
