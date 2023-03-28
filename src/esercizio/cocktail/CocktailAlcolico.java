package esercizio.cocktail;

import esercizio.Componente;

import java.util.List;

public class CocktailAlcolico extends Cocktail {
    protected double grad;
    public static double FATTORE_COSTANTE = 10;
    public CocktailAlcolico(String name, List<Componente> components, double grad) {
        super(name, components);
        this.grad = grad;
    }

    public CocktailAlcolico(String name, double grad) {
        super(name);
        this.grad = grad;
    }

    public double getGrad() {
        return grad;
    }

    public void setGrad(double grad) {
        this.grad = grad;
    }

}
