import java.util.Arrays;

public class ConvertLong {

    // 15328
    // [1,5,3,2,8]
    // i + index = 5
    public static void main(String[] var0) {
        decompose();
    }

    public static int[] decompose() {
        int entier = 15328;
        int[] resultFinal = new int[5];

        for (int i = 5; i > 0; i--) {
            double divisor = Math.pow(10, i - 1);

            int result = entier / (int) divisor;
            resultFinal[5 - i] += result;
            entier = entier - result * (int) divisor;

        }

        String[] test = Arrays.stream(resultFinal).mapToObj(Integer::toString).toArray(String[]::new);
        System.out.println(String.join(",", test));

        return resultFinal;
    }
}
