package bsu.rfe.java.group8.lab1.Kalitin.varA11;

public class Potato extends Food {
   String type=null;
    public Potato(String size)
    {
        super("Potato");
        this.type = type;
    }

    public Potato() {
        super("Potato");
    }
    @Override
    public boolean equals(Object potato) {
        if (super.getName().equals(((String[])potato)[0])){      // является ли аргумент arg0 экземпляром класса Food
            if(((String[])potato).length == 2)
            {
                return this.type.equals(((String[])potato)[1]);
            }
            return true;
        }
        return  false;

    }
    @Override
    public void consume() {
        System.out.println(this + " съедено");
    }
}
