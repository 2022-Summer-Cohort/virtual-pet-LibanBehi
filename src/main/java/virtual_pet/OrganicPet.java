package virtual_pet;

public abstract class OrganicPet extends VirtualPet {
    protected int cleanliness;


    public int getCleanliness() {
        return cleanliness;
    }


    public OrganicPet(String name, int hungerLevel, int thirstLevel, int boredomLevel, int cleanliness) {
        super(name);
        this.cleanliness = cleanliness;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.boredomLevel = boredomLevel;

    }

    @Override
    public void tick() {
        super.tick();
        cleanliness--;

    }

    public void CleanCage() {
        cleanliness = 4;
    }

    public void CleanLitterBox() {
        cleanliness = 6;
    }

}






