package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        VirtualPet phantom = new VirtualPet("Phantom", 5, 3, 4);


        Scanner input = new Scanner(System.in);
        while (phantom.isAlive()) {
            phantom.status();

            System.out.println("enter selection : Feed|Water|Play|Quit");
            String userSelection = input.nextLine();
            switch (userSelection.toLowerCase()) {
                case "feed":
                    phantom.feed();
                    break;

                case "water":
                    phantom.thirst();
                    break;

                case "play":
                    phantom.boredom();
            }
        }


        //Interact with a virtual_pet.VirtualPet object in this method
    }

}
