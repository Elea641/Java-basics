import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {
        Food burger = new Food("Big Wac", 450);
        Food fries = new Food("French fries", 275);
        Food cheeseburger = new Food("Cheeseburger", 300);
        Food sunday = new Food("Chocolate Sunday", 175);

        // HashSet
        /*
        avec peu d'éléments : une ArrayList est plus performante qu'un HashSet
        au-delà de ce seuil, plus tu auras d'éléments, plus un HashSet sera performant face à une ArrayList
        */

        // HashSet<Food> lunch = new HashSet<>();
        // lunch.add(burger);
        // lunch.add(fries);
        // lunch.add(cheeseburger);

        // boolean addSunday = lunch.add(sunday); // true
        // boolean addAgain = lunch.add(sunday); // false

        // // System.out.println("Sunday added first time: " + addSunday); 
        // // System.out.println("Sunday added again: " + addAgain);      
        // // System.out.println("Lunch set: " + lunch); 

        // boolean removeBurger = lunch.remove(burger); // true
        // boolean removeAgain = lunch.remove(burger); 

        // System.out.println("Sunday removed first time: " + removeBurger); 
        // System.out.println("Sunday removed again: " + removeAgain);   
        // System.out.println("Lunch set: " + lunch); 

        // for (Food food : lunch) {
        // System.out.println(food.getName());
        // }

        // LinkedHashSet
        /* 
        éviter la duplication
        trier les éléments par ordre d'insertion. 
        */

        // LinkedHashSet<Food> lunch = new LinkedHashSet<>();
        // lunch.add(burger);
        // lunch.add(fries);
        // lunch.add(cheeseburger);
        // lunch.add(sunday);

        // for (Food food : lunch) {
        //     System.out.println(food.getName());
        // }

        // TreeSet
        /* 
        trier les éléments par valeur.
        */

    //    TreeSet<Food> lunch = new TreeSet<>();  
    //     lunch.add(burger);  
    //     lunch.add(fries);  
    //     lunch.add(cheeseburger);  
    //     lunch.add(sunday);  

        // for (Food food : lunch) {  
        // System.out.println(food.getName());  
        // }

        // first() and last()

        // Food first = lunch.first();  
        // Food last = lunch.last();

        // boolean containFirst = lunch.contains(first); // true
        // boolean containLast = lunch.contains(last); // true

        // System.out.println(containFirst); 
        // System.out.println(containLast); 

        // pollFirst() and pollLast()

        // Food first = lunch.pollFirst();
        // Food last = lunch.pollLast();

        // boolean containFirst = lunch.contains(first); // false
        // boolean containLast = lunch.contains(last); // false

        // System.out.println(containFirst); 
        // System.out.println(containLast); 

        // descendingSet()

        // for (Food food : lunch.descendingSet()) { 
        //     System.out.println(food.getName());
        // } 

        // subSet(E fromElement, E toElement)

        // for (Food food : lunch.subSet(cheeseburger, fries)) {  
        //     System.out.println(food.getName());  
        // }
    }
}
