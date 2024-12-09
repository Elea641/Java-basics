import java.util.Random; 

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void feed() {
        System.out.println("Chomp chomp");
    }

    @Override
    public void play() {
        System.out.println("Meow!");
    }

    @Override
    public boolean pet() {
        Random random = new Random();
        boolean agrees = random.nextBoolean();
        if (agrees) {
            System.out.println("Purr purr");
        } else {
            System.out.println("...");
        }
        return agrees;
    }

    @Override
    public String toString() {
        return "Duck{name='" + getName() + "', age=" + getAge() +"}";
    }

    public static void main(String[] args) {
        Cat meow = new Cat("Nekonya", 2);
        System.out.println(meow);
    }
}