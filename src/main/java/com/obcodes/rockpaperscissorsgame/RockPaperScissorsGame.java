/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.obcodes.rockpaperscissorsgame;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Obakeng Phale
 */
public class RockPaperScissorsGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Rock Paper Scissors Game");
        System.out.println("You will play against the computer");
        System.out.println("To make things easier, type:");
        System.out.println("r for rock, p for paper, s for scissors");
        System.out.print("Your choice: ");
        String userChoice = input.nextLine().toLowerCase();
        var random = new Random();
        String[] computerChoices = {"rock","paper", "scissors"};

        String[] choices = {"rock", "paper", "scissors"};
        int randomIndex = random.nextInt(choices.length);
        String computerChoice = choices[randomIndex];
        
        // Convert user shortcuts to full words
        if (userChoice.equals("r")) userChoice = "rock";
        else if (userChoice.equals("p")) userChoice = "paper";
        else if (userChoice.equals("s")) userChoice = "scissors";
        
        System.out.println("You chose: " + userChoice);
        System.out.println("Computer chose: " + computerChoice);
        
        // Determine winner
        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        }else if (userChoice.equals("rock") && computerChoice.equals("scissors")) {
            System.out.println("Rock crushes scissors. You win!");
        }else if (userChoice.equals("paper") && computerChoice.equals("rock")) {
            System.out.println("Paper covers rock. You win!");
        }else if (userChoice.equals("scissors") && computerChoice.equals("paper")) {
            System.out.println("Scissors cut paper. You win!");
        }else{
            System.out.println(computerChoice + " beats " + userChoice + ". Computer wins!");
        }
        input.close();    
    }
}
