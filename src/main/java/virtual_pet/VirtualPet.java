package virtual_pet;


    public class VirtualPet {
        private String petName;
        private int hungerLevel;
        private int thirstLevel;
        private int boredomLevel;


        public VirtualPet(String petName, int hungerLevel, int thirstLevel, int boredomLevel) {
            this.petName = petName;
            this.hungerLevel = hungerLevel;
            this.thirstLevel = thirstLevel;
            this.boredomLevel = boredomLevel;

        }

        public String getName() {
            return petName;
        }


        public int getHungerLevel() {
            return hungerLevel;
        }


        public int getThirstLevel() {
            return thirstLevel;
        }

        public int getBoredomLevel() {
            return boredomLevel;
        }

        public void feed() {
            hungerLevel -= 5;


        }

        public void thirst() {
            thirstLevel -= 3;

        }

        public void boredom() {
            boredomLevel -= 4;
        }

        public void tick() {
            hungerLevel++;
            boredomLevel++;
            thirstLevel++ ;
        }





        public boolean isAlive() {

            if (hungerLevel > 10 || thirstLevel > 10 || boredomLevel > 10) {
                return false;
            }
            return true;
        }
        public void status () {
            System.out.println("hunger: " + hungerLevel + " thirst: " + thirstLevel + " boredom: " + boredomLevel);
        }
    }


