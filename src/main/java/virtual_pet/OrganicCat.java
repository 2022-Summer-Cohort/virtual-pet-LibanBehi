package virtual_pet;

public class OrganicCat extends OrganicPet{
    public OrganicCat(String name, int hungerLevel, int thirstLevel, int boredomLevel, int cleanliness) {
        super(name, hungerLevel, thirstLevel, boredomLevel, cleanliness);
    }


    @Override
    public void greeting() {
        System.out.println("Organic cat " + petName + " I Am a Organic Pet!" + " My Hunger Level Is " + hungerLevel + " My Boredom Level Is " + boredomLevel + " My Litter Box is " + cleanliness + "My thirst Level is" + thirstLevel );
    }
}

