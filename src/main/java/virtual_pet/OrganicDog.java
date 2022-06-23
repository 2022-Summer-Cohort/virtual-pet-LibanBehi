package virtual_pet;

public class OrganicDog extends OrganicPet implements Walking {


    public OrganicDog(String petName, int hungerLevel, int thirstLevel, int boredomLevel, int cleanliness) {
        super(petName, hungerLevel, thirstLevel, boredomLevel,cleanliness);
    }

    @Override
    public void walk() {
    cleanliness++;
    boredomLevel--;

    }
    @Override
    public void greeting() {
        System.out.println("Organic dog" + petName +  " I Am a Organic Pet!" + " My Boredom Level Is " + boredomLevel + " My Hunger Level is " + hungerLevel + " my Thirst Level is " + thirstLevel + " My Cage Cleanliness is "
        + cleanliness);
    }
}
