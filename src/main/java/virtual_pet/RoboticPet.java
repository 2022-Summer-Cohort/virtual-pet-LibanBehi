package virtual_pet;

public abstract class RoboticPet extends VirtualPet {
    protected int oilLevel;
    protected int maintenanceLevel;



    public int getOilLevel() {
        return oilLevel;
    }

    public int getMaintenanceLevel() {
        return maintenanceLevel;
    }

    public RoboticPet(String petName, int oilLevel, int maintenanceLevel){
        super(petName);
        this.oilLevel = oilLevel;
        this.maintenanceLevel = maintenanceLevel;
    }

    public void MaintainRobots() {
        maintenanceLevel = 7;
    }

    public void oilRobots() {
        oilLevel = 5;
    }

}

