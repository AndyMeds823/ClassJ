package Ex2;

public abstract class Animal {
    String name = "";

    public Animal(String name) {
        this.name = name;
    }

    public abstract void greets();
}
