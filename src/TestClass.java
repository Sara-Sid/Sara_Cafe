 class TestCafe {
    public static void main(String[] args) {

        Cafe cafe = new Cafe();

        MenuItem latte = new MenuItem("Vanilla Latte ", 3.50 ,  "Beverage ");
        MenuItem muffin = new MenuItem("Blueberry and cheese muffin ", 3.00 ,  "Food ");
        MenuItem sandwich = new MenuItem("Egg, Bacon and Cheese ", 5.00 ,  "Food ");

        cafe.addMenuItem1(latte);
        cafe.addMenuItem2(sandwich);
        cafe.addMenuItem3(muffin);


        cafe.displayMenu();


        Order order = new Order();
        order.addItem1(latte);
        order.addItem2(muffin);

        cafe.placeOrder(order);

        order.displayOrderDetails();
    }
}

