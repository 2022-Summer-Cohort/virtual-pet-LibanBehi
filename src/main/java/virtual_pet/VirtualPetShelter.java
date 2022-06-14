package virtual_pet;

import virtual_pet.VirtualPet;

import java.util.ArrayList;

public class VirtualPetShelter {
    private ArrayList<VirtualPet> shelter;

    public VirtualPetShelter() {
        shelter = new ArrayList<>();
        shelter.add(new RoboticDog(" Ramadan", 7, 4));
        shelter.add(new RoboticCat(" Gaajo", 9, 6));
        shelter.add(new OrganicDog(" Loki", 4, 8, 6, 4));
        shelter.add(new OrganicCat("Spots", 4, 8, 6, 4));


    }

    public void adoptPet(String name) {
        shelter.remove(findPetByName(name));
    }


    public void admitPet(VirtualPet Pet) {
        shelter.add(Pet);

    }

    public void showAllPetStatus() {
        for (VirtualPet pet : shelter) {
            pet.greeting();
        }
    }

    public void feedAll() {
        for (VirtualPet pet : shelter) {
            pet.feed();
        }

    }

    public void waterAll() {
        for (VirtualPet pet : shelter) {
            pet.thirst();
        }
    }

    public void playAll() {
        for (VirtualPet pet : shelter) {
            pet.boredom();

        }

    }

    public void tick() {
        for (VirtualPet pet : shelter) {
            pet.tick();
        }
    }

    public VirtualPet getPet(int index) {
        return shelter.get(index);
    }

    public VirtualPet findPetByName(String name) {
        for (VirtualPet pet : shelter) {
            if (pet.getName().equalsIgnoreCase(name)) {
                return pet;
            }
        }
        return null;
    }

    public void listPetsByType(String type) {
        for (VirtualPet pet : shelter) {
            if (type.equalsIgnoreCase("robotic")) {
                if (pet instanceof RoboticPet) {
                    System.out.print(pet.getPetName() + ", ");
                }
            } else {
                if (pet instanceof OrganicPet) {
                    System.out.print(pet.getPetName() + ", ");
                }

            }
            System.out.println("");
        }
    }

    public void walk() {
        for (VirtualPet pet : shelter) {
            if (pet instanceof Walking) {
                ((Walking) pet).walk();
            }


        }
    }

    public void MaintainRobots() {
        for (VirtualPet pet : shelter) {
            if (pet instanceof RoboticPet) {
                ((RoboticPet) pet).MaintainRobots();
            }
        }
    }

    public void oilRobots() {
        for (VirtualPet pet : shelter) {
            if (pet instanceof RoboticPet) {
                ((RoboticPet) pet).oilRobots();
            }
        }
    }

    public void CleanCage() {
        for (VirtualPet pet : shelter) {
            if (pet instanceof OrganicDog) {
                ((OrganicDog) pet).CleanCage();
            }


        }

    }

    public void CleanLitterBox() {
        for (VirtualPet pet : shelter) {
            if (pet instanceof OrganicCat) {
                ((OrganicCat) pet).CleanLitterBox();
            }

        }

    }
}