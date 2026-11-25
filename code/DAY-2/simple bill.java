class SimpleBill {
    public static void main(String[] args) {
        double itemPrice = 19.99;
        int quantity = 3;
        double taxRate = 0.08;

        double subtotal = itemPrice * quantity;
        double taxAmount = subtotal * taxRate;
        double finalBill = subtotal + taxAmount;

        System.out.printf("Subtotal: %.2f%n", subtotal);
        System.out.printf("Tax amount (%.0f%%): %.2f%n", taxRate * 100, taxAmount);
        System.out.printf("Final bill: %.2f%n", finalBill);
    }
}
