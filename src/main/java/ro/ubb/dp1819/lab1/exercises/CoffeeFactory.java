package ro.ubb.dp1819.lab1.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeFactory {
    private String espresso = "2 cups water + 0.25 cups coffee-beans roasted";
    private String cappuccino = "2 cups water + 0.25 cups coffee-beans roasted + 100ml foamed milk";
    private String americano = "4 cups water + 0.25 cups coffee-beans roasted";
    private String caffeLatte = "4 cups water + 0.75 cups coffee-beans roasted";

    public String namedCoffee (String coffeeName) {
        if (coffeeName.equals(espresso) ) {
            return "espresso";
        }
        if (coffeeName.equals(cappuccino)) {
            return "cappuccino";
        }
        if (coffeeName.equals(americano)) {
            return "americano";
        }
        if (coffeeName.equals(caffeLatte)) {
            return "caffee latte";
        }
        return "Wrong coffee ingredients";
    }
}
