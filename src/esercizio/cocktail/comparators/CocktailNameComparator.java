package esercizio.cocktail.comparators;

import esercizio.cocktail.Cocktail;

import java.util.Comparator;

public class CocktailNameComparator implements Comparator<Cocktail> {
    @Override
    public int compare(Cocktail o1, Cocktail o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
}