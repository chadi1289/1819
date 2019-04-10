package ro.ubb.dp1819.lab1.exercises;

import java.util.Objects;

public class DataIngredients {
    private int quantity;
    private String unit;
    private String ingredient;
    private String adjective;

    public DataIngredients(int quantity, String unit, String ingredient, String adjective) {
        this.quantity = quantity;
        this.unit = unit;
        this.ingredient = ingredient;
        this.adjective = adjective;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "DataIngredients{" +
                "quantity=" + quantity +
                ", unit='" + unit + '\'' +
                ", ingredient='" + ingredient + '\'' +
                ", adjective='" + adjective + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataIngredients that = (DataIngredients) o;
        return quantity == that.quantity &&
                Objects.equals(unit, that.unit) &&
                Objects.equals(ingredient, that.ingredient) &&
                Objects.equals(adjective, that.adjective);
    }
}
