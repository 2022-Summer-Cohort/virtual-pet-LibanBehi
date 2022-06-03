package virtual_pet;

import virtual_pet.VirtualPet;

import java.util.ArrayList;

public class VirtualPetShelter {
    private ArrayList<VirtualPet> shelter;

    public VirtualPetShelter() {
        shelter = new ArrayList<>();
        shelter.add(new VirtualPet("ramadan", 7, 2, 3));
        shelter.add(new VirtualPet("Gaajo", 9, 6, 4));
        shelter.add(new VirtualPet("Loki", 4, 1, 6));

    }

    public void adoptPet() {
        for (VirtualPet pet : shelter) {
            pet.getName();
        }
    }

    public void admitPet(VirtualPet Pet) {
        shelter.add(Pet);

    }

    public void showAllPetStatus() {
        for (VirtualPet pet : shelter) {
            pet.status();
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
}