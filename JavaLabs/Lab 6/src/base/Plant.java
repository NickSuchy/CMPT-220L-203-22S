package base;

public class Plant {
    boolean needsWatering;
    String plantFamily;
    String name;

    public Plant(boolean needsWatering, String plantFamily, String name){
        this.needsWatering = needsWatering;
        this.plantFamily = plantFamily;
        this.name = name;
        wateringInstructions();
        sunlightRequirements();
    }
    public void wateringInstructions(){
       if(needsWatering == true){
           System.out.println("The " + name + " needs to be watered");
       } else {
           System.out.println("The " + name + " does not need to be watered");
       }
    }
    public void sunlightRequirements(){
        if(plantFamily == "Shrub"){
            System.out.println("The " + name + " needs a lot of sunlight");
        } else {
            System.out.println("The " + name + " needs a moderate amount of sunlight");
        }
    }
}
