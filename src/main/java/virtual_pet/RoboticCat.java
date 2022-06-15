package virtual_pet;

public class RoboticCat extends RoboticPet {

    public RoboticCat(String petName, int oilLevel, int maintenanceLevel) {
        super(petName, oilLevel, maintenanceLevel);

    }

    @Override
    public void greeting() {
        System.out.println("Robotic cat" + petName + " I Am a Robotic Pet! " + "My oil level is " + oilLevel + " my Maintenance Level is " + maintenanceLevel);
    }


}


