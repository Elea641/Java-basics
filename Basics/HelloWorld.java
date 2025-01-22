import java.util.Arrays;

class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World ");

        // String name = "Elea";
        // int iterator = 0;

        // if (name.equals("Elea") && name.length() < 6) {
        // System.out.println("It's me!");
        // } else {
        // System.out.println("Not me !");
        // }

        // while (name.length() < 6) {
        // name += "a";
        // System.out.println(name.charAt(iterator));
        // iterator++;
        // }

        // for(int i = 0; i < name.length(); i++) {
        // System.out.println(name.charAt(i));
        // }

        // String[] weapons = new String[] {"whip", "gun", "saber"};
        // String[] weaponsIndiana = {"whip", "gun", "saber"};
        // String[] weaponsHelen = {"knife", "shield"};
        // String[] weaponsRavenwood = {"belt", "dagger", "gun", "shield"};
        // String[][] weapons;
        // int[] array = {2, 4, 1, 0, 8, 5};
        // String[] weapons = {"whip", "gun", "saber"};

        // System.out.println(Arrays.toString(weapons[0])); // [whip, gun, saber]
        // System.out.println(Arrays.toString(weapons[1])); // [knife, shield]
        // System.out.println(Arrays.toString(weapons[2])); // [belt, dagger, gun,
        // shield]

        // System.out.println(weapons[0][0]); // affiche whip;
        // System.out.println(weapons[0][2]); // affiche saber;
        // System.out.println(weapons[1][1]); // affiche shield;
        // System.out.println(weapons[2][2]); // affiche gun;

        // System.out.println(weapons[0]); // affiche : whip
        // System.out.println(weapons[1]); // affiche : gun
        // System.out.println(weapons[2]); // affiche : saber

        // weapons[2] = "sword";
        // System.out.println(Arrays.toString(weapons));

        // Arrays.sort(array);
        // System.out.println(Arrays.toString(array)); // [0, 1, 2, 4, 5, 8]

        // Arrays.sort(weapons);
        // System.out.println(Arrays.toString(weapons)); // [gun, saber, whip]

        // for (int i = 0; i < weapons.length; i++) {
        // System.out.println(weapons[i]); // affiche l'arme à la position i
        // }

        // for (String weapon : weapons) {
        // System.out.println(weapon); // affiche l'arme
        // }

        // weapons = new String[][] {
        // weaponsIndiana,
        // weaponsHelen,
        // weaponsRavenwood
        // };

        // String[] moviesArray = {
        // "Raiders of the Lost Ark",
        // "Indiana Jones and the Temple of Doom",
        // "Indiana Jones and the Last Crusade",
        // "Indiana Jones and the Kingdom of he Crystal Skulls"
        // };

        // String[] moviesArray2 = new String[moviesArray.length + 2];

        // for(int i = 0; i < moviesArray.length; i++) {
        // moviesArray2[i] = moviesArray[i];
        // }

        // int lastPreviousIndex = moviesArray.length - 1;

        // moviesArray2[lastPreviousIndex + 1] = "Indiana Jones and the Fate of
        // Atlantis";
        // moviesArray2[lastPreviousIndex + 2] = "Indiana Jones and Facebook's Personal
        // Data";

        // String[] moviesArray2 = Arrays.copyOf(moviesArray, moviesArray.length + 2);

        // int lastPreviousIndex = moviesArray.length - 1;

        // moviesArray2[lastPreviousIndex + 1] = "Indiana Jones and the Fate of
        // Atlantis";
        // moviesArray2[lastPreviousIndex + 2] = "Indiana Jones and Facebook's Personal
        // Data";

        // for (String movie : moviesArray2) {
        // System.out.println(movie);
        // }
    }
}
