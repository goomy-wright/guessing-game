package com.game;

import java.util.Scanner;

public class Main {
    /**
     * <h3>This is a simple console game where you have to guess a hidden number</h3>
     *
     * @param args Command Line Arguments
     * @author Goomy Wright
     * @since 24/10/21
     * @version 1.0
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 8, guess, countGuess = 0, maxGuess = 3;
        boolean outOfGuess = false;

        while (!outOfGuess) {
            if (countGuess < maxGuess) {
                System.out.println((maxGuess - countGuess) + " guesses left");
                System.out.print("Guess: ");
                guess = input.nextInt();

                if (guess == number) {
                    System.out.println("You win");
                    break;
                }
                countGuess++;
            } else {
                System.out.println("You lost\nOur number was " + number);
                outOfGuess = true;
            }
        }
    }
}
