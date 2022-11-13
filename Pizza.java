/*
Create a class named Pizza that stores information about a
single pizza.
It should contain the following information about a pizza :
1. A private instance variables to store :
● The size of the pizza (either small , medium, large
)
● The number of cheese toppings ,
● The number of pepperoni toppings,
● The number of ham toppings
2. Constructor(s) that set all of the instance variables.
3. A public method named calcCost( ) that returns a
double that is the cost of the pizza. Pizza cost is
determined by:
● Small: 10ghc + 4ghc per topping
● Medium: 14ghc + 4ghc per topping
● Large: 16ghc + 4ghc per topping
4. public method named getDescription( ) that returns a
String containing the pizza size, quantity of each
topping.
*/

public class Pizza {
    enum Size{
        SMALL,
        MEDIUM,
        LARGE;
    }

    private boolean cheeseTop;
    private boolean pepTop;
    private boolean hamTop;

    public void cheeseTop(boolean cheeseTop) {
      this.cheeseTop = cheeseTop;
   }

    public boolean cheeseTop() {
        return cheeseTop;
    }

    public void pepTop(boolean pepTop) {
        this.pepTop = pepTop;
    }

    public boolean pepTop() {
        return pepTop;
    }

    public void hamTop(boolean hamTop) {
        this.hamTop = hamTop;
    }

    public boolean hamTop() {
        return hamTop;
    }
    
    Size pizzaSize;

    public void getSize(Size pizzaSize){
        this.pizzaSize = pizzaSize;
    }

    public void getDescription(Size pizzaSize, boolean cheeseTop,boolean hamTop, boolean pepTop){
      
        switch (pizzaSize){
            case SMALL:
            System.out.println("I ordered a small size pizza." + " Cheese Toppings: "+ cheeseTop + " Ham Toppings: " + hamTop + " Pepperoni Toppings: "+pepTop);
            break;

            case MEDIUM:
            System.out.println("I ordered a medium size pizza." + " Cheese Toppings: " + cheeseTop + " Ham Toppings: "
                    + hamTop + " Pepperoni Toppings: " + pepTop);
            break;

            case LARGE:
            System.out.println("I ordered a large size pizza." + " Cheese Toppings: " + cheeseTop + " Ham Toppings: "
                    + hamTop + " Pepperoni Toppings: " + pepTop);
            break;             

        }

    }

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza();
        pizza1.getDescription(Size.LARGE, true, true, false);
        pizza1.calcCost();
    }

    public double calcCost(){
        double cost = 0;

        if (pizzaSize == Size.SMALL){
            cost = 10;
            System.out.println("The cost is: " + cost);
        }

        if (pizzaSize == Size.MEDIUM){
              cost = 14;
              System.out.println("The cost is: " + cost);
            }
        if (pizzaSize == Size.LARGE) {
            cost = 16;
            System.out.println("The cost is: " + cost);

        }
        
        if (cheeseTop = true){
            cost += 4;
            System.out.println("The cost is: " + cost);
        }

        if (hamTop = true) {
            cost += 4;
            System.out.println("The cost is: " + cost);
        }

        if (pepTop = true) {
            cost += 4;
            System.out.println("The cost is: " + cost);
        }

        return cost;
    }
}
