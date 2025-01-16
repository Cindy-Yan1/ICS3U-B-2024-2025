package day2;

public class car {
    private String name; 
    private String model; 
    private int year; 
    private double mileage; 

    public car(String name, String model, int year, double mileage){
        this.name = name;
        this.model = model;
        this.year = year;
        this.mileage = mileage; 
    }

    public void setName(String newName){
        name = newName; 
    }

    public void setModel(String newModel){
        model = newModel; 
    }

    public void setYear(int newYear){
        year = newYear; 
    }

    public void setMileage(double newMileage){
        mileage = newMileage; 
    }


    public String getName(){
        return name; 
    }

    public String getModel(){
        return model; 
    }

    public int getYear(){
        return year;
    }

    public double getMileage(){
        return mileage; 
    }

    public void displayCarDetails(){
        System.out.println("Make = " + name + " Model = " + model + " Year = " + year + " Mileage = " + mileage);
    }

    public void drive(double milesDriven){
        this.mileage += milesDriven;
        System.out.println("New mileage: " + mileage);
    }


}
