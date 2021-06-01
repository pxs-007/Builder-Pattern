package Builder;

public class SubMealBuilderA extends MealBuider{
    @Override
    public void buildFood() {
        meal.setFood("一个鸡肉卷");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("一杯可乐");
    }
}
