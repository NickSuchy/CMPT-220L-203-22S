package base;

public abstract class Vehicle {
    Boolean hasEngine;
    private Integer numOfWheels;
    protected Boolean hasRoof;

    public Vehicle(Boolean hasRoof) {
        this.hasRoof = hasRoof;
    }

    protected void go(){
        System.out.println("I'm going!");
    }

    public Integer getNumOfWheels(){
        return this.numOfWheels;
    }
    
    public void setNumOfWheels(Integer NumOfWheels) {
        this.numOfWheels = NumOfWheels;
        System.out.println("Number of wheels has been set");
    }


    public abstract void whatAmI();
}
