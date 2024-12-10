public class Duck {

    private String name;
    private int age;
    private boolean swimming;

    public Duck(String name) {
        this.name = name;
        this.age = 0;
        this.swimming = false;
    }

    public Duck(String name, int age) {
        this.name = name;
        this.age = age;
        this.swimming = false;
    }

    public String nameAndAge() {
        return "My name is " + this.getName() + " and I'm " + String.valueOf(this.getAge());
    }

    @Override
    public String toString() {
        return "Duck{name='" + name + "', age=" + age + ", swimming=" + swimming + "}";
    }

    public static String quack() {
        return "Quack!";
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSwimming() {
        return this.swimming;
    }

    public static void main(String[] args) { 
        // Duck donald = new Duck("Donald", 84);
        // Duck mysterMask = new Duck("Myster Mask");
        // Duck albertColvert = mysterMask;
        // System.out.println(albertColvert);
        // Duck fifi = new Duck("Fifi", 8);
        // int age = fifi.age; // error: age has private access in Duck
        // System.out.println(fifi.getAge());
        // Duck fifi = new Duck("Fifi", 8);
        // fifi.setAge(9); // 9;
        // System.out.println(fifi.getAge());
        // Duck loulou = new Duck("Loulou", 8);
        // loulou.nameAndAge();
        // System.out.println(loulou.nameAndAge());
        System.out.println(Duck.quack());
    }
}



