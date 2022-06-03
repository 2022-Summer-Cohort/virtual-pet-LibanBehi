package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        VirtualPet phantom = new VirtualPet("Phantom", 8, 6, 7);
        VirtualPetShelter shelter = new VirtualPetShelter();
        shelter.admitPet(phantom);
        shelter.feedAll();
        shelter.waterAll();
        shelter.playAll();
        shelter.adoptPet();
        shelter.tick();

        Scanner input = new Scanner(System.in);
        while (phantom.isAlive()) {
            shelter.showAllPetStatus();


            System.out.println("enter selection : Feed|Water|Play|Quit");
            String userSelection = input.nextLine();
            switch (userSelection.toLowerCase()) {
                case "feed":
                    shelter.feedAll();
                    break;

                case "water":
                    shelter.waterAll();
                    break;

                case "play":
                    shelter.playAll();
                    break;

                case "quit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Selection error Game over");
            }


        }

    }

}
