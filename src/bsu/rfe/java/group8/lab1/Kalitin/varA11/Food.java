package bsu.rfe.java.group8.lab1.Kalitin.varA11;

    public abstract class Food implements Consumable {
        String name = null;
        public Food(String name)
        {
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }
