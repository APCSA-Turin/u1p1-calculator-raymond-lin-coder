package com.example;
import java.util.Scanner;
public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW
        //Learned how to use Math.round() from https://www.w3schools.com/java/ref_math_round.asp
        //Alfred helped me with this section
        double totalTip = (Math.round(100 * (cost * percent / 100))) / 100.0; //rounds to the nearest cent/hundredth
        double totalCost = cost + totalTip;
        double perPersonCost = (Math.round((100 * (cost / people)))) / 100.0; //rounds to the nearest cent/hundredth
        double tipPerPerson = (Math.round((100 * (totalTip / people)))) / 100.0; //rounds to the nearest cent/hundredth
        double totalPerPerson = (Math.round((100 * ((cost/people) + ((cost * percent / 100) / people))))) / 100.0; //rounds to the nearest cent/hundredth
        String result = "-------------------------------\n" +
                       "Total bill before tip: $" + cost + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + totalTip + "\n" +
                       "Total Bill with tip: $" + totalCost + "\n" +
                       "Per person cost before tip: $" + perPersonCost + "\n" +
                       "Tip per person: $" + tipPerPerson + "\n" +
                       "Total cost per person: $" + totalPerPerson + "\n" +
                       "-------------------------------\n";

        return result;
    }

    public static String extraCredit(int people, int percent, double cost) {
        //Bingyan helped me with this section
        boolean condition = true;
        //  COPY AND PASTE YOUR PROGRAM FROM calculateTip() HERE 
        double totalTip = (Math.round(100 * (cost * percent / 100))) / 100.0; //rounds to the nearest cent/hundredth
        double totalCost = cost + totalTip;
        double perPersonCost = (Math.round((100 * (cost / people)))) / 100.0; //rounds to the nearest cent/hundredth
        double tipPerPerson = (Math.round((100 * (totalTip / people)))) / 100.0; //rounds to the nearest cent/hundredth
        double totalPerPerson = (Math.round((100 * ((cost/people) + ((cost * percent / 100) / people))))) / 100.0; //rounds to the nearest cent/hundredth
        // the while loop condition is checked,
        // and if TRUE, runs the code inside.
        // when the code inside is done running, the condition is rechecked,
        // and the loop repeats as long as the condition remains TRUE.
        // when the condition becomes FALSE, it stops
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an item name or type -1 to finish: ");
        String itemName = scan.nextLine();
        String stop = "-1";
        String itemList = "Items ordered:\n";
        while (condition) {
            if (itemName.equals(stop)) {
                //learned how to use .equals from Sachin
                condition = false;
                break;
                // learned how to use break from https://www.w3schools.com/java/ref_keyword_break.asp
            }
            itemList += itemName + "\n";
            System.out.println("Enter an item name or type -1 to finish:");
            itemName = scan.nextLine();
            // Learned how to use .equals from https://stackoverflow.com/questions/513832/how-do-i-compare-strings-in-java
        }
        scan.close();
        String result = "-------------------------------\n" +
                       "Total bill before tip: $" + cost + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + totalTip + "\n" +
                       "Total Bill with tip: $" + totalCost + "\n" +
                       "Per person cost before tip: $" + perPersonCost + "\n" +
                       "Tip per person: $" + tipPerPerson + "\n" +
                       "Total cost per person: $" + totalPerPerson + "\n" +
                       "-------------------------------\n" +
                       itemList + 
                       "-------------------------------\n";
        return result;
    }
    
    
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people= 6; 
        int percent= 25;
        double cost= 52.27;              
        System.out.println(extraCredit(people, percent, cost));

    }
}
        
