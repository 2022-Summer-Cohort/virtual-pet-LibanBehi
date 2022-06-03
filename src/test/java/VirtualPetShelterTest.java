
import org.junit.jupiter.api.Test;
import virtual_pet.VirtualPet;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class VirtualPetShelterTest {


    @Test
    void shouldFeedAllPets() {
        ArrayList<VirtualPet> shelter = new ArrayList<>();
        shelter.add(new VirtualPet("ramadan", 7, 7, 9));
        shelter.add(new VirtualPet("Gaajo", 9, 6, 8));
        shelter.add(new VirtualPet("Loki", 4, 7, 6));
        assertEquals(9,shelter.get(1).getHungerLevel());

    }
    @Test
    void shouldWaterAllPets(){
        ArrayList<VirtualPet> shelter = new ArrayList<>();
        shelter.add(new VirtualPet("ramadan", 7, 8, 8));
        shelter.add(new VirtualPet("Gaajo", 9, 6, 4));
        shelter.add(new VirtualPet("Loki", 4, 7, 6));
        assertEquals(6,shelter.get(1).getThirstLevel());
    }
    @Test
    void shouldPlayAllPets(){
        ArrayList<VirtualPet> shelter = new ArrayList<>();
        shelter.add(new VirtualPet("ramadan", 7, 2, 3));
        shelter.add(new VirtualPet("Gaajo", 9, 6, 4));
        shelter.add(new VirtualPet("Loki", 4, 1, 6));
        assertEquals(4,shelter.get(1).getBoredomLevel());
    }
}
