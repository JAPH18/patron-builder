package exemple.model.modifie;

public class Directeur {

    //contruire pizza reine
    public Pizza construirePizzaPiquante() {
        MonteurPizza pizzap=new MonteurPizzaPiquante();

        return pizzap.getPizza();
    }
    //contruire pizza Piquante
        public Pizza construirePizzaReine() {
            MonteurPizza pizzaReine=new MonteurPizzaReine();

            return pizzaReine.getPizza();
        }
    //contruire pizza Vegetarienne
        public Pizza construirePizzaVegetarienne() {
            MonteurPizza pizzaVegetarienne=new MonteurPizzaVegetarienne();

            return pizzaVegetarienne.getPizza();
        }

}
