import java.util.ArrayList;

public class FluxDeControle {

    public static void main(String[] var0) {
        int var1 = 1;
        int var2 = 10;
        int increment = 1;
        ArrayList<String> result = new ArrayList<>();

        while (increment <= var2) {
            result.add(String.valueOf(var1) + " " + String.valueOf(increment));
            increment++;
        }
        System.out.println(result);
    }
}
