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
        shelter.tick();

        Scanner input = new Scanner(System.in);
        while (phantom.isAlive()) {
            shelter.showAllPetStatus();


            System.out.println("enter selection : Feed|Water|Play|Adopt|Admit|Quit");
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
                case "adopt":
                    String name;
                    System.out.println("which pet would you want to adopt");
                    name = input.nextLine();
                    shelter.adoptPet(name);
                    break;
                case "admit":
                    System.out.println("enter the name of pet admitted");
                    String petName = input.nextLine();
                    VirtualPet pet1 = new VirtualPet(petName,5,5,5);
                    shelter.admitPet(pet1);
                    break;

                default:
                    System.out.println("Selection error Game over");
            }



        }

    }

}
