package virtual_pet;


public abstract class VirtualPet {
    protected String petName;
    protected int hungerLevel;
    protected int thirstLevel;
    protected int boredomLevel;

    public String getPetName() {
        return petName;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public int getBoredomLevel() {
        return boredomLevel;
    }

    public VirtualPet(String name) {
        petName = name;
    }

    public String getName() {
        return petName;
    }

    public void feed() {
        hungerLevel -= 5;


    }

    public void thirst() {
        thirstLevel -= 3;

    }

    public void boredom() {
        boredomLevel -= 4;
    }

    public void tick() {
        hungerLevel++;
        boredomLevel++;
        thirstLevel++;

    }

    public boolean isAlive() {

        if (hungerLevel > 10 || thirstLevel > 10 || boredomLevel > 10) {
            return false;
        }
        return true;
    }

    public abstract void greeting();






    }



