package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        VirtualPet phantom = new RoboticDog(" Phantom", 8, 6);
        VirtualPetShelter shelter = new VirtualPetShelter();
        shelter.admitPet(phantom);
        shelter.feedAll();
        shelter.waterAll();
        shelter.playAll();
        shelter.tick();
        Scanner input = new Scanner(System.in);
        while (phantom.isAlive()) {
            shelter.showAllPetStatus();


            System.out.println("Enter Selection : Feed|Water|Play|Adopt|Admit|Oil Robots|Maintain Robots|Clean Litter|Clean Cage|Walk|Quit");
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
                    System.out.println("Which Pet Would You Want To Adopt");
                    String petName;
                    petName = input.nextLine();
                    shelter.adoptPet(petName);
                    break;
                case "admit":
                    System.out.println("Enter The Name and Type Of Pet Admitted ");
                    petName = input.nextLine();
                    VirtualPet pet1 = new RoboticCat(petName, 5, 5);
                    shelter.admitPet(pet1);
                    break;
                case "walk":
                    shelter.walk();
                    break;
                case "oil robots":
                    shelter.oilRobots();
                    break;
                case "maintain robots":
                    shelter.MaintainRobots();
                    break;
                case "clean cage":
                    shelter.CleanCage();
                    break;
                case "clean litter":
                    shelter.CleanLitterBox();
                    break;

                default:
                    System.out.println("Selection error Game over");
            }
        }
    }
}






