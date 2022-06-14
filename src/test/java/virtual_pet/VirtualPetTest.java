package virtual_pet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VirtualPetTest {
    private VirtualPet underTest = new RoboticDog("Ramadan", 7, 7);

    @BeforeEach
    void setUp() {


    }

    @Test
    void feedDecreaseTest() {
        assertEquals(10, underTest.getBoredomLevel());
        underTest.boredom();
        assertEquals(6, underTest.getBoredomLevel());
        underTest.boredom();
        assertEquals(2, underTest.getBoredomLevel());
        underTest.boredom();
    }

    @Test
    void thirstDecreaseTest() {
        assertEquals(10, underTest.getThirstLevel());
        underTest.thirst();
        assertEquals(7, underTest.getThirstLevel());
        underTest.thirst();
        assertEquals(4, underTest.getThirstLevel());
        underTest.thirst();
    }

    @Test
    void boredomDecreaseTest() {
        assertEquals(10, underTest.getBoredomLevel());
        underTest.boredom();
        assertEquals(6, underTest.getBoredomLevel());
        underTest.boredom();
        assertEquals(2, underTest.getBoredomLevel());
        underTest.boredom();

    }

    @Test
    void tickIncreaseByOneTest() {
        assertEquals(10, underTest.getBoredomLevel());
        underTest.tick();
        assertEquals(11, underTest.getThirstLevel());
        underTest.tick();
        assertEquals(12, underTest.getHungerLevel());
        underTest.tick();
    }
}

