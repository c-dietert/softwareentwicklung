package de.fham.softwareentwicklung.drei.recipe;

import java.util.List;

public class Chef {

    public List<Ingredient> getIngridientsForOnePortion(List<Ingredient> ingredients, int portions) {

        for (int i = 0; i < ingredients.size(); i++) {
            ingredients.get(i).weight = ingredients.get(i).weight / portions;
        }
        return ingredients;
    }
}
