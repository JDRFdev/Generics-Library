package Library;

public class Dog extends Animal{
    public Dog(long ID, String name, String type) {
        super(ID, name, type);
    }

    @Override
    String noise() {
        return "I'm a dog";
    }
}
