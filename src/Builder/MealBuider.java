package Builder;

public abstract class MealBuider {
    Meal meal=new Meal();
    public abstract void buildFood();
    public abstract void buildDrink();
    public Meal getMeal(){
        return meal;
    }
}
