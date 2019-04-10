package ro.ubb.dp1819.lab1.exercises;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String [ ] args) {
        FileIn fileIn = new FileIn();
        IngredientsCutter cutter = new IngredientsCutter();

        List<String> listString = fileIn.fileToStringList();

        for (String ingredient : listString) {
            if (cutter.numberWords(ingredient)) {
                System.out.println(ingredient);
            }

        }

        CoffeeFactory cf = new CoffeeFactory();
        Scanner sc = new Scanner(System.in);
        System.out.println("Coffee ingredients:");
        String str = sc.nextLine();
        if (str != null) {
            System.out.println(cf.namedCoffee(str));
        }
    }
}
