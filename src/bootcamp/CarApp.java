package bootcamp;
/**
 * James Bryant II
 * 2/16/17
 * CarApp.java
 * Lab9
 */

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        //Welcome User
        System.out.println("Welcome to the Virtual Car Lot!");

        // Called method from Validator class
        int numCars = Validator.getInt(user, "Please enter the Number " +
                "of Cars to Compare: ");

        //create an array to hold the cars
        ArrayList<Car> CarsList = new ArrayList<>(numCars);


        //for Loop to input data into CarArray
        // includes call to Validator for methods to confirm correct input
        for (int i = 0; i < numCars; i++) {
            //Calls methods from the Validator class - checks data type is
            // proper, then returns the  user input
            String make = Validator.getString(user, "Please Enter the Make of Car: "  );

            String model = Validator.getString(user,"Please Enter the Model of Car: " );


            int year = Validator.getInt(user,"Please Enter the Year it was made: ", 1886, 2018 );

            double price = Validator.getDouble(user,"Pleas Enter the Price of the Car: " );

            Car c = new Car(make, model, year, price);
            CarsList.add(c);

        }
        //Outputs Comparisons
        System.out.println("Here are your Comparison(s): ");
        System.out.println(" ");

        // Enhanced For Loop to print the amount of cars constructed
        // in the ArrayList
        for ( Car c : CarsList ) {
            System.out.println(c);
        }
    }
}
