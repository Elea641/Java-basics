public class Fizzbuzz {
    public String concatString(int input) {
        String result = "";

        for (int i = 1; i <= input; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result += "FizzBuzz";
            }

            if (i % 3 == 0) {
                result += "Fizz";
            }

            if (i % 5 == 0) {
                result += "Buzz";
            }

            result += i;
        }

        return result;
    }

    public static void main(String[] args) {
        Fizzbuzz fizzbuzz = new Fizzbuzz();

        System.out.println(fizzbuzz.concatString(20));
    }
}
