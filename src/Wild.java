public abstract class Wild extends Animal{
    boolean isPredator;

    public Wild(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color);
        this.isPredator=isPredator;
    }

}
