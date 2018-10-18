package edu.vtc.cis2271.com;

/*
1) Write a method called dieRoll that will return random number from 1 to 6
2) Write yahtzeeRoll method that returns an array of 5 ints, each generated by dieRoll.
3) Write a method displayRoll that will display the 5 dice in the input array.
4) Write a method total that will return the total of the 5 dice passed in in an array.
*/


public class Yahtzee {
    public static void main(String[] args) {
            int[] hand = new int[5];
            int total = 0;
            hand = yahtzeeRoll(hand);
            displayRoll(hand);
            System.out.println("total = " + total(hand,total));
        }

        public static int dieRoll(){
            int roll=(int)Math.floor(Math.random()*6)+1;
            return roll;
        }
        public static int[] yahtzeeRoll (int[] hand) {
            for (int die = 0; die < 5; die++) hand[die] = dieRoll();
            return hand;
        }
        public static int total (int[] hand, int total) {
            for (int die = 0; die < 5; die++)  total += hand[die];
            return total;
        }
        public static void displayRoll (int [] hand) {
            for (int die = 0; die < 5; die++) {
                if (die < 4) System.out.print(hand[die] + " : ");
                else System.out.println(hand[die]);
            }
        }
    }
