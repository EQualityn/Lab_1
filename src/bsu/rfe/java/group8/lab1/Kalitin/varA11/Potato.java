package bsu.rfe.java.group8.lab1.Kalitin.varA11;

public class Potato extends Food {
    public Potato(String name) {//Fried, boiled, fries
        super(name);
    }
    @Override
    public void consume() {
        System.out.println(this + " съедено");
    }
}
