public class Food implements Comparable<Food> {
    private String name;
    private int calories;

    public Food(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public int compareTo(Food food) {
        return this.getName().compareTo(food.getName());  
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name; 
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Food{name='" + name + "', calories=" + calories + '}';
    }
}
