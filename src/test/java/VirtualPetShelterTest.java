
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import virtual_pet.OrganicDog;
import virtual_pet.RoboticPet;
import virtual_pet.VirtualPet;
import virtual_pet.VirtualPetShelter;



import static org.junit.jupiter.api.Assertions.assertEquals;


public class VirtualPetShelterTest {


    @Test
    void shouldFeedAllPets() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.feedAll();
        assertEquals(2, underTest.getPet(0).getHungerLevel());

    }

    @Test
    void shouldWaterAllPets() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.waterAll();
        assertEquals(3, underTest.getPet(0).getThirstLevel());
    }

    @Test
    void shouldPlayAllPets() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.playAll();
        assertEquals(4, underTest.getPet(0).getBoredomLevel());
    }

    @Test
    void shouldOilRobotsWhenOiled() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.oilRobots();
        assertEquals(5, ((RoboticPet) underTest.getPet(0)).getOilLevel());
    }

    @Test
    void shouldMaintainRobots() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.MaintainRobots();
        assertEquals(7, ((RoboticPet) underTest.getPet(0)).getMaintenanceLevel());
    }

    @Test
    void shouldCleanCage(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.CleanCage();
        assertEquals(4,((OrganicDog)underTest.getPet(2)).getCleanliness());
    }
}

