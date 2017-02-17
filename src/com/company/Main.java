package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("enter name of Player 1");
        String player1 = keyboard.nextLine().toUpperCase();

        System.out.println("enter name of Player 2");
        String player2 = keyboard.nextLine().toUpperCase();

        Match match = new Match();
        View view = new View();

        Controller controller = new Controller(view, match, player1, player2);

       view.setVisible(true);


    }
}
