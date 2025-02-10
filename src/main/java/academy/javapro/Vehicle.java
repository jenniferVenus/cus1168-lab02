package academy.javapro;

public abstract class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected boolean isRunning;

    //Constructor
    public Vehicle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
        this.isRunning = false;
    }

    
    //Abstract Methods

    public abstract void startEngine();
        
    public abstract void stopEngine();

    public abstract void accelerate();

    public abstract void brake();

    // Setters and Getters

    public void setMake(String make)
    {
        this.make = make;
    }

    public String getMake()
    {
        return make;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getModel()
    {
        return model;
    }

    public void setYear(int year)
    {
        this.year=year;
    }

    public int getYear()
    {
        return year;
    }

    public void setIsRunning(boolean isRunning)
    {
        this.isRunning = isRunning;
    }

    public boolean getIsRunning()
    {
        return isRunning;
    }




}