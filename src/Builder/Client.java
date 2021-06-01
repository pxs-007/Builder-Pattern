package Builder;

public class Client {
    public static void main (String[] args){
        MealBuider mb=new SubMealBuilderA();
        KFCWaiter waiter=new KFCWaiter();
        waiter.setMealBuilder(mb);
        Meal meal;
        meal = waiter.construct();
        System.out.println("套餐组成：");
        System.out.println(meal.getDrink());
        System.out.println(meal.getFood());
    }
}
