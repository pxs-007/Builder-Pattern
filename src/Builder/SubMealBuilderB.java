package Builder;

public class SubMealBuilderB extends MealBuider{
    @Override
    public void buildFood() {
        meal.setFood("一个汉堡");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("一杯奶茶");
    }
}
