
import org.junit.jupiter.api.Test;
import virtual_pet.VirtualPet;
import virtual_pet.VirtualPetShelter;



import static org.junit.jupiter.api.Assertions.assertEquals;


public class VirtualPetShelterTest {


    @Test
    void shouldFeedAllPets() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.feedAll();
        assertEquals(2,underTest.getPet(0).getHungerLevel());

    }
    @Test
    void shouldWaterAllPets(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.waterAll();
        assertEquals(3,underTest.getPet(0).getThirstLevel());
    }
    @Test
    void shouldPlayAllPets(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.playAll();
        assertEquals(4,underTest.getPet(0).getBoredomLevel());
    }
}
