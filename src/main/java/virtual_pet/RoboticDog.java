package virtual_pet;

public class RoboticDog extends RoboticPet implements Walking {

    public RoboticDog(String petName, int oilLevel, int maintenanceLevel) {
        super(petName, oilLevel,maintenanceLevel);
    }

    @Override
    public void greeting() {
        System.out.println("Robotic dog" + petName + " I Am a Robotic Pet!" + " My Oil Level Is " + oilLevel + " My Maintenance Level Is " + maintenanceLevel );
    }

    @Override
    public void walk() {
        boredomLevel--;
        maintenanceLevel++;
        oilLevel++;

    }


    }