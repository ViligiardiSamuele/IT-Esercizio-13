package esercizio.cocktail.comparators;

import esercizio.cocktail.Cocktail;

import java.util.Comparator;

public class CocktailPrezzoComparator implements Comparator<Cocktail> {
    @Override
    public int compare(Cocktail o1, Cocktail o2) {
        return (int)(o1.getPrice() - o2.getPrice());
    }
}
