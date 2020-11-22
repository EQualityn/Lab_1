package bsu.rfe.java.group8.lab1.Kalitin.varA11;

public class Cheese extends Food{
    public Cheese(String type)
    {
        super("Сыр");
    }
   public int calculatecalories()
   {
       return 100;
   }
        public void consume() {
        System.out.println(this.name+ " Калорийности " + calculatecalories() + " съедено");
    }

}
