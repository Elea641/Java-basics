import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        Food burger = new Food("Big Wac", 450);
        Food fries = new Food("French fries", 275);
        Food cheeseburger = new Food("Cheeseburger", 300);
        Food sunday = new Food("Chocolate Sunday", 175);

        HashSet<Food> lunch = new HashSet<>();
        lunch.add(burger);
        lunch.add(fries);
        lunch.add(cheeseburger);

        boolean addSunday = lunch.add(sunday); // true
        boolean addAgain = lunch.add(sunday); // false

        System.out.println("Sunday added first time: " + addSunday); 
        System.out.println("Sunday added again: " + addAgain);      
        System.out.println("Lunch set: " + lunch); 
    }
}
