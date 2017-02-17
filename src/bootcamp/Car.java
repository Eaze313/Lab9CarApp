package bootcamp;

/**
 * James Bryant II
 * 2/16/17
 * CarApp.java
 *
 */
public class Car {
    //Set instances
    private String make;
    private String model;
    private int year;
    private double price;


    //First Constructor - No Arguments
    public Car () {
        make = "";
        model = "";
        year = 0;
        price = 0;
    }
    //Second Constructor - Takes "All Arguments"
    public Car (String make, String model, int year, double price) {

        //taking arguments
        //storing their values in the instance variables
        //because the local variables/arguments will run out of scope
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    //toString() method to produce a string combination of the
    // various variables (lol)
    @Override
    public String toString() {
        return make + '\t' +
                model + "\t\t" +
                 year + "\t " + "$" + price;

    }

    //Getter and Setter: Make
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }

    //Getter and Setter: Model
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    //Getter and Setter: Year
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    //Getter and Setter: Price
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}

