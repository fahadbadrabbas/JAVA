/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jcapstone.fahadabbas;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class JCapstoneFahadAbbas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random ra = new Random();

        int gamevar = 3;
        while (gamevar > 0) {
            System.out.println("Please pick one of the available games:\n " + "\nRPS: Rock - Paper - Scissors\nHT: Head - Tail\nDG: Dice Game\nHL: High - Low\nPAL: Palindrome\nLDM: Let's Do Math\nFACT: Factorial\nSORT: Sorting \n \n or 'exit' to exit the game");

            String game = input.nextLine();

            game = game.toLowerCase();
            switch (game) {
                
                //Used methods to call each game 
                //RPS
                case "rps":
                    RPS();

                //HT                    
                case "ht":
                    HT();

                //DG
                case "dg":
                    DG();

                //Palindrome Game
                case "pal":
                    PAL();

                //High or Low Game
                case "hl":
                    HL();

                //Let's Do Math
                case "ldm":
                    LDM();

                //Factorial Game
                case "fact":
                    FACT();

                //Sorting Game 
                case "sort":
                    SORT();
                    
                //To leave the games
                case "exit":
                    System.exit(7);
                    
            }
        }
    }

    //Rock-Paper-Scissors Game                   
    public static void RPS() {
        Scanner input = new Scanner(System.in);
        Random ra = new Random();

        System.out.print("Player one choose your move: rock, paper, or scissors.\n ");
        String firstmove = input.nextLine();

        
        if (firstmove.equalsIgnoreCase("rock") || firstmove.equalsIgnoreCase("paper") || firstmove.equalsIgnoreCase("scissors")) {

            int random = ra.nextInt(3);
            String p2move = "";
            if (random == 0) {
                p2move = "rock";
            } else if (random == 1) {
                p2move = "paper";
            } else {
                p2move = "scissors";
            }
            System.out.println("Player two move: " + p2move);
            if (firstmove.equals(p2move)) {
                System.out.println("It is a tie!");
            } else if ((firstmove.equals("rock") && p2move.equals("scissors")) || (p2move.equals("scissors") && p2move.equals("paper")) || (p2move.equals("paper") && p2move.equals("rock"))) {
                System.out.println("You have won!");
            } else {
                System.out.println("You have lost!");
            }

        } 
            else {
                System.out.println("Your move is not valid!");
                RPS();
        }
        // Used in each game to ask the user whether they would like to continue playing or not
        System.out.println("Would you like to play the next game? ");
        String next_rps = input.nextLine();
        if (next_rps.equalsIgnoreCase("no")) {
            System.exit(8);
        }
        if (next_rps.equalsIgnoreCase("yes")) {
             HT();
        }
         RPS();
    }


    //Heads and Tails                        
    public static void HT() {
        Scanner input = new Scanner(System.in);
        Random ra = new Random();

        System.out.print("Player one enter your choice heads or tails:\n ");
        String p1 = input.nextLine();
        System.out.println("Player two enter your choice heads or tails: ");
        String p2 = input.nextLine();
        if (!p1.equalsIgnoreCase("heads") && !p1.equalsIgnoreCase("tails")){ 
            System.out.println("Your move is not valid!");
            HT();
        } 
        else if(!p2.equalsIgnoreCase("heads")&& !p2.equalsIgnoreCase("tails")){
            System.out.println("Your move is not valid!");
            HT();
        }
        else {

            int heads = 0;
            int tails = 0;

            for (int i = 0; i < 4; i++) {
                int random = ra.nextInt(2);
                if (random == 0) {
                    heads++;
                } else {
                    tails++;
                }
            }
            System.out.println("Chances = 4");
            System.out.println("Heads: " + heads);
            System.out.println("Tails: " + tails);
            if (heads > tails) {
                System.out.println("Heads wins!");
            } else if (heads < tails) {
                System.out.println("Tails wins!");
            } else {
                System.out.println("Tie!");
            }

        }
       
                
        System.out.println("Would you like to play the next game? ");
        String next_ht = input.nextLine();
        if (next_ht.equalsIgnoreCase("no")) {
            System.exit(8);
        }
        if (next_ht.equalsIgnoreCase("yes")) {
             DG();
        }
        HT();
    }

    //Dice Game
    public static void DG() {
        Scanner input = new Scanner(System.in);
        int d1;
        int d2;

        d1 = (int) (Math.random() * 6) + 1;
        d2 = (int) (Math.random() * 6) + 1;

        System.out.println("Player 1, your number is " + d1);
        System.out.println("Player 2, your number is " + d2);
        if (d1 > d2) {
            System.out.println("The winner is Player 1! ");
        } else if (d1 < d2) {
            System.out.println("The winner is Player 2! ");
        } else {
            System.out.println("It is a Tie!");
        }

        System.out.println("Would you like to play the next game? ");
        String next_dg = input.nextLine();
        if (next_dg.equalsIgnoreCase("no")) {
            System.exit(8);
        }
        if (next_dg.equalsIgnoreCase("yes")) {
             HL();
        }
         DG();
    }

    //High or Low game
    public static void HL() {
        Scanner input = new Scanner(System.in);
        Random ra = new Random();

        int number = 0;
        int rnumb = ra.nextInt(10);

        for (int i = 0; i < 3; i++) {
            System.out.println("I chose a number, make a guess between 1-10: ");
            int g = input.nextInt();

            if (g == rnumb) {
                System.out.println("Correct, You Won!");
                break;
            } else if (g < rnumb) {
                System.out.println("Higher, try again");
            } else if (g > rnumb) {
                System.out.println("Lower, try again");
            }

            if (i == 2) {
                System.out.println("The number is " + rnumb + "!" + "\nHard luck! Try again");
            }
 
        }
       System.out.println("Would you like to play the next game? ");
        String next_hl = input.next();
        if (next_hl.equalsIgnoreCase("no")) {
            System.exit(8);
        }
        if (next_hl.equalsIgnoreCase("yes")) {
             PAL();
        }
         HL();
    }

    // Palindrome game
   
    public static void PAL() {
    int score1 = 0;
    int score2 = 0;
    Scanner input = new Scanner(System.in);
        do{
        
        System.out.println("Player 1, Enter a string to check if it is a palindrome: ");

        String op1 = input.nextLine();
        boolean w1 = false;

        if(isPalindrome(op1)){
            System.out.println("It is a palindrome");
            w1 = true;
            score1++;
        }
        else System.out.println("It is not a palindrome.");

        System.out.println("Player 2 Enter a string to check if it is a palindrome");
        String choice2 = input.nextLine();
        boolean w2 = false;

        if(isPalindrome(choice2)){
            System.out.println("It is a palindrome");
            w2 = true;
                    score2++;
        }else System.out.println("It is not a palindrome.");

        if(w1 && w2) PAL();
        
        else if(w1){
            System.out.println("Player 1 wins");
            break;
        }
        
        else if(w2){
            System.out.println("Player 2 wins");
            break;
        }
        else{
            System.out.println("The score is the same, you will repeat");
            PAL();
        }
        }while(score1 != score2);
    

        System.out.println("Would you like to play the next game? ");
        String next_pal = input.next();
        if (next_pal.equalsIgnoreCase("no")) {
            System.exit(8);
        }
        if (next_pal.equalsIgnoreCase("yes")) {
            LDM();
        }
         PAL();
    }
    public static boolean isPalindrome(String s){
        int i = 0, full = s.length() - 1;
        while (i < full) {
            if (s.charAt(i) != s.charAt(full)){
                return false;
            }
            i++;
            full--;
        }
        return true;
    }

    // Let's Do Math Game
    public static void LDM() {
        Scanner input = new Scanner(System.in);
        int scoreLDM1 = 0;
        int scoreLDM2 = 0;

        do{
        System.out.println("Player one enter your number, the square root of it, and the number to the power of 2: ");

        int numb = input.nextInt();
        int sqrt = input.nextInt();
        int exp = input.nextInt();

        System.out.println("Player two enter your number, the square root of it, and the number to the power of 2: ");
        int numb2 = input.nextInt();
        int sqrt2 = input.nextInt();
        int exp2 = input.nextInt();

        if (sqrt == Math.sqrt(numb) && exp == Math.pow(numb, 2)) {
            System.out.println("Player 1 got it correct!");
            scoreLDM1++;
        } else {
            System.out.println("Player 1 you are wrong!");
        }

        if (sqrt2 == Math.sqrt(numb2) && exp2 == Math.pow(numb2, 2)) {
            System.out.println("Player 2 got it correct!");
            scoreLDM2++;
        } else {
            System.out.println("Player 2 you are wrong!");
        }
        if(scoreLDM1 == scoreLDM2){
            System.out.println("The score is a tie, the game will repeat");
        }
        
        }while(scoreLDM1 == scoreLDM2);

        System.out.println("Would you like to play the next game? ");
        String next_ldm = input.next();
        if (next_ldm.equalsIgnoreCase("no")) {
            System.exit(6);
        }
        else{
            FACT();
        }
            
    }

    //Factorial Game
    public static void FACT() {
        Scanner input = new Scanner(System.in);
        boolean flag = true;

        while (true) {
            System.out.println("Please enter a number: ");
            int numbb = input.nextInt();
            if (numbb == 0) {
                break;
            } else {
                long factorial = 1;
                for (int i = 1; i <= numbb; i++) {
                    factorial *= i;
                }

                System.out.println("The factorial of " + numbb + " is " + factorial);
            }

        }

        System.out.println("Would you like to play the next game? ");
        String next_fact = input.next();
        if (next_fact.equalsIgnoreCase("no")) {
            System.exit(8);
        }
        if (next_fact.equalsIgnoreCase("yes")) {
             SORT();
        }
        FACT();
    }

    // Sorting Game
    public static String SORT() {
        Scanner input = new Scanner(System.in);

        int var = 6;
        while (var >= 3) {
            int[] array = {91, 82, 3, 125, 43};
            System.out.println(Arrays.toString(array));

            int[] userinput = new int[5];
            for (int i = 0; i < userinput.length; i++) {
                userinput[i] = input.nextInt();
            }

            Arrays.sort(array);

            if (Arrays.toString(array).equals(Arrays.toString(userinput))) {
                System.out.println("Correct! You won.");
                break;
            } else {
                System.out.println("Try again!");
                var--;
            }
            if (var == 3) {
                System.out.println("No more trials left!");
                break;
            }
        }
         
            System.out.println("Congratulations you completed all the games. Would you like to restart? ");
            String next_sort = input.next();
            if (next_sort.equalsIgnoreCase("no")) {
                        System.exit(8);
                    }
                    if (next_sort.equalsIgnoreCase("yes")) {
                         RPS();
                    }
                    SORT();
    
    
        System.out.println("Do you want to restart?");
        String restart = input.next();
        if(restart.equalsIgnoreCase("yes")){
           
            RPS();
        }else{
            System.out.println("Thankyou for playing the game");
            System.exit(69);
        }
        
        return null;
    }
    
    }

