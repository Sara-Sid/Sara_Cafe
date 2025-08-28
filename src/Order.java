public class Order {
    private MenuItem item1;
    private MenuItem item2;
    private MenuItem item3;
    private double totalAmount;

    public void addItem1(MenuItem item) {
        this.item1 = item;
    }
    public void addItem2(MenuItem item) {
        this.item2 = item;
    }
    public void addItem3(MenuItem item) {
        this.item3 = item;
    }
    public void calculateTotal() {
        totalAmount = 0; // reset before calculation
        if (item1 != null) totalAmount += item1.getPrice();
        if (item2 != null) totalAmount += item2.getPrice();
        if (item3 != null) totalAmount += item3.getPrice();
    }
    public void displayOrderDetails() {
        System.out.println("Order Details:");
        if (item1 != null) item1.displayItemInfo();
        if (item2 != null) item2.displayItemInfo();
        if (item3 != null) item3.displayItemInfo();
        System.out.println("Total: $" + totalAmount);
    }
}


