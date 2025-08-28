public class Cafe {
    private MenuItem menuItem1;
    private MenuItem menuItem2;
    private MenuItem menuItem3;
    private Order currentOrder;

    // Add menu items
    public void addMenuItem1(MenuItem item) {
        this.menuItem1 = item;
    }
    public void addMenuItem2(MenuItem item) {
        this.menuItem2 = item;
    }
    public void addMenuItem3(MenuItem item) {
        this.menuItem3 = item;
    }
    public void placeOrder(Order order) {
        this.currentOrder = order;
        currentOrder.calculateTotal();
    }
    public void displayMenu() {
        System.out.println("Sara's Menu ");
        if (menuItem1 != null) menuItem1.displayItemInfo();
        if (menuItem2 != null) menuItem2.displayItemInfo();
        if (menuItem3 != null) menuItem3.displayItemInfo();
        System.out.println("-------------------");
    }
}

