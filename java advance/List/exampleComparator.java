import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class exampleComparator {
    public static void main(String[] args) {
        Food burger = new Food("Big Wac", 450);
        Food fries = new Food("French fries", 275);
        Food cheeseburger = new Food("Cheeseburger", 300);
        Food sunday = new Food("Chocolate Sunday", 175);

        List<Food> lunch = new ArrayList<>();
        lunch.add(burger);
        lunch.add(fries);
        lunch.add(cheeseburger);
        lunch.add(sunday);

        //Collections.sort(lunch, (food1, food2) -> food1.getCalories() - food2.getCalories());

        Comparator<Food> comparator = new Comparator<Food>() {
            @Override
            public int compare(Food food1, Food food2) {
                return food1.getName().compareTo(food2.getName());
            }
        };

        // Tri de la liste en utilisant le comparateur
        Collections.sort(lunch, comparator);

        // Affichage de la liste triée
        System.out.println("Sorted by name: " + lunch);
    }
}
