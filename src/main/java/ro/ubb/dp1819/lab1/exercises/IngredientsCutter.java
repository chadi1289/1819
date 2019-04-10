package ro.ubb.dp1819.lab1.exercises;

public class IngredientsCutter {
    private int wordCounter;
    boolean numberWords(String s){
        String[] arr = s.split(" ");
        wordCounter = 0;
        for ( String ss : arr) {
            wordCounter++;

        }
        if (wordCounter == 3 || wordCounter == 4) {
            return true;
        } else {
            return false;
        }
    }
}
