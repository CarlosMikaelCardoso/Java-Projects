public class Main{
    public static void main(String[] args){
        Pizza pizza = new Pizza("Thicc crust", "Tomato", "Mozzarella");

        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.Bread);
        System.out.println(pizza.Sauce);
        System.out.println(pizza.Cheese);
        System.out.println(pizza.Topping);

    }
}