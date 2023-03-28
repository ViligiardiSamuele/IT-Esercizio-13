package esercizio.cocktail.comparators;

import esercizio.cocktail.CocktailAlcolico;

import java.util.Comparator;

public class GradoAlcolicoComparator implements Comparator<CocktailAlcolico> {
    @Override
    public int compare(CocktailAlcolico o1, CocktailAlcolico o2) {
        if(o1.getGrad() > o2.getGrad()) return 1;
        else if(o1.getGrad() < o2.getGrad()) return -1;
        return 0;
    }
}
